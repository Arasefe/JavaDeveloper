package day32_Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetLHS01 {
    public static void main(String[] args) {
        /*
        LinkedHashSet puts the elements in insertion order
        LinkedHashSet spends some time to do this thus slower than
        HashSet which puts the elements in RANDOM order
         */

        linkedHashSetMethods();

    }

    private static void linkedHashSetMethods(){
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("YZ");
        lhs.add("N");
        lhs.add("P");
        lhs.add("C");
        lhs.add("ABC");

        System.out.println(lhs);
    }
}
