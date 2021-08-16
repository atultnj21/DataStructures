//Find the first non repeated character in the string.
/*
Step 1: get character array and loop through it to build
a hash table with char and their count.
Step 2: loop through character array to find an entry with value 1
in HashMap, that's your first non-repeated character

*/
package com.JavaHashTables;

import java.util.HashMap;

class StringOperation{
    private String string;
    private HashMap<Character,Integer> map= new HashMap<>();
    public StringOperation(String string){
        this.string=string;
    }
    public char getFirstNonRepeatedCharacter(){
        for(var ch : string.toCharArray()){
            var count=(map.containsKey(ch)?map.get(ch):0);
            map.put(ch,count+1);
        }
        System.out.println(map);
        //{ =2, p=2, a=2, r=1, e=3, g=1, l=1, n=1}
        // they are not in order so we will iterate through string
        //and get the count the first char to have count 1 will
        // be returned
        for(var item : string.toCharArray()){
            if(map.get(item)==1){
                return item;
            }
        }
        return 0;
    }
}

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        // a green apple
        // here the first non repeated character is 'g' .
        StringOperation str = new StringOperation("a green apple");
        var result=str.getFirstNonRepeatedCharacter();
        System.out.println(result);
    }
}
