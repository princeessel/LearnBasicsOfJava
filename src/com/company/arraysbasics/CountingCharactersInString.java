package com.company.arraysbasics;

public class CountingCharactersInString {
    public static void main(String[] args) {
        String[] statementList = {"NOT EVERYONE WEARING A TOMMY HILFIGER TSHIRT IS SELLING OUT", "MEN AND WOMEN ARE NOT EQUAL",
                "ETHNIC GROUP A AND ETHNIC GROUP B ARE NOT EQUAL", "BIG BUSINESS IS NOT ALWAYS A BAD THING",
                "THERE ARE GOOD TELEVISION SHOWS", "NOT EVERYONE WITH LONG, NAPPY HAIR SMOKES POT", "STEREOTYPES WORK", "STEREOTYPES SUCK"};


        int[] letterCount = new int[26];

        for (int i = 0; i < statementList.length; i++) {
            String current = statementList[i];
            char[] letters = current.toCharArray();
            for (int j = 0; j < letters.length; j++) {
                char lett = letters[j];
                if (lett >= 'A' && lett <= 'Z') {
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Z'; count++) {
            System.out.print(count + ": " +
                    letterCount[count - 'A'] + " ");
            if (count == 'M') {
                System.out.println();
            }
        }
        System.out.println();
    }
}
