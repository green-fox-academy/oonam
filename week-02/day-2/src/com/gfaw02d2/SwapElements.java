package com.gfaw02d2;

public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String temp;

        temp = abc[0];
        abc[0] = abc[2];
        abc[2] = temp;

        for (String elements : abc
             ) {
            System.out.println(elements);
        }
    }
}
