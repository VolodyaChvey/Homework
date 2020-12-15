package Homework5_1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Введите строку текста");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Введите символ");
        String c = scanner.next();
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (c.equals(String.valueOf(str.charAt(i)))) {
                System.out.println("Индекс " + i);
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("Совпадений не найдено");
        } else {
            System.out.println("Количество совпадений " + count);
        }
    }
}
