package by.gsu.lesson20;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by vasili on 12.09.17.
 */
public class StreamExample {

    public static void main(String[] args) {
        Group marvel1 = new Group(4, "Marvel");
        Group dc = new Group(2, "DC");
        Group marvel2 = new Group(4, "Marvel");

        List<Person> people = new ArrayList<>();
        people.add(new Person(45, marvel1));
        people.add(new Person(50, marvel2));
        people.add(new Person(15, dc));
        people.add(new Person(130, dc));
        people.add(new Person(10, marvel2));
        people.add(new Person(32, marvel1));

        test(people);
        System.out.println("------");
        test2(people);
        System.out.println("------");
        test3(people);

        int[] ints = {1,2,3,4};
        long count = Arrays.stream(ints).filter(i -> i % 2 != 0).count();

//        IntStream.range(0, 100).
//        int[] sum = new int[1];
//        Arrays.stream(ints).peek(i -> sum[0] += i);

        String[] strings = {"qwe", "dfg", "dfg"};
        String res =
                Arrays.stream(strings).
                        collect(Collectors.joining(","));

    }

    public static void test(Collection<Person> people) {
        List<Group> groups = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > 30) {
                groups.add(p.getGroup());
            }
        }

        Collections.sort(groups, new Comparator<Group>() {
            @Override
            public int compare(Group o1, Group o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        });
        Set<Group> unique = new LinkedHashSet<>(groups);
        for (Group g : unique) {
            System.out.println(g.getName() + " " + g.getSize());
        }

    }

    public static void test3(Collection<Person> people) {
        Stream<Person> s1 = people.stream();

        Stream<Person> s2 = s1.filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 30;
            }
        });

        Stream<Group> s3 = s2.map(new Function<Person, Group>() {
            @Override
            public Group apply(Person person) {
                return person.getGroup();
            }
        });

        Stream<Group> s4 = s3.distinct();

        Stream<Group> s5 = s4.sorted(new Comparator<Group>() {
            @Override
            public int compare(Group o1, Group o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        });

        Stream<String> s6 = s5.map(new Function<Group, String>() {
            @Override
            public String apply(Group group) {
                return group.getName() + " " + group.getSize();
            }
        });

        s6.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

//        Iterator<String> iterator = s6.iterator();
//        Optional<String> first = s6.findFirst();
//        String s = s6.findAny().orElse("qwe");
//        boolean res = s6.anyMatch(s123 -> s123.contains("qwe"));
//
//        List<String> collect = s6.collect(Collectors.toList());
//        Map<String, Integer> collect1 =
//                s6.collect(Collectors.toMap(s567 -> s567, s890 -> s890.length()));


    }

    public static void test2(Collection<Person> people) {
        people.stream()
                .filter(p -> p.getAge() > 30)
                .map(p -> p.getGroup())
                .distinct()
                .sorted(Comparator.comparing(g -> g.getSize()))
                .map(g -> g.getName() + " " + g.getSize())
                .forEach(System.out::println);


    }

    static class Person {
        int age;
        Group group;

        public Person(int age, Group group) {
            this.age = age;
            this.group = group;
        }

        public int getAge() {
            return age;
        }

        public Group getGroup() {
            return group;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            if (age != person.age) return false;
            return group != null ? group.equals(person.group) : person.group == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (group != null ? group.hashCode() : 0);
            return result;
        }
    }

    static class Group {
        public Group(int size, String name) {
            this.size = size;
            this.name = name;
        }

        int size;
        String name;

        public int getSize() {
            return size;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Group group = (Group) o;

            if (size != group.size) return false;
            return name != null ? name.equals(group.name) : group.name == null;
        }

        @Override
        public int hashCode() {
            int result = size;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}
