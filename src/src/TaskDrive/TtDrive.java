package TaskDrive;
//ДЗ 5.1 Задание 2
import java.util.Scanner;

public class TtDrive {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; str.length() < 1000; i++) {
            str = str.concat("" + i);
        }
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(str.charAt(n - 1));
    }
}

