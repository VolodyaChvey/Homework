package Homework5_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Pattern p = Pattern.compile(".*b{2,}|(a|c|ab|ac|bc|ba|ca|cb|aab|aac|abc|aba|aca|acb|cab|cac|cbc|cba|cca|ccb|bac|bca){3,}.*");
        Matcher m = p.matcher(str);
        if(!m.matches()){
            System.out.println("Принадлежит языку Мумба-Юмба");
        }else {
            System.out.println("Не принадлежит языку Мумба-Юмба");
        }
    }
}
