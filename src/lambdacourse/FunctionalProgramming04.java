package lambdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {
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

        getSumOfAllElements(list);
        getSumOfIntFrom7To100A();
        getSumOfIntFrom7To100B();
        getMultiplicationOfIntA();
        calculateFactorial(6);
        sumOfEvens(3, 9);
        sumOfDigitsOfInteger(12,25);

    }

    // 1-Create a method to find the sum of all elements in the list
    private static void getSumOfAllElements(List<Integer> list) {
        Integer sum = list.stream().reduce(0, Math::addExact);
        System.out.println(sum);
    }

    // 2-Create a method to find the sum of integers from 7 to 100
    // reduce is final/terminal method and it comes as the last method. After them no method can be used
    // 1.Way
    private static void getSumOfIntFrom7To100A() {
        int sum = IntStream.range(7, 101).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    // 2.Way
    private static void getSumOfIntFrom7To100B() {
        int sum = IntStream.rangeClosed(7, 100).sum();
        System.out.println(sum);
    }

    // 3-Create a method to find the multiplication of integers from 2 to 11
    private static void getMultiplicationOfIntA() {
        int sum = IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
        System.out.println(sum);
    }

    // 4-Create a method to find the factorial of a given number (5!)
    private static void calculateFactorial(int x) {

        if (x < 0) {
            System.out.println("Do not use negative numbers...");
        } else {
            Integer result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
            System.out.println(result);
        }
    }

    // 5-Create a method to calculate the sum of even integers between given two integers
    private static void sumOfEvens(int x, int y) {
        Integer result = IntStream.rangeClosed(x, y).filter(p -> p % 2 == 0).reduce(0, Math::addExact);
        System.out.println(result);
    }

    //6-Create a method to calculate the sum of digits of every integers between given two integers
    private static void sumOfDigitsOfInteger(int x, int y) {
        Integer result = IntStream.rangeClosed(x, y).map(Utils::getSumOfDigitsA).sum();
        System.out.println(result);
    }
}
