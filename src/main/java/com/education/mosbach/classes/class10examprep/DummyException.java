package com.education.mosbach.classes.class10examprep;

import java.util.ArrayList;

public class DummyException {

    public static void main(String[] args) {

        // throw new RuntimeException();
        // int i = 6 / 0;

        int[] numbers = {2,4,6};
        int position = 12;

        try {
            System.out.println("Element Nr. 12 ist : " + numbers[position]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Index falsch");
        }
        catch (Exception e) {
            System.out.println("Position ist falsch.");
        }

        ArrayList<DHBWSubmission> mySubmissions = new ArrayList<>();
        // diamonds are forever ...

    }


}
