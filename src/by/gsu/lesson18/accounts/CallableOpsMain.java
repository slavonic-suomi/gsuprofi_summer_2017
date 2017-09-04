package by.gsu.lesson18.accounts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author vasiliy.pispanen.
 */
public class CallableOpsMain {
    public static void main(String[] args) {
        Account ac1 = new Account(500);
        Account ac2 = new Account(500);

        ExecutorService es =
                Executors.newFixedThreadPool(3);

        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                futures.add(
                        es.submit(new CallableOperations(ac1, ac2, 300)));
            } else {
                futures.add(
                        es.submit(new CallableOperations(ac2, ac1, 300)));
            }
        }

        es.shutdown();
        int success = 0;
        for (Future<Integer> future : futures) {
            try {
                Integer result = future.get();
                System.out.println(result);
                success++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(success);
    }
}
