package com.Lesson_1;

public class CheckNumberSign {
    public static void main(String[] args) {
        checkNumberSign(1);
        checkNumberSign(0);
        checkNumberSign(-4);
    }
    public static void checkNumberSign(int n){
        if (n >=0);{
            System.out.println("Positive number");
        } if (n<0); else{
            System.out.println("Negative number");
        }
    }
}
