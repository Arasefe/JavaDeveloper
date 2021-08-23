package lambdaLinkedin.courseShaun.chapter3;

import java.util.function.Function;

public class CompositionInFP {
    public static void main(String[] args) {
        Function<Integer, Integer>timesTwo=x->x*2;
        Function<Integer, Integer>minusOne=x->x-1;

        Function<Integer,Integer>timesTwoMinusOne=timesTwo.andThen(minusOne);
        System.out.println(timesTwoMinusOne.apply(3));


    }
}
