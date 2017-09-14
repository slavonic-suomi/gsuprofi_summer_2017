package by.gsu.lesson20;

import java.util.concurrent.Callable;

/**
 * Created by vasili on 12.09.17.
 */
public class Main {
    public static void main(String[] args) {
        TestI testI = new TestI() {
            @Override
            public void t1() {
                System.out.println("t1");
            }

            @Override
            public int t2() {
                return 1;
            }
        };

        testI.t1();
        System.out.println(testI.getClass().getSimpleName());
        System.out.println(Main.class.getName());

        Test2 test2 = new Test2() {
            @Override
            public void test(int x, long y) {
                System.out.println("qwe");
            }
        };

        Test2 test21 = (int x, long y) -> {
            long res = x + y + 1;
            System.out.println(res);
        };

        Test2 test22 = (x, y) -> System.out.println(x + y + 1);

        Runnable r1 = () -> System.out.println("run");

        Callable<Integer> c1 = () -> 1;



    }
}
