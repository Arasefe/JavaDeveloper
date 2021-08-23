package lambdaLinkedin.courseShaun.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceInFP {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        BinaryOperator<Integer>getSum=(acc,x)->{
            Integer result=acc+x;
            System.out.println("Accumulator "+acc+", x: "+x+", result: "+result);
            return result;
        };

        Integer sum=list.stream().reduce(0,getSum);
        System.out.println(sum);

    }
}
