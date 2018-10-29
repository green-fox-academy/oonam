package com.company;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of girls: ");
        int girls = scanner.nextInt();

        System.out.print("Number of boys: ");
        int boys = scanner.nextInt();

        int sum = girls + boys;

        if (girls == boys && sum >= 20) {
            System.out.println("The party is excellent!");
        } else if (girls != boys && sum >= 20 && girls != 0) {
            System.out.println("Quite cool party!");
        } else if (sum < 20) {
            System.out.println("Average party...");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}
