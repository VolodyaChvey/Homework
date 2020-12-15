package Homework5_1;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        String str = "";
        for (int i = 1; str.length() < 999; ++i) {
            str = str.concat("" + i);
        }
        System.out.println("Введите номер позиции");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(str.charAt(n - 1));
    }
}
