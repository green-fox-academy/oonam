package com.gfaw04d1;

public class DivideByZero {

    public static void main(String[] args) {
        int a = 0;

        try {
            System.out.println(divideWith10(a));
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }

    public static int divideWith10(int a) {
        a = 20 / a;
        return a;
    }
}
