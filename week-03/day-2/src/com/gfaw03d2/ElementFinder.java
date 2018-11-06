package com.gfaw03d2;

import java.util.*;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7));
        System.out.println(containsSeven(arrayList));
    }

    public static ArrayList<Integer> containsSeven(ArrayList<Integer> newList) {
        if (newList.contains(7)) {
            System.out.println("Hoooray");
        } else {
            System.out.println("Nooo");
        }

        return newList;
    }
}
