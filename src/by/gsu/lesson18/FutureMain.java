package by.gsu.lesson18;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author vasiliy.pispanen.
 */
public class FutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main0");
      //  ExecutorService single = Executors.newSingleThreadExecutor();
      //  ExecutorService pooled = Executors.newFixedThreadPool(5);
        ExecutorService cached = Executors.newCachedThreadPool();

        Future<Integer> if1 = cached.submit(new SimpleCallable());
        Future<Integer> if2 = cached.submit(new SimpleCallable());
        Future<Integer> if3 = cached.submit(new SimpleCallable());
        Future<Integer> if4 = cached.submit(new SimpleCallable());
        System.out.println("main1");
        System.out.println(if1.get());
        System.out.println(if2.get());
        System.out.println(if3.get());
        System.out.println(if4.get());
        System.out.println("main2");

        cached.shutdown();
//        cached.shutdownNow();
    }

    public static class SimpleCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            System.out.println("callable0");
            Thread.sleep(1000);
            System.out.println("callable1");
            return new Random().nextInt();
        }
    }
}
