package com.programmersio.javabasics.week3day3.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K,V> extends LinkedHashMap<K,V> {
    public static final int MAX_ENTRIES = 3;

    public LRUCache(int initialCapacty, float loadFactor, boolean accessOrder) {
        super (initialCapacty, loadFactor, accessOrder);
    }

    public boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }
}

public class LRUCacheDemo {
    public static void main(String[] args) {
        System.out.println("LRU Cache...");
        Map<String, String> lrucache = new LRUCache<>(16, 0.75f, true);
        lrucache.put("a", "A");
        lrucache.put("b", "B");
        lrucache.put("c", "C");
        System.out.println(lrucache);

        lrucache.get("a");
        lrucache.get("a");
        lrucache.get("a");
        System.out.println(lrucache);
        lrucache.get("b");
        System.out.println(lrucache);

        lrucache.put("d", "D");
        System.out.println(lrucache);
        lrucache.put("e", "E");
        System.out.println(lrucache);
    }
}
