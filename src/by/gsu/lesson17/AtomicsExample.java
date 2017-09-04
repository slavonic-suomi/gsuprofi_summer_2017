package by.gsu.lesson17;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author vasiliy.pispanen.
 */
public class AtomicsExample {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(10);
        ai.incrementAndGet();
        int res = ai.addAndGet(5);
        System.out.println(res);
    }
}
