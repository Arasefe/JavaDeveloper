package day33_Collections.queuePackage;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        queueMethods();
    }

    private static void queueMethods(){
        Queue<String>q1=new LinkedList<>();
        q1.add("Aras");
        q1.add("Tulpar");
        q1.add("Banu");
        q1.add("Ege");
        q1.add("Efe");

        q1.element();       // Retrieves, but does not remove, the head of this queue
                            // @throws NoSuchElementException if this queue is empty

        q1.peek();          // Retrieves, but does not remove, the head of this queue,
                            // Returns {@code null} if this queue is empty.

        q1.poll();          // Retrieves and removes the head of this queue,
                            // Returns {@code null} if this queue is empty.

        q1.remove();        // Retrieves and removes the head of this queue.
                            // @throws NoSuchElementException if this queue is empty

        q1.offer("XXX"); // Inserts the specified element into this queue if it is possible to do
                            // so immediately without violating capacity restrictions.

        q1.add("YYY");      // Inserts the specified element into this queue if it is possible to do so
                            // immediately without violating capacity restrictions, returning
                            // * {@code true} upon success and throwing an {@code IllegalStateException}
                            // * if no space is currently available.

        System.out.println(q1);
    }
}
