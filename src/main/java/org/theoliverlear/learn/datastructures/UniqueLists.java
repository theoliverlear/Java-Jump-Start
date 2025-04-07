package org.theoliverlear.learn.datastructures;

import java.util.HashSet;
import java.util.Set;

public class UniqueLists {
    //===============================-Main-===================================
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.forEach(System.out::println);
    }
}
