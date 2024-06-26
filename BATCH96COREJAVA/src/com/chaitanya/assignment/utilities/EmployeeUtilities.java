package com.chaitanya.assignment.utilities;
import com.chaitanya.assignment.employees.Employee;
import com.chaitanya.assignment.employees.Manager;
import com.chaitanya.assignment.employees.Developer;
//creating a class named EmployeeUtilities
public class EmployeeUtilities {
	//creating a function or method which going to increase the salary of instance of manager or developer
	public static void increaseSalary(Employee employee, double percentage) {
        double currentSalary = employee.getSalary();
        double newSalary = currentSalary + (currentSalary * percentage / 100);
        employee.setSalary(newSalary);
    }
//function for printing the employ details
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
// print only if the passed instance is Manager or Developer
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }
}