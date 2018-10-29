package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of chicken: ");
        int num1 = scanner.nextInt();

        System.out.print("Number of pigs: ");
        int num2 = scanner.nextInt();

        int legs = (num1 * 2) + (num2 * 4);

        System.out.println("All the animals have " + legs + " legs.");
    }
}
