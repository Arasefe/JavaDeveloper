package lambdaLinkedin.coursePeggy;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaIntro11 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Aras","Tulpar","Banu","Ismail");

        // way to sort prior to Java 8 lambdas

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // First iteration with Lambda
        Collections.sort(names,(String a, String b)->{
            return b.compareTo(a);
        });

        // Now remove the data types and allow the compile to infer the type
        Collections.sort(names,(a,b)->b.compareTo(a));






    }
}
