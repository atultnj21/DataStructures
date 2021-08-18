/*
 In this question we need not to record the frequency
 of each character we can immediately return the repeated
 Character
 */
package com.JavaHashTables;

import java.util.HashSet;
import java.util.Set;

class StringCheck{
    private String str ;
    public StringCheck(String str){
        this.str=str;
    }
    public char getFirstRepeatedCharacter(){
        Set<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(set.contains(ch))
                return ch;
            else
                set.add(ch);

        }
        return 0;
    }
}
public class aFirstRepeatedCharacter {
    public static void main(String[] args) {
        StringCheck string = new StringCheck("green apple");
        var result =string.getFirstRepeatedCharacter();
        System.out.println(result);//e
    }
}
