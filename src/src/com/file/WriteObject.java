package src.com.file;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};
        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("text"))){
            oos.writeObject(people[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
