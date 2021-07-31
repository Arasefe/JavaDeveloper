package day27_Exceptions.checkedExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _1ReaderFirst {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/day27_Exceptions/textfile");
        BufferedReader bf = new BufferedReader(fileReader);
        int i = 3;
        while (i > 0) {
            System.out.println(bf.readLine());
            i--;
        }
    }
}
