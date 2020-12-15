package Homework5_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 3;
        }
        Arrays.sort(array);
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            if (count == 1) {
                System.out.println(array[i] + " встречается 1 раз");
            } else {
                System.out.println(array[i] + " встречается " + count + " раз");
                count = 1;
            }
        }
    }
}
