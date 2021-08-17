package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
    /*
    Method References: Class Name :: Method Name without method parenthesis
    String :: length
    ArrayList :: size
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);

        printListElementsStructured(list);
        System.out.println();
        sumOfSquareDistinctEvens(list);
        System.out.println();
        productOfCubeDistinctEvens(list);
        System.out.println();
        getMaximumElements(list);
        System.out.println();
        getMinimumElements(list);
        System.out.println();
        getSpecificMinimum(list);
        System.out.println();
        getHalfOfDistinctElReversed(list);



    }
    /*
     1-Create a method to print the list elements on the console in the same line with a space
     between two consecutive elements
     */
    private static void printListElementsStructured(List<Integer> list) {
        list.stream().forEach(Utils::printInTheSameLineWithASpace);
    }

    /*
    2-Create a method to print even list elements on the console in the same line with a space
    between two consecutive elements (Structured)
     */
    private static void printEventElements(List<Integer>list){
        list.stream().filter(Utils::checkIfEven).forEach(Utils::printInTheSameLineWithASpace);
    }


    /*
    3- Create a method to print the square of odd list elements on the console in the same line with a space
    between two consecutive elements (Functional Programming)
    map is used to change the value of elements
     */
    private static void printSquareOfOdds(List<Integer>list){
        list.stream().filter(Utils::checkIfOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithASpace);
    }

    /*
    4- Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    between two consecutive elements (Method Reference)
    distinct removes the repeated ones
     */
    private static void printCubeOfDistinctOdds(List<Integer> list) {
        list.stream().filter(Utils::checkIfOdd).distinct().map(Utils::getCube).forEach(Utils::printInTheSameLineWithASpace);

    }

    /*
     5- Create a method to print to calculate the sum of the squares of distinct even elements on the console

     */
    private static void sumOfSquareDistinctEvens(List<Integer> list){
        Integer sum=list.stream().distinct().filter(Utils::checkIfEven).map(Utils::getSquare).reduce(0, Math::addExact);
        System.out.println("The sum of the squares of even distinct elements is "+sum);

    }

    /*
     6- Create a method to print the calculation of the product of cubes of distinct even elements

     */
    private static void productOfCubeDistinctEvens(List<Integer> list){
        Integer prod=list.stream().distinct().filter(Utils::checkIfEven).map(Utils::getCube).reduce(1, Math::multiplyExact);
        System.out.println("The multiplication of the cubes of even distinct elements is "+prod);

    }


    /*
     7- Create a method to find the maximum value from the list elements
        1 Way
     */
    private static void getMaximumElements(List<Integer> list){
        Integer max=list.stream().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println("The max element is "+max);

    }

    /*
     8- Create a method to find the minimum value from the list elements

     */
    private static void getMinimumElements(List<Integer> list){
        Integer min=list.stream().reduce(Integer.MAX_VALUE,Math::min);
        System.out.println("The min element is "+min);

    }


    /*
    9- Create a method to find te minimum value which is greater than 7 and even from the list
     */
    private static void getSpecificMinimum(List<Integer> list){
        // First way
        Integer specMin1=list.stream().distinct().filter(p->p>7).filter(Utils::checkIfEven).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println("The min element is "+specMin1);
        // Second way
        // Use findFirst() together with get() method to get Integer return type
        Integer specMin2=list.stream().distinct().filter(p->p>7).filter(Utils::checkIfEven).sorted().findFirst().get();
        System.out.println("The min element is "+specMin2);

    }

    /*
    10-Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
     */

    private static void getHalfOfDistinctElReversed(List<Integer>list){
        List<Double>myList=list.stream().distinct().filter(p->p>10).map(Utils::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(myList);
    }

}
