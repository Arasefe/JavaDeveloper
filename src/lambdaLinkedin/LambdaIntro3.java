package lambdaLinkedin;

import java.util.function.BiFunction;

public class LambdaIntro3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>add=(x,y)->x+y;
        System.out.println(add.apply(3,5));

        TriFunction<Integer, Integer, Integer, Integer>addThree=(x,y,z)->x+y+z;
        System.out.println(addThree.apply(3,5,8));

        NoArgFunction<String>sayHello=() -> "Hello Functional Programming";

        System.out.println(sayHello.apply());

    }

}
