package org.theoliverlear.learn.loops;

import java.util.Arrays;

public class Loops {
    //============================-Variables-=================================
    static final String DIVIDER = "-".repeat(50);
    //===============================-Main-===================================
    public static void main(String[] args) {
        //-------------------------While-Loop---------------------------------
        int diceNumber = 0;
        while (diceNumber != 6) {
            diceNumber = (int) (Math.random() * 6) + 1;
            System.out.println("You rolled a " + diceNumber);
        }
        System.out.println(DIVIDER);
        //----------------------Indexed-For-Loop------------------------------
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("The number is " + nums[i]);
        }
        //---------------------Enhanced-For-Loop------------------------------
        System.out.println(DIVIDER);
        for (int num : nums) {
            System.out.println("The number is " + num);
        }
        //-----------------------For-Each-Loop--------------------------------
        System.out.println(DIVIDER);
        Arrays.stream(nums).forEach(num -> {
            System.out.println("The number is " + num);
        });
    }
}
