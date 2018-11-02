package com.gfaw02d2;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
//        //  Create a function that takes a list of numbers as parameter
//        //  Returns a list where the elements are sorted in ascending numerical order
//        //  Make a second boolean parameter, if it's `true` sort that list descending
//
//        //  Example:
//        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//        //  should print [5, 9, 12, 24, 34]
//        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//        //  should print [34, 24, 12, 9, 5]

        int[] anArray = {34, 12, 94, 9, 5};
        boolean button = true;

//        int[] sortedArray = bubble(anArray);
//        printArray(sortedArray);

        if (button == false) {
            printArray(bubble(anArray));
        } else {
            printArray(advancedBubble(anArray));
        }
    }

    public static void printArray(int[] input) {
        for (int elements : input
        ) {
            System.out.print(elements + " ");
        }
    }

    public static int[] advancedBubble(int[] input2) {
        int[] adBubble = bubble(input2);
        int temp = 0;

        for (int i = 0; i < adBubble.length / 2; i++) {
            temp = adBubble[i];
            adBubble[i] = adBubble[adBubble.length - i - 1];
            adBubble[adBubble.length - i - 1] = temp;
        }

        return adBubble;
    }

    public static int[] bubble(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
