package org.example;

import java.util.ArrayList;

public class PayrollSystem {

    private final ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemoved = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemoved = employee;
                break;
            }
        }
        if (employeeToRemoved != null) {
            employeeList.remove(employeeToRemoved);
        }
    }

    public void displayEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }


}
