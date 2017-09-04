package by.gsu.lesson17;

/**
 * @author vasiliy.pispanen.
 */
public class JoinExample {
    private static volatile int x = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println(" t1 start");
            sleep();
            x++;
            System.out.println(" t1 finish");
        });

        Thread t2 = new Thread(() -> {
            System.out.println(" t1 start");
            sleep();
            x++;
            System.out.println(" t1 finish");
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(x);
        System.out.println("main finish");

    }

    public static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
