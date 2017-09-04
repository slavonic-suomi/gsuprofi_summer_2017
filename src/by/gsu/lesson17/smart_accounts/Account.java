package by.gsu.lesson17.smart_accounts;

/**
 * @author vasiliy.pispanen.
 */
public class Account {
    private volatile int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public void deposit(int count) {
        amount += count;
    }

    public void withdraw(int count) {
        if (amount >= count) {
            amount -=count;
        } else {
            throw new IllegalArgumentException("have not money!");
        }
    }
}
