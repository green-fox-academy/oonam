package com.gfaw03d2;

import java.util.*;

public class Candyshop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

    public static ArrayList<Object> sweets(ArrayList<Object> newList){
        newList.set(1, "Croissant");
        newList.set(3, "Ice cream");

        return newList;
    }
}
