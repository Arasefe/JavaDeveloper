package day28_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/day27_Exceptions/textfile");
        int i=0;
        while((i=fis.read())!=-1){
            System.out.println((char)i);
        }
        fis.close();
        met();


    }
    public static void met(){
        int x=5;
        int y=0;
        System.out.println(x/y);
        System.out.println("good");

    }
}
