package src.com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text");
        PrintWriter pw=new PrintWriter(file);
        pw.println("Test row 1");
        pw.println("Test row 2");
        pw.close();
    }
}
