package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgramming03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aidan");
        list.add("Daniel");
        list.add("Travis");
        list.add("Amanda");
        list.add("Christopher");
        list.add("Jackson");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Benjamin");

        printUpperCase1(list);
        System.out.println();
        printUpperCase2(list);
        System.out.println();
        printSortedByLength(list);
        System.out.println();
        printDistinctSortedByLastCharacter(list);
        System.out.println();
        printSortedByLengthThenFirstChar(list);
        //System.out.println();
        //removeIfLengthGreaterThanFive(list);
        System.out.println();
        removeIfStartsWith(list);
        System.out.println();
        printSquareOfDistinct(list);
        System.out.println();
        checkLengthToBeLessThanTwelve(list);
        System.out.println();
        checkInitials(list);
        System.out.println();
        checkAnyInitials(list);



    }
    // 1) Create a method to print all list elements in Uppercase
    private static void printUpperCase1(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithASpace);

    }

    private static void printUpperCase2(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.print(list);

    }

    //2) Create a method to print the elements after ordering according to their lengths
    private static void printSortedByLength(List<String>list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }


    //3) Create a method to print the distinct sorted elements according to last character
    private static void printDistinctSortedByLastCharacter(List<String>list){

        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(System.out::println);
    }

    //4) Create a method to print the sorted elements according to their length and then their first character
    private static void printSortedByLengthThenFirstChar(List<String>list){

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::getFirstChar)).forEach(System.out::println);
    }

    //5) Create a method to remove the elements length greater than 5
    private static void removeIfLengthGreaterThanFive(List<String>list){

        list.removeIf(p->p.length()>5);
        System.out.println(list);
    }

    //6) Create a method to remove the elements if starts with A, a or ending N, n
    private static void removeIfStartsWith(List<String>list){
        Predicate<String>pr=p->p.startsWith("A")||p.startsWith("a")||p.endsWith("N")||p.endsWith("n");
        list.removeIf(pr);
        System.out.println(list);
    }

    //7) Create a method which takes the square of the length of every element, prints them distinctly in reverse order

    private static void printSquareOfDistinct(List<String>list){
        list.stream().map(String::length).map(Utils::getSquare).distinct().sorted(Comparator.reverseOrder()).forEach(Utils::printInTheSameLineWithASpace);
        System.out.println(list);
    }

    // 8) Create a method to check if the length of all elements are less than 12

    private static void checkLengthToBeLessThanTwelve(List<String>list){
        boolean result=list.stream().allMatch(p->p.length()<12);
        System.out.println(result);

        System.out.println(list.stream().allMatch(p -> p.length() < 12));
    }


    // 9) Create a method to check if the initial of any element is not 'X'

    private static void checkInitials(List<String>list){
        boolean result=list.stream().noneMatch(p->p.startsWith("X"));
        System.out.println(result);

        System.out.println(list.stream().noneMatch(p->p.startsWith("X")));
    }

    // 10) Create a method to check if at least one of the elements ending with “R”
    private static void checkAnyInitials(List<String>list){
        boolean result=list.stream().anyMatch(p->p.endsWith("R"));
        System.out.println(result);

        System.out.println(list.stream().anyMatch(p->p.endsWith("R")));
    }

}
