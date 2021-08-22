package lambdaLinkedin.coursePeggy;

import java.util.function.BiFunction;

public class LambdaIntro8 {
    public static void main(String[] args) {
        BiFunction<Float,Float,Float>divide=(x,y)->{
            if(y==0){
                System.err.println("Error: Divide by 0");
                return 0f;
            }
            return x/y;
        };
    }


    // Single Responsibility
    private static void single(){
        BiFunction<Float,Float,Float>divide=(x,y)->x/y;
    }
}
