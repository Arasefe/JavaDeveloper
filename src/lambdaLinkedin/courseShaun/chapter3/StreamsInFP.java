package lambdaLinkedin.courseShaun.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsInFP {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Function<Integer,Integer>timesTwo=(x)->x*2;

        List<Integer>doubled=list.stream().map(timesTwo).collect(Collectors.toList());
        System.out.println(doubled);


        List<Integer>tt=list.stream().map(Utils::timesTwo).collect(Collectors.toList());
        System.out.println(tt);
    }
}
