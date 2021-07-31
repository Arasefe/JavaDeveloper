package day28_Exceptions;

public class E04 {
    public static void main(String[] args) {
        // ClassCastException
        // Object obj=6;
        // String num=(String)obj;

        // NumberFormatException
        String s="123";
        int num1=Integer.parseInt(s);
        System.out.println(num1+2);

        int num2=Integer.valueOf(s);
        System.out.println(num1==num2);

        String s1=String.valueOf(123);
        System.out.println(s.equals(s1));

    }
}
