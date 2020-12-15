package Homework5_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n= scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i< array.length;i++){
            array[i]= random.nextInt(n+2)-2;
        }
        System.out.println(Arrays.toString(array));
        for(int i=0;i< array.length;i++){
            if(array[i]<-1){
                for(int j=0;j< array.length;j++){
                    if(array[i]<0){
                        array[i]*=array[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
