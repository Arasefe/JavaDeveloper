package day32_ListIterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

/*
The major difference between Iterator and ListIterator is that
Iterator can traverse the elements in the collection only in forward direction
whereas, the ListIterator can traverse the elements in a collection in both the forward as well as the backwards direction.
Iterator is unable to add elements to a collection.
ListIterator can add elements to a collection.
Iterator can not modify the elements in a collection.
ListIterator can modify the elements in a collection using set().
Iterator can traverse Map, List and Set.
ListIterator can traverse List objects only.
Iterator has no method to obtain an index of the element in a collection.
Using ListIterator, you can obtain an index of the element in a collection.
 */
public class ListIteratorE01 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Sam");
        list.add("Naveed");
        list.add("Mark");
        list.add("Tom");
        list.addLast("Richard");
        System.out.println(list);

        list.add("Travis");
        list.add(2,"Aidan");
        list.addFirst("Andrew");
        list.addLast("Richard");


        System.out.println(list);

        System.out.println(list.contains("Daniel"));
        System.out.println(list.contains("Sam"));

        // Gets the first element
        // For empty list returns exception
        System.out.println(list.element());

        // Retrieves and removes the first element
        // For empty list returns null
        list.poll();
        System.out.println(list);

        // Returns the first element without throwing exception
        list.peek();

        list.removeFirstOccurrence("Richard");

        System.out.println(list);

        list.add("Sam");

        System.out.println(list);

        list.removeLastOccurrence("Sam");

        System.out.println(list);

        Predicate<String> lessThan5= p->p.length()<5;
        list.removeIf(lessThan5);

        System.out.println(list);

    }

}
