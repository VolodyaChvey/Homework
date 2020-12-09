package src.Homework8;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static int[] array;

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        task1.method(scanner.next());

    }

    public int[] initializationArray() {
        Random random = new Random();
        int lenght = random.nextInt(10) + 1;
        array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        return array;
    }

    public void method(String s) {
        initializationArray();
        double number1 = 0;
        try {
            number1 = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
            return;
        }
        int number = (int) number1;
        try {
            if (!(number1 - number == 0)) {
                throw new NotAnInteger("Введено не целое число");
            }
        } catch (NotAnInteger e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    throw new DivisionByZero("Делить на ноль нельзя");
                } else {
                    System.out.println(number / array[i]);
                }
            }
        } catch (DivisionByZero e) {
            System.out.println(e.getMessage());
        }
    }
}

class DivisionByZero extends Exception {
    public DivisionByZero(String message) {
        super(message);
    }
}

class NotAnInteger extends Exception {
    public NotAnInteger(String message) {
        super(message);
    }
}

