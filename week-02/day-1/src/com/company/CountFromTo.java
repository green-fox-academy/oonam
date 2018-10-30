package com.company;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        int difference = num2 - num1;

        if (num1 >= num2) {
            System.out.println("The second number should be bigger.");
        } else {
            for (int i = 0; i < difference; i++) {
                System.out.println(i + num1);
            }
        }
    }
}
