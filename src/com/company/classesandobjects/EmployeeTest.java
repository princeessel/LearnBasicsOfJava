package com.company.classesandobjects;

/**
 * EmployeeTest class, which creates two instances of the class Employee and invokes
 * the methods for each object to assign values for each variable.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee prince = new Employee("Prince Otis");
        Employee nanaSarpong = new Employee("Nana Sarpong Essel");


        prince.employeeAge(36);
        prince.employeeSalary(100000.00);
        prince.employeeDesignation("Software Engineer");
        prince.printEmployeeInfo();
        System.out.println();
        nanaSarpong.employeeAge(11);
        nanaSarpong.employeeSalary(500000.00);
        nanaSarpong.employeeDesignation("Snr. Software Engineer");
        nanaSarpong.printEmployeeInfo();

    }
}
