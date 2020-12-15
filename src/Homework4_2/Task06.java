package Homework4_2;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Введите количество ступенек");
        Scanner scanner = new Scanner(System.in);
        int step = scanner.nextInt();
        for (int i = 1; i < 2 * step; i++) {
            for (int j = 0; j < 2 * (i / 2); j++) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.println("*");
            } else {
                System.out.println("***");
            }
        }
    }
}
