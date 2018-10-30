package com.gfaw02d2;

public class Reverse {
    public static void main(String[] args) {
        int aj[] = {3, 4, 5, 6, 7};
        int temp = 0;

//        for (int i = aj.length; i > 0; i--) {
//            System.out.println(aj[i-1]);            
//        }

        for (int i = 0; i < aj.length; i++) {
//            System.out.println(aj[aj.length - (i+1)]);
            temp = aj[aj.length - (i+1);
            aj[i] = temp;
            System.out.println(aj[i]);
        }
    }
}
