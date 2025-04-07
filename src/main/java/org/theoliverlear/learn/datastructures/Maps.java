package org.theoliverlear.learn.datastructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    static final String DIVIDER = "-".repeat(50);
    //===============================-Main-===================================
    public static void main(String[] args) {
        //-----------------------Creating-A-Map-------------------------------
        /* {
         *    "Oliver": 7,
         *    "Colton": 4,
         *    "Tim": 2,
         *    "James": 3
         * }
         */
        Map<String, Integer> nameYearsInSchool = new HashMap<>();
        nameYearsInSchool.put("Oliver", 7);
        nameYearsInSchool.put("Colton", 4);
        nameYearsInSchool.put("Tim", 2);
        nameYearsInSchool.put("James", 3);
        for (Map.Entry<String, Integer> entry : nameYearsInSchool.entrySet()) {
            System.out.println(entry.getKey() + " has been in school for " + entry.getValue() + " years.");
        }
        System.out.println(DIVIDER);
        //-----------------------Editing-A-Map--------------------------------
        /* {
         *    "Oliver": 3,
         *    "Colton": 4,
         *    "Tim": 2
         * }
         */
        int oliverYearsInSchool = nameYearsInSchool.get("Oliver");
        int oliverYearsInComputerScience = oliverYearsInSchool - 4;
        System.out.println("Oliver has been in computer science for " + oliverYearsInComputerScience + " years.");
        nameYearsInSchool.put("Oliver", oliverYearsInComputerScience);
        nameYearsInSchool.remove("James");
        nameYearsInSchool.forEach((key, value) -> {
            System.out.println(key + " has been in computer science for " + value + " years.");
        });
    }
}
