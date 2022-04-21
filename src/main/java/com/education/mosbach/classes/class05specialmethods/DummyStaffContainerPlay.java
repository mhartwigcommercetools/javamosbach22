package com.education.mosbach.classes.class05specialmethods;

import com.education.mosbach.humanresources.Staff;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DummyStaffContainerPlay {

    public static void main(String[] args) {


/*
        List<Staff> myStaff = new ArrayList<>();
        myStaff.add(new Staff(
                "Connor",
                "Heiland",
                "st1514",
                800,
                "Kassierer"
        ));
        myStaff.add(new Staff(
                "Tjabbe",
                "Zíckfeldt",
                "st1588",
                740,
                "Servicecenter-Mitarbeiter"
        ));
        myStaff.add(new Staff(
                "Celina",
                "Hof",
                "st1537634",
                700,
                "Software Entwickler"
        ));
*/
        List<Staff> myStaff =
            Arrays.asList(
                    new Staff("Connor", "Heiland", "st1514", 800, "Kassierer"),
                    new Staff("Tjabbe", "Zíckfeldt", "st1588", 740, "Servicecenter-Mitarbeiter"),
                    new Staff("Celina", "Hof", "st1537", 900, "Software Entwickler")
            );

        /*
        System.out.println("Diese Leute arbeiten hier: ");
        for (Staff s : myStaff)
            System.out.println(s);                              // hier nimmt er sich das s.toString()
        */

        System.out.println("Diese Leute arbeiten hier: ");
        myStaff.forEach(System.out::println);

        System.out.println("Sind die beiden Staff-Members gleich?");
        System.out.println("Connor und Celina " + myStaff.get(0).equals(myStaff.get(2)));
        System.out.println("Connor und null " + myStaff.get(0).equals(null));
        System.out.println("Tjabbe und Tjabbe " + myStaff.get(1).equals(myStaff.get(1)));
        System.out.println("Ist Tjabbe ein Array? " + myStaff.get(1).equals(new int[5]));


        System.out.println("Wer ist größer?");
        System.out.println("Connor oder Celina " + myStaff.get(0).compareTo(myStaff.get(2)));
        System.out.println("Connor oder Connor " + myStaff.get(0).compareTo(myStaff.get(0)));
        System.out.println("Connor und ein Array " + myStaff.get(0).compareTo(new int[5]));

        List<Staff> sortedStaff = new QuickSortStaffImpl()
                                            .qsort(myStaff);
        System.out.println("Diese Leute arbeiten hier (SORTIERT): ");
        sortedStaff.forEach(System.out::println);

        myStaff.sort(
                Comparator.comparing(Staff::getLastName)
                    .thenComparing(Staff::getFirstName)
        );
        System.out.println("Diese Leute arbeiten hier (SORTIERT mit Comparator): ");
        myStaff.forEach(System.out::println);



    }

}
