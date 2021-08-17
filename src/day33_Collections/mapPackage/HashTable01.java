package day33_Collections.mapPackage;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable01 {
    /*
    HashTable is thread safe and synchronised
    HashTable does not put elements in any order
    null is not accepted to keys and values

     */
    public static void main(String[] args) {
        method1();
    }

    private static void method1(){
        Hashtable<String,Integer>ht=new Hashtable<>();
        ht.put("Aras",2014);
        ht.put("Tulpar",2014);
        ht.put("Banu",1982);
        ht.put("Ismail",1977);
        ht.put(null,1977);          // throws NullPointerException

        System.out.println(ht);
    }
}
