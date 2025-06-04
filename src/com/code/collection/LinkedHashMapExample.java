package com.code.collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // put(K key, V value)
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("One", 1);
        
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        //linkedHashMap.put(null, 5); //allows one null key and multiple null values
        //linkedHashMap.put("five", null);
        //linkedHashMap.put(null, 6);
        
        System.out.println("original elements: "+linkedHashMap);//maintains insertion order
        // get(Object key)
        System.out.println("Value for key 'Two': " + linkedHashMap.get("Two"));

        // containsKey(Object key)
        System.out.println("Contains key 'Three'? " + linkedHashMap.containsKey("Three"));

        // containsValue(Object value)
        System.out.println("Contains value 5? " + linkedHashMap.containsValue(5));

        // size()
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());

        // keySet()
        //Set<String> keys = linkedHashMap.keySet();
        System.out.println("Keys: "  +linkedHashMap.keySet());

        // values()
        Collection<Integer> values = linkedHashMap.values();
        System.out.println("Values: " + values);

        // entrySet()
      //  Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        System.out.println("Entries: " + linkedHashMap.entrySet());

        // remove(Object key)
        linkedHashMap.remove("Four");
        System.out.println("After removing key 'Four': " + linkedHashMap);

        // clear()
        linkedHashMap.clear();
        System.out.println("After clearing LinkedHashMap: " + linkedHashMap);
        
       
    }
}


