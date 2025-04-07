package org.theoliverlear.learn.streams;

import org.theoliverlear.learn.abstractions.constant.OfficerTitle;

import java.util.List;
import java.util.stream.IntStream;

public class OfficerStream {
    //============================-Variables-=================================
    static final String DIVIDER = "-".repeat(50);
    static List<AcmOfficer> officers = List.of(
            new AcmOfficer("Jeremy", OfficerTitle.PRESIDENT,      new int[]{2022, 2023}),
            new AcmOfficer("Randy",  OfficerTitle.VICE_PRESIDENT, new int[]{2022, 2023}),
            new AcmOfficer("Randy",  OfficerTitle.PRESIDENT,      new int[]{2023, 2024}),
            new AcmOfficer("Oliver", OfficerTitle.VICE_PRESIDENT, new int[]{2023, 2024}),
            new AcmOfficer("Colton", OfficerTitle.TREASURER,      new int[]{2023, 2024}),
            new AcmOfficer("Oliver", OfficerTitle.PRESIDENT,      new int[]{2024, 2025}),
            new AcmOfficer("Tim",    OfficerTitle.VICE_PRESIDENT, new int[]{2024, 2025}),
            new AcmOfficer("James",  OfficerTitle.TREASURER,      new int[]{2024, 2025})
    );
    //===============================-Main-===================================
    public static void main(String[] args) {
        //----------------------Without-Streams-------------------------------
        for (AcmOfficer officer : officers) {
            if (officer.isPresident()) {
                System.out.print(officer.getTenureString());
            }
        }
        //------------------------With-Streams--------------------------------
        System.out.println(DIVIDER);
        officers.stream()
                .filter(AcmOfficer::isPresident)
                .forEach(officer -> {
                    System.out.print(officer.getTenureString());
                });
        //---------------------Create-New-Objects-----------------------------
        System.out.println(DIVIDER);
        List<String> officerNames = officers.stream().map(AcmOfficer::getName).distinct().toList();
        System.out.print("Officers: ");
        officerNames.forEach(name -> System.out.print(name + ", "));
        System.out.println();
        //---------------------Loop-With-Streams------------------------------
        System.out.println(DIVIDER);
        IntStream.range(0, officers.size())
                .forEach(i -> {
                    AcmOfficer officer = officers.get(i);
                    System.out.printf("%d. %s%n", i + 1, officer.getTenureString());
                });
    }
}
