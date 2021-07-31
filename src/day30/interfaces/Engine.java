package day30.interfaces;

public interface Engine {
    int price = 8000;
    String name = "Eco";

    void gasUsage();

    void speedLimit();

    default void accelerate() {
        System.out.println("Accelerate quickly...");
    }
}
