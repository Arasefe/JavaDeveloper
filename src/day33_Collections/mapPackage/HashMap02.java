package day33_Collections.mapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap02 {
    public static void main(String[] args) {
        method();
    }

    private static void method(){
        HashMap<String, Integer>hm=new HashMap<>();
        hm.put("Aras",2014);
        hm.put("Tulpar",2016);
        hm.put("Efe",1999);
        hm.put("Ege",2011);

        System.out.println(hm);
        // How to iterate in HashMap
        // 1st way with for-each and Map.entrySet();
        // for-each loop works with Collection. To convert Map to a Collection need to use entrySet()
        for (Map.Entry<String,Integer> each : hm.entrySet()) {
            System.out.println(each.getKey()+" ");              // Returns only keys

            System.out.println(each.getValue()+" ");            // Returns only values

            System.out.println(each);                           // Returns key and value pairs

        }


    }


    private static void method2(){
        // 2nd way with Iterator on Map.entrySet();
        HashMap<String, Integer>hm=new HashMap<>();
        hm.put("Aras",2014);
        hm.put("Tulpar",2016);
        hm.put("Efe",1999);
        hm.put("Ege",2011);
        // Iterator works with Collection so need to convert Map to Collection with entrySet()
        Iterator<Map.Entry<String,Integer>>hmItr=hm.entrySet().iterator();

        while(hmItr.hasNext()){
            Map.Entry<String,Integer>entry= hmItr.next();
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
