package by.gsu.lesson18.accounts;


import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author vasiliy.pispanen.
 */
public class CallableOperations implements Callable<Integer> {

    private Account from;
    private Account to;
    private int count;

    public CallableOperations(Account from, Account to, int count) {
        this.from = from;
        this.to = to;
        this.count = count;
    }

    @Override
    public Integer call() throws Exception {
        sleep();
        if (to.getLock().tryLock(getRandMilis(), TimeUnit.MILLISECONDS)) {
            try {
                sleep();
                if (from.getLock().tryLock(getRandMilis(), TimeUnit.MILLISECONDS)) {
                    try {
                        from.withdraw(count);
                        to.deposit(count);
                        return count;
                    } finally {
                        from.getLock().unlock();
                    }

                }
            } finally {
                to.getLock().unlock();
            }
        }
        throw new Exception("failed to get some lock");
    }

    public static void sleep() {
        try {
            Thread.sleep(getRandMilis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getRandMilis() {
        Random r = new Random();
        return 200 + r.nextInt(500);
    }
}
