package Homework4_2;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ярусов и высоту через пробел");
        int number = scanner.nextInt();
        int height = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < height + i; j++) {
                for (int k = 0; k < 2 * (height + i) + number - 2; k++) {
                    if (k > height - j + number - 3 && k < height + j + number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
