package com.company;

import java.lang.Math;

public class DrawDiamond {
    public static void main(String[] args) {
        int num = 4;
//        System.out.println(Math.abs(num));

        int space = num - 1;

        for (int j = 1; j <= num; j++) {
            for (int i = 1; i <= Math.abs(space); i++) {
                System.out.print("-");
                space--;
            }
            System.out.println();
        }

        System.out.println(space);

//        for (int j = 1; j <= num; j++) {
//            for (int i = 1; i <= space; i++) {
//                System.out.print("-");
//            }
//
//            for (int i = space + 1; i <= space + (2 * j) - 1; i++) {
//                System.out.print("*");
//            }
//
//            space--;
//            System.out.println();
//        }

//        space++;
//
//        for (int k = 0; k < num; k++) {
//            for (int l = 1; l <= space + 1; l++) {
//                System.out.print("-");
//            }
//
//            for (int m = 0; m < ; m++) {
//
//            }
//        }

    }
}
