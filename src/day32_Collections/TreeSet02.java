package day32_Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
    public static void main(String[] args) {
        /*
        Unique elements in natural order
        First use TreeSet to order in naturally then assign it to HashSet
         */
        method();

    }

    private static void method(){
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Aras");
        ts.add("Tulpar");
        ts.add("Banu");
        ts.add("Efe");
        ts.add("Ege");
        System.out.println(ts);

        HashSet<String> hs=new HashSet<>(ts);
        System.out.println(hs);
    }
}
