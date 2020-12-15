package Homework5_1;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split("\\s+|:\\s*");
        int count = 0;
        for (int i = 0; i < words.length; ++i) {
            if (words[i].length() % 2 == 0) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
