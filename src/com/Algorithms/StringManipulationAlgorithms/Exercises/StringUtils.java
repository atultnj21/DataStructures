package com.Algorithms.
        StringManipulationAlgorithms.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class StringUtils {
    //countVowels
    public static int countVowels(String str){
        int count=0;
        String vowels = "aeiou";
        String string = str.toLowerCase();
        for(char i : string.toCharArray()){
            if(vowels.indexOf(i)!=-1)
                count = count + 1;
        }
        return count;
    }

    //stringReverse
    public static String stringReverse(String str) {
        if(str==null)
            return "";
        //creates mutable string
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){//O(n)
            reversed.append(str.charAt(i));//O(1)
        }
        return reversed.toString();

        /*
        String reversed ="";
        for(int i = str.length()-1;i>=0;i--){//O(n)
            reversed+=str.charAt(i);//O(n)
        }
        return reversed;

        Problem with this approach:
        Strings are immutable in Java When you create
        a String object you cannot modify it ,Any changes
        you make to that string results in creatin of
        another string object in memory ,so the original
        string will remain unaffected, every time we append
        a character to the string we create a new object and
        all the characters in the current string are being
        copied to the new string,as our string gets longer
        the number of characters that should be copied to
        the new string object increases .
        */
    }

    //reverseWords
    public static String reverseWords(String sentence){
        if(sentence==null)
            return "";
        /*StringBuilder reversed = new StringBuilder();
        String[] words = sentence.trim().split(" ");
        for (int i = words.length-1;i>=0;i--)
            reversed.append(words[i]+" ");
        return reversed.toString();*/

        StringBuilder reversed = new StringBuilder();
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
    }
}
