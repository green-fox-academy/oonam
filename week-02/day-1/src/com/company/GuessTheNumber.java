package com.company;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int num = 8;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        while (num2 != num){
            System.out.println("Give a number: ");
            num2 = scanner.nextInt();

            if (num2 > num){
                System.out.println("The stored number is lower");
            } else if (num2 < num) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("You found the number: " + num);
            }
        }

    }
}
