package Homework4_2;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}
