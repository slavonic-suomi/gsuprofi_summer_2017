package by.gsu.lesson18;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author vasiliy.pispanen.
 */
public class ThreadLocalExample {
    public static ThreadLocal<Integer> tlInt = new ThreadLocal<>();
    public static volatile int simpleInt = 0;

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        es.submit(new Example(15, "t1"));
        es.submit(new Example(30, "t2"));

        es.shutdown();
    }

    static class Example implements Callable<Integer> {
        int value;
        String name;

        public Example(int value, String name) {
            this.value = value;
            this.name = name;
        }

        @Override
        public Integer call() throws Exception {
            tlInt.set(value);
            simpleInt = value;
            Thread.sleep(2000);
            System.out.println(name + " " + simpleInt + " " + tlInt.get());
            return value;
        }
    }
}
