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

        System.out.println(hm.keySet());



    }
}
