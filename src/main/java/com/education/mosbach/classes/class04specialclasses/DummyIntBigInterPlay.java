package com.education.mosbach.classes.class04specialclasses;

import java.math.BigInteger;

public class DummyIntBigInterPlay {

    public static void main(String[] args) {

        System.out.println("Int-Überlauf");
        int i = 1;
        while (i > 0) {
            i *= 2;
            System.out.println(i);
        }

        System.out.println("BigInt-Überlauf");
        BigInteger bg = BigInteger.ONE;
        while (bg.longValue() > 0) {
            bg = bg.multiply(BigInteger.TWO);
            System.out.println(bg.longValue());
        }

    }

}
