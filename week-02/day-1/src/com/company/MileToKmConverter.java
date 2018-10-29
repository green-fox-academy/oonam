package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a distance in Km: ");

        int km = scanner.nextInt();
        double mile = km * 0.6213712;

        System.out.println("Miles: " + mile + " miles");

    }
}
