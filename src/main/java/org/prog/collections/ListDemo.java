package org.prog.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        List<String> lList = new LinkedList<>();

        aList.add("a");
        aList.add("c");

        lList.add("b");
        lList.add("d");

        aList.addAll(lList);
        aList.removeAll(lList);

        System.out.println(aList.size());
    }
}
