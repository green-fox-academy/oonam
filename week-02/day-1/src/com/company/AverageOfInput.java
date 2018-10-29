package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Number 4: ");
        int num4 = scanner.nextInt();

        System.out.print("Number 5: ");
        int num5 = scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        double avg = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}
