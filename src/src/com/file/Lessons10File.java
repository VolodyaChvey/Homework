package src.com.file;

import java.io.*;


public class Lessons10File {
    public static void main(String[] args) {
        byte[]buffer=new byte[8*1024];
        try (InputStream in =new FileInputStream(new File("test.txt"));
        OutputStream out=new FileOutputStream(new File("outputFile.tmp"))){
            int b=0;
            while ((b=in.read())!=-1){
                if (b>65)out.write(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {

        }
    }
}
