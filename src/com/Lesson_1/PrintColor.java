package com.Lesson_1;

public class PrintColor {
    public static void main (String[] args){
        printColor();
    }
    public static void printColor(){
        int value = 101;
        if (value <= 0){
            System.out.println("Red");
        } else if (value >= 1 && value <= 100){
            System.out.println("Yellow");
        } if (value>100){
            System.out.println("Green");
        }
    }
}
