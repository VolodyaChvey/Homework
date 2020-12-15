package Homework5_1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку (латиницей)");
        String sentence = scanner.nextLine();
        String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y", "a", "e", "i", "o", "u", "y"};
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; ++i) {
            boolean a = false;
            boolean b = false;
            for (int j = 0; j < vowels.length; ++j) {
                if (words[i].startsWith(vowels[j])) {
                    a = true;
                }
                if (words[i].endsWith(vowels[j])) {
                    b = true;
                }
            }
            if (a && !b) {
                System.out.println(words[i]);
            }
        }
    }
}
