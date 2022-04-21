package com.education.mosbach.classes.class06exceptions;

import java.util.Optional;

public class DummyModernExceptionHandling {

    Optional<String> maybeString() {     // kein throws
        // manchmal gebe ich String zurück, manchmal nicht
        return
                null;
    }


    public static void main(String[] args) {

        final Optional<String> optionalString1 = Optional.ofNullable("I might not be available");
        final Optional<String> optionalString2 = Optional.ofNullable(null);

        if (optionalString1.isPresent())
            System.out.println(optionalString1.get());
        else
            System.out.println("String ist null;");

        if (optionalString2.isPresent())
            System.out.println(optionalString2.get());
        else
            System.out.println("String ist null;");

    }


}
