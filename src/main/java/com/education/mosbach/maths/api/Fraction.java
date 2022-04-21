package com.education.mosbach.maths.api;

public interface Fraction {

    void setNominator(int nominator);
    void setDenominator(int denominator) throws DividedByZeroException;
    double decimal();

}
