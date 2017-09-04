package by.gsu.lesson16.threads;

/**
 * @author vasiliy.pispanen.
 */
public class ThreadExample1Main {
    public static void main(String[] args) {
        System.out.println("thread0 start");
        Thread t1 = new CustomThread("thread1");
        Thread t2 = new CustomThread("thread2");

        t1.start();
        t2.start();

        Thread t3 = new Thread(new CustomRunnable());
        t3.start();


        System.out.println("thread0 finish");
    }

    public static class CustomThread extends Thread {
        private String name;

        public CustomThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(name + " start");

                    Thread.sleep(2500);

                    System.out.println(name + " finish");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class CustomRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("heya!");
        }
    }

}
