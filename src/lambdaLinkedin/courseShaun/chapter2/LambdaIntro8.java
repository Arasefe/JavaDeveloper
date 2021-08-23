package lambdaLinkedin.courseShaun.chapter2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaIntro8 {
    public static void main(String[] args) {

        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;


        // Single Responsibility
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgZeroCheck =
                (funct) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Second argument in division op is zero!");
                        return 0f;
                    }
                    return funct.apply(x, y);
                };

        // Divide safe
        BiFunction<Float, Float, Float> divideSafe = secondArgZeroCheck.apply(divide);
        System.out.println(divideSafe.apply(10f,2f));

    }
}
