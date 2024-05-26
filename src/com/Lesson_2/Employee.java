package com.Lesson_2;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
