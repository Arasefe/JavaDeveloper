package day29.Abstraction;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating cat mama");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping 12 hours in a day");

    }

    @Override
    public void drink() {
        System.out.println("Cat is drinking milk");

    }
}
