package Homework5_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char[] arrayChar = new char[scanner.nextInt()];
        char[] array = new char[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (97 + i);
        }
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) (random.nextInt(26) + 97);
        }
        Arrays.sort(arrayChar);
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < arrayChar.length; j++) {
                if (array[i] == arrayChar[j]) {
                    count++;
                }
            }
            if (count > 3) {
                System.out.println(array[i] + " - " + count + " раз");
            }
            count = 0;
        }
    }
}
