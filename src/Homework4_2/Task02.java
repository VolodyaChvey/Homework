package Homework4_2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Введите высоту фигуры");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                int a = height - 1 - i;
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                int a = height - 1 - i;
                if (j < i) {
                    System.out.print(" ");
                } else if (i != 0) {
                    if (j == i || j == height - 1) {
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
