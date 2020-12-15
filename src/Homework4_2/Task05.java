package Homework4_2;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите высоту фигуры");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 4 * height; j++) {
                if (j > height - 2 - i && j < 4 * height - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 4 * height; j++) {
                if (i != 0 && i != height - 1) {
                    if (j == height - 1 - i || j == 4 * height - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j > height - 2 - i && j < 4 * height - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
