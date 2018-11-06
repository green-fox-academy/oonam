package com.company;

public class DrawPyramid {
    public static void main(String[] args) {
        int num = 4;

        int space = num - 1;

        for (int j = 1; j <= num; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print("-");
            }

            for (int i = space + 1; i <= space + (2 * j) - 1; i++) {
                System.out.print("*");
            }

            space--;
            System.out.println();
        }
    }
}
