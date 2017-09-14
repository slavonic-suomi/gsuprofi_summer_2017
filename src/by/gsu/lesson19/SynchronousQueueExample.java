package by.gsu.lesson19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by vasili on 05.09.17.
 */
public class SynchronousQueueExample {
    static SynchronousQueue<String> q = new SynchronousQueue<>();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        FutureTask<String> task = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return q.take();
            }
        });
        new Thread(task).start();
        System.out.println("before put");
        System.out.println(task.get());
        q.put("qweq");
        System.out.println("after put");
    }
}
