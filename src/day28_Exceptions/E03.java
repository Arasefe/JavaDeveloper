package day28_Exceptions;

public class E03 {
    public static void main(String[] args) {
        String[] str = {"A", "D", "C", "B"};

        try {
            System.out.println(str[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not use non-existing index " + e.getMessage());
        } finally {
            System.out.println("This is coming from finally block");
        }
    }
}
