package src.Homework7_1;

import java.util.Scanner;

public class Library {
    private static Librarian librarian = new Librarian();

    public static void main(String[] args) {
        librarian.inizial(librarian.journal, librarian.student);
        librarian.Ticket();
    }

    public static void book() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Получить или сдать книгу? (+ or -)");
        String s = scanner.next();
        if (s.equals("+")) {
            librarian.issueOfBook();
        } else if (s.equals("-")) {
            librarian.bookReception();
        }
        debtors();
    }

    public static void debtors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Найти должников? (+ or -)");
        String s = scanner.next();
        if (s.equals("+")) {
            librarian.findDebtors();
        } else if (s.equals("-")) {
            System.out.println("Продолжить? (+ or -)");
            if (scanner.next().equals("+")) {
                librarian.Ticket();
            }
        }
    }
}
