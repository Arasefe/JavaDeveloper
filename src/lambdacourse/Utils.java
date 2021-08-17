package lambdacourse;

import java.util.List;

public class Utils {

    public static void printInTheSameLineWithASpace(Object list){
        System.out.print(list+" ");
    }

    public static boolean checkIfEven(int x){
        return x%2==0;
    }

    public static boolean checkIfOdd(int x){
        return x%2!=0;
    }


    public static Integer getSquare(int x){
        return x*x;
    }

    public static Integer getCube(int x){
        return x*x*x;
    }

    public static Double getHalf(int x){
        return x/2.0;
    }

    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }

    public static char getFirstChar(String str){
        return str.charAt(0);
    }

    public static Integer getSumOfDigitsA(int x){
        int sum=0;
        if(x!=0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }

    public static Integer getSumOfDigitsB(int x){
        int sum=0;
        String str=String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            sum+=Integer.parseInt(""+str.charAt(i));
        }
        return sum;
    }
}
