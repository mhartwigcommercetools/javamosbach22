package com.education.mosbach.classes.class06exceptions;

import java.util.Random;

public class DummyRandomExceptionThrower {

    public void throwRandomException() throws RuntimeException, ArithmeticException, Exception {

        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                throw new RuntimeException();
            case 1:
                throw new ArithmeticException();
            case 2:
                throw new Exception();
        }
    }


}
