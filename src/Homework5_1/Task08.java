package Homework5_1;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("Введите имя переменной");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean cpp = false;
        boolean jav = false;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '_') {
                cpp = true;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                jav = true;
            }
        }
        if (cpp && jav) {
            System.out.println("Смешанный синтаксис");
        } else {
            if (cpp) {
                String[] srt = str.split("_");
                for (int i = 1; i < srt.length; ++i) {
                    srt[i] = srt[i].replace(srt[i].charAt(0), Character.toUpperCase(srt[i].charAt(0)));
                }
                String strJav = "";
                for (int i = 0; i < srt.length; ++i) {
                    strJav = strJav.concat(srt[i]);
                }
                System.out.println("Переменная взята из С++");
                System.out.println("В Java: " + strJav);
            } else if (jav) {
                StringBuilder stringBuilder = new StringBuilder(str);
                for (int i = 0; i < stringBuilder.length(); ++i) {
                    if (Character.isUpperCase(stringBuilder.charAt(i))) {
                        stringBuilder.setCharAt(i, Character.toLowerCase(stringBuilder.charAt(i)));
                        stringBuilder.insert(i, '_');
                    }
                }
                System.out.println("Переменная взята из Java");
                System.out.println("В С++: " + stringBuilder.toString());
            } else {
                System.out.println("Идентификатор переменной одинаков для С++ и Java");
            }
        }
    }
}

