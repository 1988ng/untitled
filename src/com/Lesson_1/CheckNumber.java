package com.Lesson_1;

public class CheckNumber {
    public static void main(String[] args) {
        int number = 36;
        boolean result = isNegative(number);
        System.out.println(result);
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
}
