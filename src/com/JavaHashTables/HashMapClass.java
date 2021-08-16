//HashMap class in java
package com.JavaHashTables;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        // Key: Employee Number (Integer)
        // Value : Name (String)
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Tony");
        map.put(2,"Thor");
        map.put(3,"BruceBanner");
        System.out.println(map);
        //{1=Tony, 2=Thor, 3=BruceBanner}

        map.put(3,"ScarlettWitch");
        System.out.println(map);
        //{1=Tony, 2=Thor, 3=ScarlettWitch}
        //previous value was overridden with the new value
        //the hash Map cannot have duplicate keys

        // ** HashMap allows null keys and null values
        map.put(4,null);
        System.out.println(map);
        //{1=Tony, 2=Thor, 3=ScarlettWitch, 4=null}
        //we can store null values
        map.put(null,null);
        System.out.println(map);
        //{null=null, 1=Tony, 2=Thor, 3=ScarlettWitch, 4=null}

        map.remove(4);
        map.remove(null);
        System.out.println(map);
        //{1=Tony, 2=Thor, 3=ScarlettWitch}

        var value=map.get(3);
        System.out.println(value);
        // ScarlettWitch

        /*
         when we call containsKey method our
         HashMap gets this key and passes it to its Hash Function
         to figure out where this object should be stored
         then it will lookit up if there is an object on that location
         it will return true otherwise false ,this is superfast it
         doesn't require iterating over objects

         when we call containsValue Method our hashmap cannot
         rely on its hash function, it has to iterate over all the
         objects and compare the value with this argument.
         */
        boolean result=map.containsKey(3);  //O(1)
        boolean reslt=map.containsKey("Tony"); //O(n)
        System.out.println(result+" "+reslt);//true false

        //iterating over HashMap
        for(var item: map.keySet()){
            System.out.println(item);
        }
        /*
         1
         2
         3
        */
        //iterating over HashMap
        for(var item: map.entrySet()){
            System.out.println(item);
        }
        /*
          1=Tony
          2=Thor
          3=ScarlettWitch
        */
        //iterating over HashMap
        for(var item: map.keySet()){
            System.out.println(item+" "+map.get(item));
        }
        /*
          1 Tony
          2 Thor
          3 ScarlettWitch
        */
    }
}
