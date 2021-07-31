package day30.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorI01 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Aras");
        list.add("Efe");
        list.add("Tulpar");
        list.add("Ege");
        list.add("Banu");
        // Loops can not update Collections only Iterators
        System.out.println(list);
        for (String each : list) {
            each=each+"!";
        }

        System.out.println(list);

    }


    private static void methodIterator(List<String>list){
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            itr.remove();
            itr.next();         // Moves the pointer and returns the Object
        }

    }

    private static void methodListIterator(List<String>list){
        ListIterator<String> lItr=list.listIterator();
        while(lItr.hasNext()){
            String element=lItr.next();

            System.out.println(element);
            lItr.add("!");
        }

    }

}
