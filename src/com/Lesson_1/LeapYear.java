package com.Lesson_1;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = isLeapYear(year);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
