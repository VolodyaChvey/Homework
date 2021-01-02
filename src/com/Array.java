package com;

import com.Task4.Math;
import com.Task4.Sort;

import java.util.Arrays;

public class Array implements Showalbel, Math, Sort {

    int[] arr = new int[]{1, 2, 3, 4};

    @Override
    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void print(String info) {
        System.out.println(Arrays.toString(arr) + info);
    }

    @Override
    public int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    @Override
    public int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    @Override
    public float avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    @Override
    public void sortAsc() {
        Arrays.sort(arr);
    }

    @Override
    public void sortDesc() {
        Arrays.parallelSort(arr);
    }

}



