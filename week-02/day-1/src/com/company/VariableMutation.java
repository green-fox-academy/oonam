package com.company;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a = a + 9;
        System.out.println(a);

        int b = 100;
        b = b - 95;
        System.out.println(b);

        int c = 44;
        c = c * 2;
        System.out.println(c);

        int d = 125;
        d = d / 5;

        int e = 8;
        e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f = f1 > f2;
        System.out.println(f);

        int g1 = 350;
        int g2 = 200;
        boolean g = (g2 * 2) > g1;
        System.out.println(g);

        int h = 135798745;
        if (h % 11 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int i1 = 10;
        int i2 = 3;
        int i = 0;
        if (i1 > (i2 * i2) && i1 < (i2 * i2 * i2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int j = 1521;
        if (j % 3 == 0 || j % 5 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String k = "Apple";
        for (int l = 0; l < 4; l++) {
            System.out.print(k);
        }
    }
}
