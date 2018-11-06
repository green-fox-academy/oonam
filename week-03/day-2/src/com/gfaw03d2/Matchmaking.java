package com.gfaw03d2;

import java.util.*;
public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girlsNames, ArrayList<String> boysNames){
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < girlsNames.size() && i < boysNames.size(); i++) {
            output.add(girlsNames.get(i) + ", " + boysNames.get(i));
        }

        return output;
    }
}
