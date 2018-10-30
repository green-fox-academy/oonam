package com.gfaw02d2;

import java.util.Scanner;

public class Factorio {

    public static int scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        return scanner.nextInt();
    }

    public static int factorio(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
             result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int input = scanner();
        int output = factorio(input);
        System.out.println(output);

    }
}
