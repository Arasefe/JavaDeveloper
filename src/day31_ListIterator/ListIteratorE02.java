package day31_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorE02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        ListIterator<String> itr=list.listIterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.println(str);
            itr.remove();
        }
        System.out.println(list);



    }
}
