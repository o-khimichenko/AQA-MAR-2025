package org.prog.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        myMap.put(null, "null_key");
        myMap.put("a", "b");
        myMap.put("c", "d");
        myMap.put("e", "f");
        myMap.putIfAbsent("e", "g");
        myMap.putIfAbsent("e", "gg");
        myMap.putIfAbsent("e", "j");
        myMap.putIfAbsent("e", "h");

        System.out.println(myMap.get("e"));

//        System.out.println(myMap.size());
//        System.out.println(myMap.get("a"));
//        System.out.println(myMap.get("c"));
//        System.out.println(myMap.get("e"));

//        System.out.println(myMap.get("jjjj"));
//        System.out.println(myMap.get(null));
//
//        System.out.println(myMap.getOrDefault("hhhh", "default_value"));
//
    }
}
