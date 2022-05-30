package name.guolanren._101to200._141to150.p146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/lru-cache/
 * @author guolanren
 */
public class LRUCache {

    LRU lru;

    public LRUCache(int capacity) {
        lru = new LRU(capacity);
    }

    public int get(int key) {
        return lru.get(key);
    }

    public void put(int key, int value) {
        lru.put(key, value);
    }

}

class LRU extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LRU(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return capacity < this.size();
    }
}
