package com.company.classesandobjects;

/**
 * The Employee class has four instance variables - name, age, designation and salary.
 * The class has one explicitly defined constructor, which takes a parameter.
 */
public class Employee {

    private String name;
    private int age;
    private double salary;
    private String designation;

    public Employee(String name) {
        this.name = name;
    }

    public void employeeAge(int age) {
        this.age = age;
    }

    public void employeeSalary(double salary) {
        this.salary = salary;
    }

    public void employeeDesignation(String designation) {
        this.designation = designation;
    }

    public void printEmployeeInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
}
