package com.company;

public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("Swapped a: " + a);
        System.out.println("Swapped b: " + b);
    }
}
