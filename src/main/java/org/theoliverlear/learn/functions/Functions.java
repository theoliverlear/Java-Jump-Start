package org.theoliverlear.learn.functions;

public class Functions {
    //--------------------------------Add-------------------------------------
    public static int add(int a, int b) {
        return a + b;
    }
    //---------------------------Print-Message--------------------------------
    public static void printMessage(String message) {
        System.out.println(message);
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("The sum is: " + result);
        printMessage("Hello, World!");
    }
}
