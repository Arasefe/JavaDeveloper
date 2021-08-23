package lambdaLinkedin.courseShaun.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltersInFP {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // Find even numbers
        Predicate<Integer>predicate=p->p%2==0;
        // 1st way
        List<Integer>evens1 =list.stream().filter(predicate).collect(Collectors.toList());
        // 2nd way
        List<Integer>evens2 =list.stream().filter(p->p%2==0).collect(Collectors.toList());
        // 3rd way
        List<Integer>evens3 =list.stream().filter(Utils::checkIfEven).collect(Collectors.toList());
        System.out.println(evens3);

        // String longer than 5 chars
        String[]wordsArr={"Hello","functional","programming","is","cool"};
        List<String>words=new ArrayList<>(Arrays.asList(wordsArr));
        Predicate<String>predicate2=p->p.length()>5;
        // 1st way
        List<String>longs1=words.stream().filter(predicate2).collect(Collectors.toList());
        // 2nd way
        List<String>longs2=words.stream().filter(p->p.length()>5).collect(Collectors.toList());
        // 3rd way
        List<String>longs3=words.stream().filter(Utils::isLongerThan5).collect(Collectors.toList());
        System.out.println(longs2);

        Function<Integer, Predicate<String>>createLengthTest=(minLength)->{
            return (str)->str.length()>minLength;
        };

        Predicate<String>isLongerThan8=createLengthTest.apply(8);
        Predicate<String>isLongerThan3=createLengthTest.apply(3);
    }

}
