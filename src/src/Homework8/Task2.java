package src.Homework8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            checkMethod();
        } catch (CheckedException e) {
            System.out.println(e.getMessage());;
        } catch (UncheckedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkMethod() throws CheckedException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            throw new CheckedException("Nuber less than zero");
        } else if (number > 100) {
            throw new UncheckedException("Number is more than hundred");
        }
    }
}

class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}

class UncheckedException extends RuntimeException {
    public UncheckedException(String message) {
        super(message);
    }
}
