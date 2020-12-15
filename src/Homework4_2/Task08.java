package Homework4_2;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int b = 0, summa = 0;
        while (number > 0) {
            b++;
            summa += number % 10;
            number /= 10;
        }
        System.out.println("Количество цифр равно " + b);
        System.out.println("Сумма цифр равна " + summa);
    }
}
