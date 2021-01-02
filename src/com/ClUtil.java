package com;

import java.util.Arrays;

public class ClUtil {
    private ClUtil() {
    }

    public static int max(int one, int two, int three, int four) {
        int[] arr = {one, two, three, four};
        Arrays.sort(arr);
        return arr[3];
    }

    public static int min(int one, int two, int three, int four) {
        int[] arr = {one, two, three, four};
        Arrays.sort(arr);
        return arr[0];
    }

    public static double middle(int one, int two, int three, int four) {
        return (one + two + three + four) / 4;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

}
