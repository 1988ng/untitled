package com.Lesson_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Smith", "Developer", "john.smith@example.com", "1234567890", 60000, 35);
        employees[1] = new Employee("Jane Smith", "Manager", "jane.smith@example.com", "0987654321", 75000, 35);
        employees[2] = new Employee("Alice Johnson", "Designer", "alice.johnson@example.com", "1122334455", 55000, 28);
        employees[3] = new Employee("Bob Johnson", "Analyst", "bob.johnson@example.com", "5566778899", 65000, 30);
        employees[4] = new Employee("Charlie Brown", "Engineer", "charlie.brown@example.com", "9988776655", 70000, 32);

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("------------------------");
        }
    }
}
