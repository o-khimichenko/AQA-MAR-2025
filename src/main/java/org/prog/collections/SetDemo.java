package org.prog.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("a");
        mySet.add("b");
        mySet.add("c");
        mySet.add("d");

        for (String s : mySet) {
            System.out.println(s);
        }
    }
}
