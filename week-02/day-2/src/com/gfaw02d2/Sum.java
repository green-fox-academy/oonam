package com.gfaw02d2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int input = giveANumber();
        int output = sumTillNumber(input);
        System.out.println(output);
    }

    public static int giveANumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number: ");
        return scanner.nextInt();
    }

    public static int sumTillNumber(int num) {
        int result = 0;

        for (int i = 0; i < num; i++) {
            result += i + 1;
        }

        return result;
    }
}