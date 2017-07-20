package by.gsu.lesson12;

import by.gsu.lesson5.Person;
import com.sun.tools.javac.util.List;

import java.util.Collection;

public class TestGenericMain {
    public static void main(String[] args) {
        TestGenericWithOverload<Person> test1
                = new TestGenericWithOverload<>();

        TestGenericWithOverload test2
                = new TestGenericWithOverload();

        List<Integer> ints = List.of(1);
        Collection<String> strings = List.of("qwe");


//        test1.test(ints);
//        test1.test(strings);

        test2.test(ints);
        test2.test(strings);

    }
}
