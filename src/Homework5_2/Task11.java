package Homework5_2;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        StringBuilder[] str = new StringBuilder[scanner.nextInt()];
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder();
            for (int j = 0; j < 16; j++) {
                str[i].append((char) (random.nextInt(26) + 97));
            }
            for (int j = 0; j < random.nextInt(5) + 1; j++) {
                int a = random.nextInt(14) + 1;
                str[i].setCharAt(a, ' ');
            }
            String[] s = str[i].toString().split("\\s+");
            count += s.length;
        }
        System.out.println("Общее количество слов в массиве равно " + count);
    }
}
