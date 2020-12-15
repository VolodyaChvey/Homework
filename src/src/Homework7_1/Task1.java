package src.Homework7_1;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        System.out.print("Входные данные: ");
        Scanner scanner = new Scanner(System.in);
        String InputData = scanner.nextLine();
        System.out.print("Выходные: ");
        conclusion(InputData);
    }

    private static String arrLength(String string) {
        String[] rang = string.split(" ");
        int min = Integer.parseInt(rang[0]);
        int max = Integer.parseInt(rang[1]);
        if (min > max) {
            return "Введен неверный диапазон";
        } else {
            return String.valueOf(max - min + 1);
        }
    }

    static void conclusion(String string) {
        String[] inputArrays = string.split(",");
        for (int i = 0; i < inputArrays.length; i++) {
            System.out.print(arrLength(inputArrays[i]));
            if (i != inputArrays.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
