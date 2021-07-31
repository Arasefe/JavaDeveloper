package day30.interfaces;

public class Runner {
    public static void main(String[] args) {

        Honda hc1 = new Honda();

        hc1.accelerate();
        hc1.climate();
        hc1.gasUsage();

        // There is a difference in usage, static methods in a class and static methods in an interface?
        // To call a static method from an interface use "interface name"
        Music.volume();

    }
}
