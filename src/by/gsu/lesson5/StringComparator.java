package by.gsu.lesson5;

import java.util.Comparator;

public class StringComparator implements Comparator<NamedEntity> {
    @Override
    public int compare(NamedEntity o1, NamedEntity o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
