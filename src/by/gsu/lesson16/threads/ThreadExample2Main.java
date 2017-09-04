package by.gsu.lesson16.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vasiliy.pispanen.
 */
public class ThreadExample2Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ints.add(i);
        }


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("iterator start");
                try {
                    synchronized (ints) {
                        for (Integer anInt : ints) {
                            System.out.println(anInt);
                            Thread.sleep(100);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("iterator end");

            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("mutator start");

            try {
                Thread.sleep(300);
                synchronized (ints) {
                    ints.add(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("mutator end");

        });

        t1.start();
        t2.start();

    }

}
