package org.theoliverlear.learn.abstractions.object.bird;

public class Bird {
    //============================-Variables-=================================
    int wingspan;
    int weight;
    String color;
    static long totalBirds = 50_000_000_000L;
    //===========================-Constructors-===============================
    public Bird() {
        this(0, 0, "");
    }
    public Bird(int wingspan, int weight, String color) {
        this.wingspan = wingspan;
        this.weight = weight;
        this.color = color;
        totalBirds++;
    }
    //---------------------------Print-Details--------------------------------
    public void printDetails() {
        System.out.println("---BIRD DETAILS---");
        System.out.println("Wingspan: " + this.wingspan + "cm");
        System.out.println("Weight: " + this.weight + "g");
        System.out.println("Color: " + this.color);
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        System.out.println("Total birds before Thomas was born: " + Bird.totalBirds);
        Bird thomasTheBird = new Bird(20, 200, "Blue");
        thomasTheBird.printDetails();
        System.out.println("Total birds after Thomas was born: " + Bird.totalBirds);
    }
}
