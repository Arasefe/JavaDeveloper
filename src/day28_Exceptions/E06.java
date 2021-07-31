package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E06 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("src/day27_Exceptions/textfile");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
