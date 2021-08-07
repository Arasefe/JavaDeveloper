package day33_Collections.queuePackage;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeSet;

public class Deque02 {
    public static void main(String[] args) {
        method();
    }

    private static void method(){
        Deque<String> dq2 = new LinkedList<>();
        dq2.add("A");
        dq2.add("B");
        dq2.add("A");
        dq2.add("C");
        dq2.add("A");
        dq2.add("D");

        TreeSet<String> ts = new TreeSet<>(dq2);

        System.out.println(ts);
    }
}
