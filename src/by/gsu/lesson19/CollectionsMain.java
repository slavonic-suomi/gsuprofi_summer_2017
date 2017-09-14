package by.gsu.lesson19;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by vasili on 05.09.17.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>();

        List<String> strings = Collections.synchronizedList(original);

        strings.add("qwe");
        String s = strings.get(0);
        Iterator<String> iterator = strings.iterator();

        //-----------
        List<String> cowList = new CopyOnWriteArrayList<>();
        cowList.addAll(Collections.emptyList());

        Set<Integer> integers = new ConcurrentSkipListSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        ConcurrentMap<String, String> chm = new ConcurrentHashMap<>();
        if (chm.containsKey("k1")) {
            chm.put("k1", "qwe");
        }

        //---
        Queue<Integer> q = new SynchronousQueue<Integer>();

    }
}
