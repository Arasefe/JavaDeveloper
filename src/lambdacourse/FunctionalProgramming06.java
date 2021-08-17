package lambdacourse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FunctionalProgramming06 {
    public static void main(String[] args) {
        readFromFile();
        convertAllUpperCase();
        System.out.println(checkIfExists());
        printDistinctWords();
        getWordsEndingWithe();
    }

    private static void readFromFile(){
        // How to read text from the file
        try {
            Files.lines(Paths.get("src/lambdacourse/LambdaText.txt")).forEach(System.out::println);
        }catch (Exception e){
            e.getStackTrace();
        }
    }


    private static void convertAllUpperCase(){
        // How to convert all the characters in file to uppercase
        try{
            Files.lines(Paths.get("src/lambdacourse/LambdaText.txt")).map(String::toUpperCase).forEach(System.out::println);

        }catch (IOException e){
            e.getStackTrace();
        }

    }

    private static boolean checkIfExists(){
        // How to check if a specific word (Lambda) exists in the text
        boolean result=false;
        try{
           result =Files.lines(Paths.get("src/lambdacourse/LambdaText.txt")).anyMatch(p->p.contains("Lambda"));

        }catch (IOException e){
            e.getStackTrace();
        }
        return result;
    }

    private static void printDistinctWords(){
        // How to print distinct words from the text

        try{
            Files.lines(Paths.get("src/lambdacourse/LambdaText.txt")).map(p->p.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::print);

        }catch (IOException e){
            e.getStackTrace();
        }
    }

    private static void getWordsEndingWithe(){
        // Get the words which ends with "e" and print them on the console

        try{
            Files.lines(Paths.get("src/lambdacourse/LambdaText.txt")).map(p->p.split(" ")).flatMap(Arrays::stream).filter(p->p.endsWith("e")).forEach(System.out::print);

        }catch (IOException e){
            e.getStackTrace();
        }
    }
}
