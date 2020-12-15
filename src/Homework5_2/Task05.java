package Homework5_2;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
        }
        Arrays.sort(array);
       // System.out.println(Arrays.toString(array));
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
            if (count != 0) {
                System.out.println(array[i] + " - " + count + " раз");
                count = 0;
            }
        }
    }
}
