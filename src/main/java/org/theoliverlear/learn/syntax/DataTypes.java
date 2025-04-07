package org.theoliverlear.learn.syntax;

public class DataTypes {
    //===============================-Main-===================================
    public static void main(String[] args) {
        //-----------------------Whole-Numbers--------------------------------
        int wholeNumbers = 10;
        short verySmallWholeNumbers = 5;
        long massiveWholeNumbers = 10000000000000L;
        //----------------------Floating-Numbers------------------------------
        float decimalNumbers = 10.5F;
        double massiveDecimalNumbers = 10000000000.5;
        //---------------------Letters-And-Words------------------------------
        char singleCharacter = 'A';
        String stringOfCharacters = "Hello, World!";
        //--------------------------Bitwise-----------------------------------
        boolean trueOrFalse = true;
        byte eightBitNumbers = 127;
        //--------------------------Objects-----------------------------------
        Object object = new Object();
        // Call methods on the object
        System.out.println("Object class: " + object.getClass());
    }
}
