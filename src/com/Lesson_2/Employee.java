package com.Lesson_2;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    // Конструктор класса
    public Employee(String fullName, String jobTitle, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте в консоль
    public void displayInfo() {
        System.out.println("fullName: " + fullName);
        System.out.println("jobTitle: " + jobTitle);
        System.out.println("email: " + email);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("salary: " + salary);
        System.out.println("age: " + age);
    }
}
