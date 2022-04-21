package com.education.mosbach.classes.class06exceptions;

import com.education.mosbach.maths.api.DividedByZeroException;
import com.education.mosbach.maths.api.Fraction;
import com.education.mosbach.maths.impl.FractionImpl;

public class DummyFractionPlay {

    public static void main(String[] args) throws DividedByZeroException {

        Fraction fraction = new FractionImpl(3,4);

        try {
            fraction.setDenominator(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(fraction);
        System.out.println("Dezimalzahl " + fraction.decimal());
    }


}
