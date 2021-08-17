package day33_Collections.mapPackage;

import java.util.HashMap;

public class Map01 {
    /*
    --MAP--
    No index
    Can not contain duplicates
    --HashMap--
    Random Order so it is fast
    Accepts one null to key and repeated nulls to value
    HashMaps are not thread-safe and synchronised


     */
    public static void main(String[] args) {
        method();
    }

    private static void method(){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Aras", 2014);
        hm.put("Tulpar", 2016);
        hm.put("Banu", 1982);
        hm.put("Ismail", 1977);
        hm.put("Efe", 1998);
        hm.put(null, 1998);


        System.out.println(hm.get("Tulpar"));

        System.out.println(hm.getOrDefault("Banu",0));

        System.out.println(hm.keySet());            // Returns all the keys

        System.out.println(hm.values());            // Returns all the values

        System.out.println(hm.containsKey("Ege"));  // False

        System.out.println(hm.containsValue(1998)); // True


    }


    private static void method2(){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Ali",1999);
        hm.put("Ayse",2001);
        hm.put("Anna",1989);



        HashMap<String,Integer>hm1=new HashMap<>();
        hm1.put("Daniel", 2000);
        hm1.put("Travis", 2002);
        hm1.put("Emmy", 1985);
        hm.putAll(hm1);

        System.out.println(hm);
        System.out.println(hm1);

        hm1.putIfAbsent("Aaron",1978);      // If element exists do not change the value, if not add the key value pairs
        System.out.println(hm1);

        hm1.replace("Aaron",1981);          // Finds the key if exists and replaces the value with the new value

    }
}
