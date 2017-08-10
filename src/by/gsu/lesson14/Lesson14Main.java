package by.gsu.lesson14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author vasiliy.pispanen.
 */
public class Lesson14Main {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>(3, 1.5f);

//        Map<String, Integer> map = new TreeMap<>();

//        Map<String, Integer> map =
//                new LinkedHashMap<>(10, 0.75f, true);

        Map<String, Integer> map = new SimpleLRUCache<>(3);

        map.put("qwe1", 1);
        map.put("qwe3", 2);
        map.put("qwe2", 1);
        map.put("qwe5", 1);
        map.put("qwe4", 3);
        map.put("qwe6", 1);

        map.get("qwe5");
        map.put("qwe7", 1);

//        map.get("qwe5");
//        map.get("qwe1");

        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        List<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("23");
        strings.add("5000");
        strings.add("323555");

        List<Integer> ints = new ArrayList<>();
        for (String s : strings) {
            Integer value = Integer.valueOf(s);
            if (value >= 1500) {
                ints.add(value);
            }
        }

        List<Integer> list0 = strings.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.valueOf(s);
                    }
                })
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer value) {
                        return value >= 1500;
                    }
                }).collect(Collectors.toList());

        List<Integer> list1 = strings.stream().
                map(s -> Integer.valueOf(s)).
                filter(i -> i >= 1500).collect(Collectors.toList());


        Collections.sort(list1);
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        Queue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        Set<Integer> integerSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(5);

        System.out.println(integerSet);
    }
}
