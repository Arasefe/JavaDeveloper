package day33_Collections.mapPackage;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
    Sorts the keys in natural order
    TreeMap is not threadsafe and synchronised
    null is not accepted as a key but multiple null accepted as a value
    TreeMap is the slowest then HashTable and then HashMap
     */
    public static void main(String[] args) {
        //method1();
        method2();
    }

    private static void method1(){
        TreeMap<String, Integer>tm=new TreeMap<>();
        tm.put("Aras",2016);
        tm.put("Efe",1998);
        tm.put("Tulpar",2016);
        tm.put("Ege",2016);
        tm.put("Banu",1982);

        System.out.println(tm);



    }

    private static void method2(){
        HashMap<String, Integer>hm=new HashMap<>();
        hm.put("Dan",1982);
        hm.put("Travis",1988);
        hm.put("Aidan",1980);
        hm.put("Andrew",1980);

        System.out.println(hm);

        TreeMap<String, Integer>tm=new TreeMap<>(hm);
        System.out.println(tm);
    }
}
