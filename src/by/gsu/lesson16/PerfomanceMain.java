package by.gsu.lesson16;

/**
 * @author vasiliy.pispanen.
 */
public class PerfomanceMain {
    public static void main(String[] args) {
        int res1 = test();
        test();
        test();
        test();
        test();
        test();
        test();

        long start = System.currentTimeMillis();
        int res2 = test();
        long end = System.currentTimeMillis();

        System.out.println("worked time: " + (end - start) + "ms");
        System.out.println(res1 + res2);
    }

    public static int test() {
        int k = 1;
        for (int i = 0; i < 200_000_000_0; i++) {
            k = k * k;
        }
        return k;
    }
}
