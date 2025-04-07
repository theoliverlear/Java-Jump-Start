package org.theoliverlear.learn.syntax;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {
    //===============================-Main-===================================
    public static void main(String[] args) {
        //-------------------Primitives-As-Objects----------------------------
        Integer integer = 5;
        Integer integerTwo = new Integer(10);
        System.out.println(integer + integerTwo);

        Double doubleValue = 5.5;
        Double doubleValueTwo = new Double(10.5);
        System.out.println(doubleValue + doubleValueTwo);

        Boolean booleanValue = true;
        Boolean booleanValueTwo = new Boolean(false);
        System.out.println(booleanValue && booleanValueTwo);

        Character charValue = 'A';
        Character charValueTwo = new Character('B');
        System.out.println(charValue + " " + charValueTwo);
        //---------------------Using-The-Wrappers-----------------------------
        List<Integer> integerList = new ArrayList<>();
        integerList.add(integer);
        integerList.add(integerTwo);
        integerList.add(15);
        integerList.forEach(integerValue -> {
            System.out.println("Integer: " + integerValue);
        });
    }
}
