package com.company.arraysbasics;

public class Arrays {
    public static void main(String[] args) {
        String bestProgrammer = "Prince-Otis is noted for writing quality code.";
        char[] best = bestProgrammer.toCharArray();

        for (char current : best) {
            if (current != ' ') {
                System.out.print(current);
            } else {
                System.out.print(".");
            }
        }
    }
}
