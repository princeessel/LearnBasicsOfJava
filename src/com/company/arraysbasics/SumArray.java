package com.company.arraysbasics;

public class SumArray {
    public static void main(String[] args) {
        String[] numbers = {"5", "10", "12", "20", "23", "30"};
        int sum = 0;
        int i = 0;
        for (String tempNum : numbers) {
            sum = sum + Integer.parseInt(tempNum);
        }
        System.out.println(sum);
    }
}
