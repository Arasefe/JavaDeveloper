package day29.Exceptions;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age please: ");
        int age= scan.nextInt();
        try{
            setAge(age);
        }catch(IllegalArgumentException e){
            System.out.println("Do not use negative values..."+e.getMessage());
        }
    }

    public static void setAge(int age) throws IllegalArgumentException{
        if(age<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println("Your age is "+age);
        }
    }

    public static void setAge(String name, int age) throws IllegalArgumentException{
        if(age<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println("Your age is "+age);
        }
    }

}
