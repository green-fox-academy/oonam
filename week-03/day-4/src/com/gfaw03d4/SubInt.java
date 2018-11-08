package com.gfaw03d4;

import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        int a = 2s;
        int[] b = {1, 11, 34, 52, 61};

        System.out.println(subInt(a, b));
    }

    public static ArrayList<Integer> subInt(int num, int[] list) {
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            if (String.valueOf(list[i]).contains(String.valueOf(num))){
                index.add(i);
            }
        }

        return index;
    }
}