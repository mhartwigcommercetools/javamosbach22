package com.education.mosbach.classes.class06exceptions;

public class DummyExecptionHandlingPlay {

    public static void main(String[] args) {

        DummyRandomExceptionThrower dummyRandomExceptionThrower = new DummyRandomExceptionThrower();
        for (int i = 0; i < 20; i++) {
            try {
                dummyRandomExceptionThrower.throwRandomException();
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
            catch (RuntimeException e) {
                System.out.println("RuntimeException");
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }

    }
}
