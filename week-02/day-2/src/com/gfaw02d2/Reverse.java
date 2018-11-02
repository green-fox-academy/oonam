package com.gfaw02d2;

public class Reverse {
    public static void main(String[] args) {
        int aj[] = {3, 4, 5, 8, 7};
        int temp = 0;

        for (int i = 0; i < aj.length / 2; i++) {
            temp = aj[i];
            aj[i] = aj[aj.length - i - 1];
            aj[aj.length - i - 1] = temp;
        }

        for (int elements : aj
             ) {
            System.out.println(elements);
        }
    }
}
