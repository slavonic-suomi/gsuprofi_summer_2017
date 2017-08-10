package by.gsu.lesson13;

import java.util.*;

/**
 * @author vasiliy.pispanen.
 */
public class CollectionMain {
    public static void main(String[] args) {
        List<String> coll1 = new ArrayList<>(1000);
        List<String> coll2 = new LinkedList<>();


        coll1.add("asd");
        coll1.add("asd");
        coll1.add("asd");

        for (String someString : coll1) {
            System.out.println(someString);
        }

        Iterator<String> iterator = coll1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> set = new HashSet<>();

        set.add("qwe");
        set.add("qwe");
        set.add("qwe");

        System.out.println(set);

        NavigableSet<String> navigableSet = new TreeSet<>();


        Queue<String> queue = new LinkedList<>();
        Deque<String> stringDeque = new LinkedList<>();

        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

//        for (Integer aint : ints) {
//            if (aint % 2 == 0) {
//                ints.remove(ints.indexOf(2));
//            }
//
//        }

        Map<String, Integer> map = new HashMap<>();

        map.put("test@df.rt", 5);
        map.put("test1@df.rt", 3);
        map.put("test2@df.rt", 56);


        map.get("test@df.rt");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();


    }
}
