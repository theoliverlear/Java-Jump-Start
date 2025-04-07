package org.theoliverlear.learn.syntax;

public class Keywords {
    //-------------------------------Static-----------------------------------
    public static void noObjectNeeded() {
        System.out.println("I don't need an object to be called");
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        //---------------------------Final------------------------------------
        final int constantNum = 10;
//        constantNum = 10;
        //---------------------------Assert-----------------------------------
        assert constantNum > 0 : "Number must be positive";
        //---------------------Break-And-Continue-----------------------------
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank"};
        for (String name : names) {
            if (name.equals("Bob")) {
                continue;
            } else if (name.equals("Charlie")) {
                break;
            }
            System.out.println(name);
        }
    }
}

