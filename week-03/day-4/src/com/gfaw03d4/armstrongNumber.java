package com.gfaw03d4;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        String userNumber = input.nextLine();

        int number = Integer.parseInt(userNumber);
        int sum = 0;
        int temp = number;

        for (int i = 0; i < userNumber.length(); i++) {
            sum += Math.pow((double) (temp % 10), (double) userNumber.length());
            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println("The " + number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
