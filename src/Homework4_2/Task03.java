package Homework4_2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите высоту фигуры");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if (i != height - 1) {
                    if (j > height - 2 - i && j < height + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if (i != height - 1) {
                    if (j == height - 1 - i || j == height - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
