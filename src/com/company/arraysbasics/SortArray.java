package com.company.arraysbasics;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        String[] planetList = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};


        System.out.println("Original order of Planetlist:");
        for (int i = 0; i < planetList.length; i++) {
            System.out.println(planetList[i]);
        }

        //Sorting the planet list using the Array's sort function
        Arrays.sort(planetList);
        System.out.println();
        System.out.println("Sorted planet List:");

        for (int i = 0; i < planetList.length; i++) {
            System.out.println(planetList[i]);
        }
    }
}
