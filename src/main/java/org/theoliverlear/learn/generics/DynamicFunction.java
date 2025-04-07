package org.theoliverlear.learn.generics;

public class DynamicFunction {
    //---------------------Handling-Dynamic-Printing--------------------------
    public static <T> void handleDynamicPrinting(T value) {
        if (value instanceof String) {
            System.out.println("String value: " + value);
        } else if (value instanceof Integer) {
            System.out.println("Integer value: " + value);
        } else if (value instanceof Double) {
            System.out.println("Double value: " + value);
        } else {
            System.out.println("Unknown type: " + value.getClass().getName());
        }
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        handleDynamicPrinting("Hello, World!");
        handleDynamicPrinting(42);
        handleDynamicPrinting(3.14);
        handleDynamicPrinting(true);
    }
}
