package com.education.mosbach.maths.impl;

import com.education.mosbach.maths.api.DividedByZeroException;
import com.education.mosbach.maths.api.Fraction;

public class FractionImpl implements Fraction {

    private int nominator;
    private int denominator;

    public FractionImpl(int nominator, int denominator) throws DividedByZeroException {
        setNominator(nominator);
        setDenominator(denominator);
    }

    @Override
    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    @Override
    public void setDenominator(int denominator) throws DividedByZeroException {
        if (denominator == 0) throw new DividedByZeroException();
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Fraction is \n" +
                nominator +
                "\n-----\n"
                + denominator;
    }

    @Override
    public double decimal() {
        return
                (double) nominator
                    /
                (double) denominator;
    }
}
