package lambdaLinkedin.courseShaun;

import java.util.function.Function;

public class LambdaIntro2 {
    public static void main(String[] args) {
        Function<Integer, Integer>absoluteValue=(x)->(x<0)?-x:x;
        System.out.println(absoluteValue.apply(-100));
    }
}
