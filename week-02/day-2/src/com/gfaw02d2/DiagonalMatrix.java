package com.gfaw02d2;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int matrix = 4;

        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                if (j == i){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
