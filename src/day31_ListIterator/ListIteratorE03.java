package day31_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorE03 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.add("Q");
        System.out.println(list1);
        // As the pointer is at the beginning it will add to the beginning
        ListIterator<String> itr1=list1.listIterator();
        itr1.add("T");
        itr1.add("U");
        itr1.add("V");

        System.out.println(list1);
    }
}
