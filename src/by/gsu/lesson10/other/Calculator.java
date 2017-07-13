package by.gsu.lesson10.other;

@FunctionalInterface
public interface Calculator {
    int summ(int a, int b);

    default int calc(int a, int b) {
        return summ(a, b) + 123;
    }
}
