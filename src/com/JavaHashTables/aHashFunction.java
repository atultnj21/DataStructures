// what if our keys were string?
package com.JavaHashTables;

import java.util.HashMap;
import java.util.Map;

public class aHashFunction {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("123456-A","Atul");
        System.out.println(hash("123456-A"));//19

    /* In java every oject has a method called hashCode()
      The hashMap class in java uses this hashCode() and
      does some extra work to map it to an index value */
        String str ="orange";
        System.out.println(str.hashCode());//-1008851410
    }
    /* Every character in a computer is represented by a
       number internally so we can get the numeric representation
       of each character add them all together.
       even if we are working with characters here , because we
       have declared hash as intger ,when we add this character
       will get automatically converted to an integer .
       this is what we call implicit casting */
    public static int hash(String number){
        int hash =0;
        for(char ch : number.toCharArray()){
            hash=hash+ch;
        }
        return hash%100;
    }
}

/* Now ,this is a super simplified implementation there are
   so many Algorithms for calculating hashes. these algorithms are
   used in cryptography , for example when storing password
   of people we don't wanna store them in plain text so we pass
   them to hash function and this hash function would generate
   a long complicated string based on the password */