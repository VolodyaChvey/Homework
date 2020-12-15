package Homework5_1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите предложение");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String sent = sentence.replace(" ", "");
        System.out.println("Средняя сдлина слова равна " + (double)sent.length() / (double)words.length);
    }
}
