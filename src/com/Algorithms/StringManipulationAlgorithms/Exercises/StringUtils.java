package com.Algorithms.
        StringManipulationAlgorithms.Exercises;

import java.util.*;

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

    //areRotations
    /*
    * ABCD -> DABC  1char
    *      -> CDAB  2char      same length same order
    *      -> BCDA  3char
    *      -> ABCD  4char

    * Approach :-
      we will concatenate String 1 with itself
      ABCDABCD so same sequence of characters
      are repeated in same order this string
      here contains DBAC ,CDAB ,BCDA,ABCD.
    */
    public static boolean areRotations(
            String str1,String str2){

        if(str1 == null || str2 == null)
            return false;
        return  (str1.length()==str2.length() &&
                ((str1+str1)).contains(str2));

        /*if(str1.length()!=str2.length())
            return false;
        if(!((str1+str1)).contains(str2))
            return false;
        return true;*/
    }

    //removeDuplicates
    public static String removeDuplicates(String str){
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for(var ch: str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    //findMostRepeatedCharacter
    public static char findMostRepeatedCharacter(String str){

       /* if(str.isEmpty() || str == null)
            throw new IllegalArgumentException();
        Map<Character,Integer> frequencies = new HashMap<>();
        for(var ch: str.toCharArray()){
            int count = frequencies.containsKey(ch)
                    ? frequencies.get(ch): 0 ;
            frequencies.put(ch,count+1);
        }
        int max =0;
        char result=' ';
        for(var ch : str.toCharArray()){
            if(frequencies.get(ch)>max){
                max = frequencies.get(ch);
                result = ch;
            }
        }
        return result;*/

        /* what if we don't have access to HashTables we
           can use an integer array to store the frequencies
           let's say our input value only contains ASCII values
           AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE
           its basically a table that maps various characters
           to there standard numeric values in the computer */
        if(str.isEmpty() || str == null)
            throw new IllegalArgumentException();
        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];
        for(char ch: str.toCharArray()){
            frequencies[ch]++;
        }
        int max = 0 ;
        char result = ' ';
        for(int i = 0 ; i < frequencies.length ; i++){
            if(frequencies[i]> max){
                max = frequencies[i];
                result = (char) i;
            }
        }
        return result;
    }

}