package by.gsu.lesson17.accounts;

/**
 * @author vasiliy.pispanen.
 */
public class OperationsMain {
    public static void main(String[] args) {
        Account ac1 = new Account(500);
        Account ac2 = new Account(700);

        Thread op1 = new Thread(new Operations(ac1, ac2, 400));
        Thread op2 = new Thread(new Operations(ac2, ac1, 1000));

        op1.start();
        op2.start();

    }
}
