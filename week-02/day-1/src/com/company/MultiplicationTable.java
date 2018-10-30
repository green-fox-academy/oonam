package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int num = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + " * " + num + " = " + (i + 1) * num);
        }
    }
}
