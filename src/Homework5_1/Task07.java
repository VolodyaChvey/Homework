package Homework5_1;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.next());
        for (int i = 0; i < stringBuilder.length(); ++i) {
            if (Character.isDigit(stringBuilder.charAt(i))) {
                stringBuilder.setCharAt(i, '_');
            }
            if (Character.isUpperCase(stringBuilder.charAt(i))) {
                stringBuilder.setCharAt(i, Character.toLowerCase(stringBuilder.charAt(i)));
            } else if (Character.isLowerCase(stringBuilder.charAt(i))) {
                stringBuilder.setCharAt(i, Character.toUpperCase(stringBuilder.charAt(i)));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
