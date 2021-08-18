// Find the first repeated character in a given string
package com.JavaHashTables;

import java.util.HashMap;

class checkString{
    private String str ;
    public checkString(String str){
        this.str=str;
    }
    public char getFirstRepeatedCharacter(){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()){
            int count = map.containsKey(ch)?map.get(ch):0;
            map.put(ch,count+1);
        }
        for(char ch:str.toCharArray()){
            if(map.get(ch)>1){
                return ch;
            }
        }
        return 0;
    }
}
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        // green apple
        // first repeated character is e
        checkString string = new checkString("green apple");
        var result = string.getFirstRepeatedCharacter();
        System.out.println(result);//e

    }
}
