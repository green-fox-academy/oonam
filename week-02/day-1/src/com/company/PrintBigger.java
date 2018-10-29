package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Number 1 is the bigger!");
        } else {
            System.out.println("Number 2 is the bigger!");
        }
    }
}
