package day33_Collections.queuePackage;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

    }

    private static void method(){
        Deque<String> dq1 = new LinkedList<>();

        dq1.addFirst("A");
        dq1.addLast("Z");
        dq1.getFirst();
        dq1.getLast();

        dq1.offerFirst("B");
        dq1.offerLast("Y");

        dq1.peekFirst();
        dq1.peekLast();

        dq1.pollFirst();
        dq1.pollLast();

        dq1.removeFirst();
        dq1.removeLast();

        dq1.removeFirstOccurrence("A");
        dq1.removeLastOccurrence("A");

        System.out.println(dq1);
    }
}
