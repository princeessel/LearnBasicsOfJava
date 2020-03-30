package com.company.arraysbasics;

public class CalculateTax {
    public static void main(String[] args) {
        int principal = 12000;
        double taxRate;
        double tax;

        if (principal<= 15000) {
            taxRate = 0.1;
            tax = principal * taxRate;

        } else if (principal<=40000) {
            taxRate = 0.2;
            tax = principal * taxRate;
        } else {
            taxRate = 0.3;
            tax = principal * taxRate;
        }
        System.out.println("Tax is : " +tax);
    }
}
