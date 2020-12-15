package Homework5_2;

import java.util.Arrays;
import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            if (count == 0) {
                System.out.println(array[i] + " - " + " индекс " + i);
            }else {
                count=0;
            }

        }
    }
}
