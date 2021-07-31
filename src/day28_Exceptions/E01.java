package day28_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("src/day27_Exceptions/textfile")) {
            BufferedReader br = new BufferedReader(fileReader);
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
