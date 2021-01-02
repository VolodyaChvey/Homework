package src.com;

import java.util.*;

public class Collection5 {
    public static void main(String[] args) {
        Book book = new Book();
        book.autor = "Karnegy";
        book.name ="How to get friends";
        Map<String,Book> library=new HashMap<>();
        library.put(book.name, book);
        Book karnegiBook= library.get(book.name);
        System.out.println(karnegiBook.autor);
    }
}

class Book {
    String autor;
    String name;
}