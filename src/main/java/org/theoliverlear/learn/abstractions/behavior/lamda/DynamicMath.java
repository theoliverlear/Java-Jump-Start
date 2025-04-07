package org.theoliverlear.learn.abstractions.behavior.lamda;

public class DynamicMath {
    //============================-Variables-=================================
    static final String DIVIDER = "-".repeat(50);
    //-----------------------Simple-Implementations---------------------------
    public static void simpleImplementations() {
        MathCalculation add = (a, b) -> a + b;
        MathCalculation multiply = (a, b) -> a * b;
        MathCalculation powerOf = (a, b) -> Math.pow(a, b);
        MathCalculation modulus = (a, b) -> a % b;
        System.out.println(add.calculate(1, 2));
        System.out.println(DIVIDER);
        System.out.println(multiply.calculate(1, 2));
        System.out.println(DIVIDER);
        System.out.println(powerOf.calculate(2, 3));
        System.out.println(DIVIDER);
        System.out.println(modulus.calculate(5, 2));
        System.out.println(DIVIDER);
    }
    //----------------------Advanced-Implementations--------------------------
    public static void advancedImplementations() {
        MathCalculation distance = (double rate, double time) -> rate * time;
        System.out.println(distance.calculate(60, 2));
        System.out.println(DIVIDER);
        MathCalculation pythagoreanTheorem = (double a, double b) -> {
            double aSquared = Math.pow(a, 2);
            double bSquared = Math.pow(b, 2);
            double cSquared = aSquared + bSquared;
            return Math.sqrt(cSquared);
        };
        System.out.println(pythagoreanTheorem.calculate(3, 4));
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        simpleImplementations();
        advancedImplementations();

    }
}

