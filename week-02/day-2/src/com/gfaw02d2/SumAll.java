package com.gfaw02d2;

public class SumAll {
    public static void main(String[] args) {
        int ai[] = {3, 4, 5, 6, 7};
        int temp = 0;

        for (int i = 0; i < ai.length; i++) {
            temp += ai[i];
            System.out.println(temp);
        }
    }
}
