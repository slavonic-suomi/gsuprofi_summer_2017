package by.gsu.lesson18.accounts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vasiliy.pispanen.
 */
public class Account {
    private volatile int amount;
    private Lock lock;

    public Account(int amount) {
        this.amount = amount;
        lock = new ReentrantLock();
    }

    public void deposit(int count) {
        amount += count;
    }

    public Lock getLock() {
        return lock;
    }

    public void withdraw(int count) {
        if (amount >= count) {
            amount -=count;
        } else {
            throw new IllegalArgumentException("have not money!");
        }
    }
}
