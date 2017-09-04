package by.gsu.lesson17.accounts;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author vasiliy.pispanen.
 */
public class Operations implements Runnable {
    private Account from;
    private Account to;
    private int count;

    public Operations(Account from, Account to, int count) {
        this.from = from;
        this.to = to;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            sleep();
            if (to.getLock().tryLock(getRandMilis(), TimeUnit.MILLISECONDS)) {
                try {
                    sleep();
                    if (from.getLock().tryLock(getRandMilis(), TimeUnit.MILLISECONDS)) {
                        try {
                            from.withdraw(count);
                            to.deposit(count);
                            System.out.println("success!");
                        } finally {
                            from.getLock().unlock();
                        }

                    } else {
                        System.out.println("failed to get from lock");
                    }
                } finally {
                    to.getLock().unlock();
                }
            } else {
                System.out.println("failed to get to lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
