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



}
