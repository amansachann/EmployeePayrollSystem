package org.example;

public class Main {

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Employee emp1 = new FullTimeEmployee(1001, "Aman Sachan", 90000);
        Employee emp2 = new PartTimeEmployee(1002, "Akash Gupta", 300, 1200);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.displayEmployeeList();
    }
}