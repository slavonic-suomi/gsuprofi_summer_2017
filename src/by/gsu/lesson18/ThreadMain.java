package by.gsu.lesson18;

/**
 * @author vasiliy.pispanen.
 */
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean localInterrupted = false;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    localInterrupted = true;
                }
                if (!localInterrupted) {
                    System.out.println("success!");
                }

            }
        });

        t1.start();
//        t1.stop();
        t1.interrupt();
    }
}
