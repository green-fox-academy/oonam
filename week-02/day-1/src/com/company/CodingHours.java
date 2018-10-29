package com.company;

public class CodingHours {
    public static void main(String[] args) {
        int hours = 6;
        int weeks = 17;
        double codingHoursWeekly = hours * 5.0;
        double workhoursWeekly = 52.0;

        System.out.println(weeks * workhoursWeekly + " hours code we in a semester.");
        System.out.println((codingHoursWeekly / workhoursWeekly) * 100 + "% is the coding hours of a week.");
    }
}
