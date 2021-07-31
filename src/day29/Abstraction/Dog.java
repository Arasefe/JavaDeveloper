package day29.Abstraction;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating dog papara");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping 6 hours in a day");

    }

    @Override
    public void drink() {
        System.out.println("Dog is drinking water");

    }

    public static void main(String[] args) {
        Dog karabas=new Dog();
        karabas.drink();
        Animal pisik=new Cat();
        pisik.eat();
    }
}
