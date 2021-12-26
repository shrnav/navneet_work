package com.nav.java8;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Cache {
     int key;
     String value;

    public Cache(int key,String value){
        this.key = key;
        this.value = value;
    }
}


public class Lru {

    static Map<Integer, Cache> map = new HashMap<>();
    static Deque<Integer> queue =  new LinkedList<>();
    private int CACHE_CAPACITY = 4;

    public String getElementFromCache(int key) {
        if(map.containsKey(key)){
            Cache current = map.get(key);
            queue.remove(current.key);
            queue.addFirst(current.key);
            return current.value;
        }
        return "Not Exist";
    }

    public void putElementInCache(int key, String value){

        if(map.containsKey(key)){
            Cache curr = map.get(key);
            queue.remove(curr.key);
        }else if (queue.size() == CACHE_CAPACITY){
            map.remove(queue.removeLast());
        }
        Cache cache = new Cache(key,value);
        queue.addFirst(cache.key);
        map.put(key,cache);
    }

    public static void main(String[] args) {

        Lru cache = new Lru();
        cache.putElementInCache(1, "Value_1");
        cache.putElementInCache(2, "Value_2");
        cache.putElementInCache(3, "Value_3");
        cache.putElementInCache(4, "Value_4");
        System.out.println(cache.getElementFromCache(2));
        System.out.println();
        System.out.println(queue);
        System.out.println();
        System.out.println(cache.getElementFromCache(5));
        cache.putElementInCache(5,"Value_5");
        System.out.println();
        System.out.println(queue);
        System.out.println();

    }
}


