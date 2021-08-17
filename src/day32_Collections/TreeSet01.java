package day32_Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
    All elements are unique in ascending order
    Soo slow as spend too much time for setting ascending order
    Accepts unique elements (if duplicate element is given java overwrites)

     */
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Aras");
        ts.add("Tulpar");
        ts.add("Banu");
        ts.add("Efe");
        ts.add("Ege");
        System.out.println(ts);
        System.out.println(ts.ceiling("Aras"));
        System.out.println(ts.ceiling("Banum"));
        System.out.println(ts.ceiling("Efem"));
        System.out.println(ts.floor("Efem"));
        System.out.println(ts.floor("Banu"));
        System.out.println(ts.floor("Tulpar"));

        System.out.println(ts.descendingSet());

        System.out.println(ts.headSet("Aras"));
        System.out.println(ts.headSet("Ege"));
        System.out.println(ts.headSet("Banu"));

        System.out.println(ts.tailSet("Ege"));
        System.out.println(ts.tailSet("Efe"));
        System.out.println(ts.tailSet("Aras"));


        System.out.println(ts.higher("Aras"));
        System.out.println(ts.lower("Banu"));



    }
}
