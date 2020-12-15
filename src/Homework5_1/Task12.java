package Homework5_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern p = Pattern.compile("[;:]-*[\\(\\)\\[\\]]+");
        Matcher m = p.matcher(str);
        int count;
        for (count = 0; m.find(); ++count) {
        }
        System.out.println("Количество смайликов равно " + count);
    }
}
