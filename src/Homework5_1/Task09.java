package Homework5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Введите первую строку");
        Scanner scanner = new Scanner(System.in);
        StringBuilder strOne = new StringBuilder(scanner.nextLine());
        System.out.println("Введите вторую строку");
        StringBuilder strTwo = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < strOne.length(); ++i) {
            if (!Character.isAlphabetic(strOne.charAt(i))) {
                strOne.delete(i, i + 1);
                --i;
            }
        }
        for (int i = 0; i < strTwo.length(); ++i) {
            if (!Character.isAlphabetic(strTwo.charAt(i))) {
                strTwo.delete(i, i + 1);
                --i;
            }
        }
        String str1 = strOne.toString();
        String str2 = strTwo.toString();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] chOne = str1.toCharArray();
        char[] chTwo = str2.toCharArray();
        Arrays.sort(chOne);
        Arrays.sort(chTwo);
        if (Arrays.equals(chOne, chTwo)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
