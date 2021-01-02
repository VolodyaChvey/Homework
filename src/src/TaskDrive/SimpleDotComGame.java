package src.TaskDrive;

import java.util.Random;
import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        Scanner scanner = new Scanner(System.in);
        int numOfGuesses = 0;
        Random random = new Random();
        int i = random.nextInt(5);
        int[] locationCells = {i, i + 1, i + 2};
        dot.setLocationCells(locationCells);
        boolean isAlive = true;
        while (isAlive) {
            System.out.print("Введите число ");
            String result = dot.checkYourself(scanner.next());
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
