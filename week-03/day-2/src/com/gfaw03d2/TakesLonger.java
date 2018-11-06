package com.gfaw03d2;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder sb = new StringBuilder(quote);
        int indexOfA = sb.indexOf(" you");
        sb.insert(indexOfA + 1, "always takes longer than ");

        System.out.println(sb);

    }
}
