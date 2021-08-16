package lambdaLinkedin;

import java.util.function.BiFunction;

public class LambdaIntro4 {
    public static void main(String[] args) {
        NoArgFunction<String>sayWord=()->"Too many cooks spoil the broth";
        System.out.println(sayWord.apply());

    }
}
