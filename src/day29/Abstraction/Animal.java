package day29.Abstraction;

public abstract class Animal {
    public void prey(){
        System.out.println("All animals have instinct to prey their foods");
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void drink();
}
