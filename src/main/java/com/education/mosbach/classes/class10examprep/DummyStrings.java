package com.education.mosbach.classes.class10examprep;

public class DummyStrings {

    public static void main(String[] args) {

        String s = "sonst, ziemlich konstante Strings";
        StringBuffer stringBuffer = new StringBuffer("thread-safe plus viele Veränderungen");
        StringBuilder stringBuilder = new StringBuilder("nicht thread-safe plus viele Veränderungen");

        System.out.println("Strings nehme ich, wenn " + s);
        System.out.println("StringBuffer nehme ich, wenn " + stringBuffer.toString());
        System.out.println("StringBuilder nehme ich, wenn " + stringBuilder.toString());

        String asSimpleType = "simple";                     // immutable in einem Object-Pool
        String asObject = new String("simple");

        // Konstanten
        // nur ein unveränderlicher Wert

        // immutable
        // null oder unveränderbaren Wert => Performanz!!

        // Variablen
        // immer veränderbar
    }

}
