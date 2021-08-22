package lambdaLinkedin.courseShaun;

import lambdaLinkedin.courseShaun.NoArgFunction;

public class LambdaIntro7 {
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter=()->{
            String name="Aras";
            return ()->"Hello, "+name;
        };

        NoArgFunction<String>greeter=createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
