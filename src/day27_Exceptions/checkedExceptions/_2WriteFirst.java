package day27_Exceptions.checkedExceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _2WriteFirst {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("day27_Exceptions/textfile");
        BufferedWriter bw=new BufferedWriter(fileWriter);
        String myContent="This is written using BufferedWriter";
        bw.newLine();
        bw.write(myContent);
        bw.close();
        System.out.println("Success");
    }
}
