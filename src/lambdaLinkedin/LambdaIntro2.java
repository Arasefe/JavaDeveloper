package lambdaLinkedin;

import java.util.function.Function;

public class LambdaIntro2 {
    public static void main(String[] args) {
        Function<Integer, Integer>absoluteValue=(x)->{
            if(x<0){
                return -x;
            }else{
                return x;
            }
        };
        System.out.println(absoluteValue.apply(-100));
    }
}
