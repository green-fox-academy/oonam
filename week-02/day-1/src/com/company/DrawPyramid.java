package com.company;

public class DrawPyramid {
    public static void main(String[] args) {
        int num = 4;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == num - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
