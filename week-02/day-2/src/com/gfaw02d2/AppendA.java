package com.gfaw02d2;

public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};

        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i] + "a";
            System.out.println(animals[i]);
        }
    }
}