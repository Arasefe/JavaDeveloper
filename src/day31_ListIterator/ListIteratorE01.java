package day31_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorE01 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Apple");
        list.add("Samsung");
        list.add("Huavei");
        list.add("Blue");

        ListIterator<String>litr=list.listIterator();
        while(litr.hasNext()){
            String str=litr.next()+" !";
            System.out.println(str);
        }


        while(litr.hasPrevious()){
            String el=litr.previous();
            litr.set(el+"?");
            System.out.println();
        }

    }
}
