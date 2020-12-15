package src.Homework7_1;

import java.util.Scanner;

public class Task2 {
    private static int[][] arrays;

    public static void main(String[] args) {
        System.out.print("Входные данные: ");
        Scanner scanner = new Scanner(System.in);
        String InputData = scanner.nextLine();
        System.out.print("Выходные: ");
        conclusion(InputData);
    }

    static void cratureArrays(String string) {
        String[] inputArrays = string.split(",");
        arrays = new int[inputArrays.length][];
        for (int i = 0; i < inputArrays.length; i++) {
            String[] rang = inputArrays[i].split(" ");
            int min = Integer.valueOf(rang[0]);
            int max = Integer.valueOf(rang[1]);
            if (min < max) {
                arrays[i] = new int[max - min + 1];
                for (int j = 0; j < max - min + 1; j++) {
                    arrays[i][j] = min + j;
                }
            }
        }
    }

    static void conclusion(String string) {
        cratureArrays(string);
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null) {
                System.out.print(String.valueOf(arrays[i].length));
            } else {
                System.out.print("Введен неверный диапазон");
            }
            if (arrays[i] != arrays[arrays.length - 1]) {
                System.out.print(", ");
            }
        }
        System.out.println("\n" + intersectionArrays(arrays));
    }

    static String intersectionArrays(int[][] arr) {
        boolean contains = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != null && arr[i + 1] != null) {
                if (arr[i][0] < arr[i + 1][0] && arr[i][arr[i].length - 1] > arr[i + 1][0]) {
                    contains = true;
                    break;
                }
            }
        }
        if (contains) {
            return "Диапазоны значений пересекаются";
        } else {
            return "Диапазоны значений не пересекаются";
        }
    }
}
