package com.Algorithms.
        StringManipulationAlgorithms.Exercises;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.countVowels
                        ("HELLO"));//2

        System.out.println(StringUtils.stringReverse
                ("hello"));//olleh

        System.out.println(StringUtils.reverseWords
                ("Trees are beautiful"));
                //beautiful are Trees

        System.out.println(StringUtils.areRotations
                ("ABCD","DABC"));//true

        System.out.println(StringUtils.removeDuplicates
                ("Hellooo!!"));

        System.out.println(StringUtils.
                findMostRepeatedCharacter
                        ("Helloooo"));//o

        System.out.println(StringUtils.
                capitaliseFirstLetter
                        ("   trees       are       beautiful   "));
                //Trees Are Beautiful

        System.out.println(StringUtils.
                isAnagram("ABCd","DCBA"));//true

        System.out.println(StringUtils.
                isPalindrome("ABBA"));//true
    }
}
