package src.Homework7_1;

import java.util.Arrays;
import java.util.Scanner;

public class MainString {
    private char[] chars;
    private int length;

    public MainString() {
    }

    public MainString(String string) {
        this.chars = string.toCharArray();
    }

    public MainString(char ch) {
        this.chars = String.valueOf(ch).toCharArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        MainString m = new MainString(scanner.next());
        System.out.println(m.lenght(m));
        System.out.println(m.empty(m));
        System.out.println("Введите символ для поиска в строке ");
        String str = scanner.next();
        System.out.println(m.indexOf(str.charAt(0)));
    }

    public int lenght(MainString mainString) {
        return chars.length;
    }

    public MainString empty(MainString mainString) {
        return new MainString("");
    }

    public int indexOf(char symbol) {
        return String.valueOf(chars).indexOf(symbol);
    }

    @Override
    public String toString() {
        return "MainString{" +
                "chars=" + Arrays.toString(chars) +
                ", length=" + chars.length +
                '}';
    }
}
