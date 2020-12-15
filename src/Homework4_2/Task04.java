package Homework4_2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите высоту фигуры");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        height = height % 2 == 0 ? height + 1 : height;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i < height / 2) {
                    if (j > height / 2 - 1 - i && j < height / 2 + 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j > i - height / 2 - 1 && j < 3 * height / 2 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i < height / 2) {
                    if (j == height / 2 - i || j == height / 2 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == i - height / 2 || j == 3 * height / 2 - 1 - i) {
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
