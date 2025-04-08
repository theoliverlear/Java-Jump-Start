package org.theoliverlear.learn.conditions;

public class Conditions {
    //--------------------Process-Purchase-Eligibility------------------------
    public static void processPurchaseEligibility() {
        double moneyInBank = 1000.0;
        double costOfItem = 1500.0;
        boolean canPurchase = moneyInBank >= costOfItem;
        boolean canAffordMonthlyPayment = moneyInBank >= costOfItem / 12;
        if (canPurchase) {
            System.out.println("You can purchase the item.");
        } else if (canAffordMonthlyPayment) {
            System.out.println("Let's set up a monthly payment plan.");
        } else {
            System.out.println("You cannot afford the item.");
        }
    }
    //---------------------------Address-Member-------------------------------
    public static void addressMember(String name) {
        switch (name) {
            case "Bob":
                System.out.println("Bob the Builder!");
                break;
            case "Alice":
                System.out.println("Alice, have you found wonderland yet?");
                break;
            case "Charlie":
                System.out.println("Charlie, the chocolate factory is waiting for you!");
                break;
            case "Davey":
                System.out.println("How's the ocean, Davey?");
                break;
            default:
                System.out.println("I don't know you, " + name + ".");
                break;
        }
    }
    //-----------------------Get-Product-Name-By-Id---------------------------
    public static String getProductNameById(int idNum) {
        return switch (idNum) {
            case 9908 -> "Limited Edition Beanie Baby";
            case 104 -> "Superman First Edition Comic";
            case 10609 -> "Star Wars: The Complete Collection";
            case 54 -> "Honda V6 Engine";
            default -> throw new IllegalArgumentException("Invalid product ID: " + idNum);
        };
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        processPurchaseEligibility();
        addressMember("Bob");
        System.out.println(getProductNameById(9908));
    }
}
