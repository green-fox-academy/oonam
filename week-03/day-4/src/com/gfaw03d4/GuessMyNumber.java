package com.gfaw03d4;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    int guessNumber = 0;

    System.out.print("How many lives would you like to have? Number: ");
    int lives = scanner.nextInt();

    System.out.print("\nPls, give me two numbers, the game will generate a random number between them.\nFloor: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Ceiling: ");
    int secondNumber = scanner.nextInt();

    int randNumRange = randomNumberGeneratorInRange(firstNumber, secondNumber, rand);
    System.out.println("(Just testing purpose: the randomize number is " + randNumRange);

    int leftLives = guessAgainAndAgain(guessNumber, lives, scanner, randNumRange);

    if (leftLives > 0) {
      System.out.println("Success, You won! Lives left: " + leftLives);
    } else {
      System.out.println("Ohh nooo, your lives is out...");
    }
  }

  public static int randomNumberGeneratorInRange (int min, int max, Random rand) {
    int range = (max - min) + 1;
    int guessNumber = rand.nextInt(range) + min;
    return guessNumber;
  }

  public static int guessAgainAndAgain (int guessNumber, int asd, Scanner scanner, int randNumRange) {
    do {
      System.out.print("\nGive me your guess number: ");
      guessNumber = scanner.nextInt();
      --asd;

      if (guessNumber > randNumRange){
        System.out.println("Your number is too high. Lives left " + asd);
      } else if (guessNumber < randNumRange) {
        System.out.println("Your number is too low. Lives left " + asd);
      }
    } while ((guessNumber != randNumRange) && (asd != 0));

    return asd;
  }
}
