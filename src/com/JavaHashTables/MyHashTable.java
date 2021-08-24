/*
Building a HashTable
put(k,v)
get(k) : v
remove(k)
k:integer
v:string
collision:chaining
*/
package com.JavaHashTables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class HashTable{
    // Entry class to wrap key value pairs
   private class Entry{
       private int key;
       private String value;
       public Entry(int key,String value){
           this.key=key;
           this.value=value;
       }
   }
   // Array of (linked list of Entry)
   private LinkedList<Entry>[] entries = new LinkedList[5];

   // put()
   public void put(int key,String value){
       var index=hash(key);
       if(entries[index]==null)
           entries[index]=new LinkedList<>();
       //if we had an entry with the duplicate key we update the value
       for(var entry : entries[index]){
           if(entry.key==key){
               entry.value=value;
               return;
           }
       }
       var entry = new Entry(key,value);
       entries[index].addLast(entry);
   }

   //hash()
   private int hash(int key){
       return Math.abs(key% entries.length);
   }

   //get()
    public String get(int key){
       var index=hash(key);
       var bucket = entries[index];
       if(bucket!=null) {
           for (var entry :bucket) {
               if (key == entry.key) {
                   return entry.value;
               }
           }
       }
       return null;
    }
    //remove()
    public void remove(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            throw new IllegalStateException();
        for (var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }
}

public class MyHashTable {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6,"A");//1
        table.put(8,"B");//3
        table.put(11,"C");//1
        System.out.println("done");
        table.put(6,"A+");
        System.out.println( table.get(6));//A+
        table.remove(6);
    }
}
