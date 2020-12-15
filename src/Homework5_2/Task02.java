package Homework5_2;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(120) - 70;
        }
        Arrays.sort(array);
        System.out.println("Минимальный элемент " + array[0]);
        System.out.println("Максимальный элемент " + array[array.length-1]);
    }
}

