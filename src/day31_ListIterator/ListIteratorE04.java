package day31_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorE04 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.add("Q");
        System.out.println(list1);
        // If want to add to end
        ListIterator<String> itr1=list1.listIterator();
        while(itr1.hasNext()){
            itr1.next();
        }
        itr1.add("T");
        itr1.add("U");
        itr1.add("V");

        System.out.println(list1);
    }
}
