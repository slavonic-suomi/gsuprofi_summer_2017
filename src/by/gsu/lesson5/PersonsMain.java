package by.gsu.lesson5;

import java.util.Arrays;

public class PersonsMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 12, true);
        Person person2 = new Person("Ivan", 12, true);
        Person person3 = new Person("Ivan", 13, true);
        Person person4 = new Person("Ivan1", 13, true);


        Cat cat1 = new Cat("Atom");
        Cat cat2 = new Cat("Sam");
        Cat cat3 = new Cat("Murzik");
        Cat cat4 = new Cat("Wikipedia");


        NamedEntity[] array = {
                person1,
                person2,
                person3,
                person4,
                cat1,
                cat2,
                cat3,
                cat4,
        };

        Arrays.sort(array);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        System.out.println(Arrays.toString(array));


//        Сравнение массивов на равенсво
//        array.equals(new NamedEntity[3]); - неверно
//        Arrays.equals(array, args); - верно

        System.out.println("Name".equalsIgnoreCase("NaMe"));

        //magic
        Arrays.sort(array, new StringComparator());
    }
}
