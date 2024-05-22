package com.Lesson_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andrew Thompson", "Developer", "Thompson@example.com", "111-111-111", 60000, 30);
        employees[1] = new Employee("Jane Smith", "Manager", "jane.smith@example.com", "222-222-222", 75000, 35);
        employees[2] = new Employee("Alice Johnson", "Designer", "alice.johnson@example.com", "333-333-333", 55000, 28);
        employees[3] = new Employee("William Roberts", "Analyst", "Roberts@example.com", "444-444-444", 65000, 40);
        employees[4] = new Employee("Charlie White", "Engineer", "charlie.white@example.com", "555-555-555", 70000, 32);

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("------------------------");
        }
    }
}


