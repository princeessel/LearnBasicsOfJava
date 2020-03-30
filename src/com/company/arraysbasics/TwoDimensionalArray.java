package com.company.arraysbasics;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declare the 2 dim array
        int[][] twoDimArray = new int[3][3];
        System.out.println("The two dim matrix is:  ");

        int temp = 5;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDimArray[i][j] = temp;
                temp += 5;
            }
        }

        //Print the 2 dim array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
