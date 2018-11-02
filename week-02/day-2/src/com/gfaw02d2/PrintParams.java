package com.gfaw02d2;

public class PrintParams {
    public static void main(String[] args) {
        printParams("first", "second", "third", "fourth");
    }

    public static void printParams(String... text) {
        for (String i : text
             ) {
            System.out.println(i);
        }
    }
}
