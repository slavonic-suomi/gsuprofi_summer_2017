package by.gsu.lesson17.smart_accounts;

import java.util.Random;

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
        synchronized (to) {
            sleep();
            synchronized (from) {
                to.deposit(count);
                from.withdraw(count);
            }
        }
    }

    public static void sleep() {
        Random r = new Random();
        try {
            Thread.sleep(200 + r.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
