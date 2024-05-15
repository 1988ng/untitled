package com.Lesson_1;

public class ArrayLenInitialValue {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 20;
        int[] resultArray = createArray(len, initialValue);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
