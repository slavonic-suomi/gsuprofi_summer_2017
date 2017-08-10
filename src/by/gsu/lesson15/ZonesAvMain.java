package by.gsu.lesson15;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 * @author vasiliy.pispanen.
 */
public class ZonesAvMain {
    public static void main(String[] args) {
        Set<String> zonesSet = ZoneId.getAvailableZoneIds();
        ArrayList<String> strings = new ArrayList<>(zonesSet);
        Collections.sort(strings);
        strings.forEach(System.out::println);
    }
}
