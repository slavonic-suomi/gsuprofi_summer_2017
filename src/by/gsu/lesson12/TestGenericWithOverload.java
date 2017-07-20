package by.gsu.lesson12;

import java.util.Collection;
import java.util.List;

public class TestGenericWithOverload<E> {

    public void test(Collection<Integer> collection) {
        for (Integer q : collection) {
            System.out.println(q);
        }
    }

    public void test(List<String> strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
