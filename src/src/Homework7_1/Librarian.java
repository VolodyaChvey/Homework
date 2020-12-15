package src.Homework7_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Librarian {
    public Journal[] journal = new Journal[100];
    public Student[] student = new Student[100];
    private int numberTicket = 0;
    private int numberJournal = 0;

    public LocalDate dateNow() {
        LocalDate date;
        System.out.println("Введите дату (год-месяц-день 2020-10-14)");
        Scanner scanner = new Scanner(System.in);
        String[] strings;
        strings = scanner.nextLine().split("-");
        date = LocalDate.of(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
        return date;
    }

    public void issueOfBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название и автора книги");
        journal[numberJournal].setTitleAuthorOfBook(scanner.nextLine());
        System.out.println("Введите номер билета");
        journal[numberJournal].setNumberTicket(scanner.nextInt());
        System.out.println("На какое время выдана книга (в сутках)");
        journal[numberJournal].setPeriodOfIssue(scanner.nextInt());
        journal[numberJournal].setDateOfIssue(dateNow());
        numberJournal++;
    }

    public void bookReception() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название и автора книги");
        String titleAOfBook = scanner.nextLine();
        for (int i = 0; i < journal.length; i++) {
            if (!(journal[i].getTitleAuthorOfBook() == null)) {
                if (journal[i].getTitleAuthorOfBook().equals(titleAOfBook)) {
                    System.out.println("Введите номер билета");
                    if (journal[i].getNumberTicket() == scanner.nextInt()) {
                        journal[i].setDateReturn(dateNow());
                        journal[i].debtor();
                    }
                }
            }
        }
    }

    public void Ticket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Читательский билет есть? (+ or -) ");
        String s = scanner.next();
        if (s.equals("-")) {
            issueTicket();
        } else if (s.equals("+")) {
            Library.book();
        }
    }

    public void issueTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию и имя студента");
        student[numberTicket].setSurnameAndName(scanner.nextLine());
        System.out.println("Введите номер читательского билета");
        student[numberTicket].setNumberTicket(scanner.nextInt());
        System.out.println("Введите номер группы");
        student[numberTicket].setNumberGroup(scanner.nextInt());
        numberTicket++;
        Library.book();
    }

    public void findDebtors() {
        boolean nonDebtors = true;
        LocalDate date = dateNow();
        for (int i = 0; i < journal.length; i++) {
            if (!(journal[i].getTitleAuthorOfBook() == null))
                if (journal[i].getDateReturn() == null) {
                    journal[i].setIndebtedness(journal[i].getDateOfIssue().plusDays(journal[i].getPeriodOfIssue()).isBefore(date));
                }
        }
        for (int i = 0; i < journal.length; i++) {
            if (journal[i].getIndebtedness()) {
                for (int j = 0; j < student.length; j++) {
                    if (journal[i].getNumberTicket() == student[j].getNumberTicket()) {
                        nonDebtors = false;
                        System.out.println("Студент " + student[j].getSurnameAndName());
                        System.out.println("Группа " + student[j].getNumberGroup());
                        System.out.println("Книга " + journal[i].getTitleAuthorOfBook());
                        if (journal[i].getDateReturn() == null) {
                            System.out.println("КНИГА НЕ ВОЗВРАЩЕНА");
                        } else {
                            System.out.println("Книга возвращена");
                        }
                        System.out.println();
                    }
                }
            }
        }
        if (nonDebtors) {
            System.out.println("Должников нет");
        }
    }

    public void inizial(Journal[] journal, Student[] student) {
        for (int i = 0; i < journal.length; i++) {
            journal[i] = new Journal();
        }
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
        }
    }
}
