package com.Lesson_1;

public class PrintString {
    public static void main(String[] args) {
        printString("Hello", 3);
    }
    public static void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}

