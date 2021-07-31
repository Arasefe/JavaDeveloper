package day28_Exceptions;

public class E02 {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.length());
        String s2=null;


        try {
            //System.out.println(12 / 0);                 // ArithmeticException
            System.out.println("Goof");
            System.out.println(s2.length());            // NullPointerException


        } catch (NullPointerException n) {
            System.out.println("Do not use length() for null" + n.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero" + e.getMessage());
        }finally {
            System.out.println("Finally will be executed under every condition");
        }
        System.out.println("This code executes for sure");
    }
}
