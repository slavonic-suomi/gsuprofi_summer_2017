package by.gsu.lesson12;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardMain {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();

        ints.add(new Integer(10));
        Integer integer = ints.get(0);

        List<? extends Number> ints2 = new ArrayList<Integer>();
        List<? extends Number> longs = new ArrayList<Long>();

        Number number = ints2.get(0);
        //ints2.add(new Integer(3)); error


        List<? super Number> ints3 = new ArrayList<Number>();
        List<? super Number> objects = new ArrayList<Object>();

        Object o = ints3.get(0);
        objects.add(new Integer(1));
        objects.add(new Long(1));

        List<Integer> ints5 = new ArrayList<>();
        ints5.add(1);

        List<Number> numbers = new ArrayList<>();

        copy(ints5, numbers);
    }

    public static void copy(List<? extends Number> src, List<? super Number> desc) {
        for (Number number : src) {
            desc.add(number);
        }
    }
}
