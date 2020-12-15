package Homework5_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(33);
        }
        int index = -1;
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] != 0 && array[i + 1] != 0 && array[i] != 0) {
                if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                    index = i;
                    System.out.println("Индекс элемента равен " + index);
                }
            }
        }
        if (index == -1) {
            System.out.println(index);
        }
    }
}
