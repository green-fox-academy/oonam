package com.company;

public class DrawTriangle {
    public static void main(String[] args) {
        int num = 4;

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
