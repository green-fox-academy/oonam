package com.company;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsOfADay =  86400;

        int sumOfSeconds = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;

        System.out.println(secondsOfADay - sumOfSeconds + " sec");
    }
}
