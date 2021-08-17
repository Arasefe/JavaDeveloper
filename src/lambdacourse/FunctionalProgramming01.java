package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
    /*
    1) Lambda is Functional Programming
    2) FP was added to Java in 8, before that we used to use only Structured Programming
    but after Java 8 we can use both Structured and Functional Programming
    3) Structured Programming focuses on how to do. Syntax, rule, semi colons, curly braces etc
    Functional Programming focuses on "What to do"
    4) Functional Programming is used with Collections and Arrays
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(131);
        list.add(14);
        list.add(9);
        list.add(10);
        list.add(18);
        list.add(12);
        list.add(15);

        printListElementsStructured(list);
        System.out.println();
        printListElementsFunctional(list);
        System.out.println();
        printEvenStructured(list);
        System.out.println();
        printEvenFunctional(list);
        System.out.println();
        printSquareOfOdds(list);
        System.out.println();
        printCubeOfDistinctOdds(list);
        System.out.println();
        sumOfSquareDistinctEvens(list);
        System.out.println();
        productOfCubeDistinctEvens(list);
        System.out.println();
        getMaximumElements(list);
        System.out.println();
        getMaximumElements2(list);
        System.out.println();
        getMinimumElements(list);
        System.out.println();
        getMinimumElements2(list);
        System.out.println();
        getSpecificMinimum(list);
        System.out.println();
        getHalfOfDistinctElReversed(list);
        System.out.println();

    }

    /*
     1-Create a method to print the list elements on the console in the same line with a space
     between two consecutive elements
     */
    private static void printListElementsStructured(List<Integer> list) {

        for (Integer each : list) {
            System.out.print(each + " ");
        }
    }

    private static void printListElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    /*
    2-Create a method to print even list elements on the console in the same line with a space
    between two consecutive elements (Structured)
     */

    private static void printEvenStructured(List<Integer> list) {
        for (Integer each : list) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            }
        }
    }

    /*
    Create a method to print even list elements on the console in the same line with a space
    between two consecutive elements (Functional)
     */
    private static void printEvenFunctional(List<Integer> list) {
        list.stream().filter(each -> each % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    /*
    3- Create a method to print the square of odd list elements on the console in the same line with a space
    between two consecutive elements (Functional Programming)
    map is used to change the value of elements
     */

    private static void printSquareOfOdds(List<Integer> list) {
        list.stream().filter(each->each%2!=0).map(p->p*p).forEach(p-> System.out.print(p+" "));

    }

    /*
    4- Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    between two consecutive elements (Functional)
    distinct removes the repeated ones
     */
    private static void printCubeOfDistinctOdds(List<Integer> list) {
        list.stream().filter(each->each%2!=0).distinct().map(p->p*p*p).forEach(p-> System.out.print(p+" "));

    }

    /*
     5- Create a method to print to calculate the sum of the squares of distinct even elements on the console

     */
    private static void sumOfSquareDistinctEvens(List<Integer> list){
        Integer sum=list.stream().distinct().filter(p->p%2==0).map(p->p*p).reduce(0, (s,u)->s+u);
        System.out.println("The sum of the squares of even distinct elements is "+sum);

    }

    /*
     6- Create a method to print the calculation of the product of cubes of distinct even elements

     */
    private static void productOfCubeDistinctEvens(List<Integer> list){
        Integer prod=list.stream().distinct().filter(p->p%2==0).map(p->p*p*p).reduce(1, (s,u)->s*u);
        System.out.println("The multiplication of the cubes of even distinct elements is "+prod);

    }

    /*
     7- Create a method to find the maximum value from the list elements
        1 Way
     */
    private static void getMaximumElements(List<Integer> list){
        Integer max=list.stream().reduce(Integer.MIN_VALUE,(u,t)->u>t?u:t);
        System.out.println("The max element is "+max);

    }
    // 2 Way
    private static void getMaximumElements2(List<Integer> list){
        Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(p,s)->s);
        System.out.println("The max element is "+max);

    }


    /*
     8- Create a method to find the minimum value from the list elements

     */
    private static void getMinimumElements(List<Integer> list){
        Integer min=list.stream().reduce(Integer.MAX_VALUE,(u,t)->u<t?u:t);
        System.out.println("The min element is "+min);

    }

    // 2 Way
    private static void getMinimumElements2(List<Integer> list){
        Integer max=list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(p, s)->s);
        System.out.println("The min element is "+max);

    }

    /*
    9- Create a method to find te minimum value which is greater than 7 and even from the list
     */
    private static void getSpecificMinimum(List<Integer> list){
        // First way
        Integer specMin1=list.stream().distinct().filter(p->p%2==0&& p>7).reduce(Integer.MAX_VALUE,(p, s)->p<s?p:s);
        System.out.println("The min element is "+specMin1);
        // Second way
        // Use findFirst() together with get() method to get Integer return type
        Integer specMin2=list.stream().distinct().filter(p->p%2==0&& p>7).sorted().findFirst().get();
        System.out.println("The min element is "+specMin2);

    }

    /*
    10-Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
     */

    private static void getHalfOfDistinctElReversed(List<Integer>list){
        List<Double>myList=list.stream().distinct().filter(p->p>10).map(p->p/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(myList);
    }

}
