package com.Algorithms.
        StringManipulationAlgorithms.Exercises;

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
}
