package by.gsu.lesson19;

import java.util.concurrent.*;

/**
 * Created by vasili on 05.09.17.
 */
public class Thread19Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        FutureTask<Integer> task = new FutureTask<>(() -> 1);
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("start");
                Thread.sleep(1000);
                System.out.println("stop");
                return 1;
            }
        });

        new Thread(task).start();
        System.out.println(task.get());

        //---------
        Semaphore semaphore = new Semaphore(10);

        semaphore.acquire(9);
        semaphore.release(33);
        //---------
        CountDownLatch latch = new CountDownLatch(10);
        latch.await();
        latch.countDown();
        //------
        CyclicBarrier barrier = new CyclicBarrier(10);
        try {
            barrier.await();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

      //  ForkJoinPool pool = new ForkJoinPool(3);
      //  pool.execute();
    }

    public static void test() {
        synchronized (Thread19Main.class) {
        }
    }

    public synchronized static void test2() {

    }
}
