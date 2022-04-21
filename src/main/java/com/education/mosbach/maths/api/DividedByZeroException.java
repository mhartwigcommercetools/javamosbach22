package com.education.mosbach.maths.api;

public class DividedByZeroException extends Exception{

    public DividedByZeroException() {
        super();
    }

    @Override
    public String getMessage() {
        return
                "Division durch 0 ist nicht erlaubt.";
    }

    @Override
    public String getLocalizedMessage() {
        return
                "Division durch 0 ist nicht erlaubt.";
    }
}
