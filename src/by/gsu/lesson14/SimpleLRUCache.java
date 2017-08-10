package by.gsu.lesson14;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author vasiliy.pispanen.
 */
public class SimpleLRUCache<K, V> extends LinkedHashMap<K,V> {

    private int capacity;

    public SimpleLRUCache(int initialCapacity) {
        super(initialCapacity + 1, 1.1f, true);
        this.capacity = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}
