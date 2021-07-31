package day30.interfaces;

public interface Music {
    String system = "Surround";
    int price = 2000;

    void sound();
    void tune();

    static void volume() {
        System.out.println("Do not listen to the music with high volume...");
    }
}
