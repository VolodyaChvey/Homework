package Homework5_1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        int a = str.length();
        str.ensureCapacity(3 * a - 1);
        str.setLength(2 * str.length() - 1);
        str.reverse();
        str.setLength(3 * str.length() / 2);
        str.reverse();
        for (int i = 0; i < a - 1; ++i) {
            str.setCharAt(i, ' ');
        }
        for (int i = 0; i < 2 * a - 1; ++i) {
            for (int j = 0; j < a; ++j) {
                System.out.print(str.charAt(j + i));
            }
            System.out.println();
        }
    }
}
