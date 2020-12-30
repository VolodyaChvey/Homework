package homework10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    private List<TaskList> listTask = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task2 t = new Task2();
        t.start();
        t.menu();
    }

    private void menu() {
        System.out.println("Посмотреть список задач (Введите 1); \nДобавить задачу (Введите 2);" +
                "\nУдалить задачу (Введите 3); \nВвыход (Введите иное).");
        try {
            String s = scanner.next();
            switch (s) {
                case "1":
                    printTaskList();
                    break;
                case "2":
                    writeToTask();
                    break;
                case "3":
                    deleteToTask();
                    break;
                default:
                    writeToFile();
            }
        } catch (Exception e) {
            writeToFile();
        }
    }

    private void printTaskList() {
        if (listTask.isEmpty()) {
            System.out.println("Список задач пуст");
            menu();
        } else {
            for (int i = 0; i < listTask.size(); i++) {
                System.out.printf("\nЗадача №%d %s", i + 1, listTask.get(i).getTaskList());
            }
        }
        menu();
    }

    private void deleteToTask() {
        System.out.println("Для удаления введите номер задания");
        try {
            int index = scanner.nextInt();
            if (index < 0 || index > listTask.size()) {
                System.out.println("Задания с таким номером нет в списке");
            } else {
                listTask.remove(index - 1);
                System.out.printf("Задание №%d удалено%s", index, "\n");
            }
        } catch (Exception e) {
            System.out.println("Введено не число");
        }
        menu();
    }

    private void writeToTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заголовок");
        String headline = scanner.nextLine();
        System.out.println("Введите описание");
        String description = scanner.nextLine();
        System.out.println("Введите приоритет");
        String priority = scanner.nextLine();
        System.out.println("Введите дату создания");
        String dateOfCreation = scanner.nextLine();
        System.out.println("Введите дату окончания");
        String expirationDate = scanner.nextLine();
        System.out.println("Кто будет выполнять");
        String whoWillPerform = scanner.nextLine();
        System.out.println("Отметка о выполнении");
        String completionMark = scanner.nextLine();
        TaskList tl = new TaskList(headline, description, priority
                , dateOfCreation, expirationDate, whoWillPerform, completionMark);
        listTask.add(tl);
        menu();
    }

    private void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lesson10Task2.txt"))) {
            oos.writeInt(listTask.size());
            for (int i = 0; i < listTask.size(); i++) {
                oos.writeObject(listTask.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void start() {
        File file = new File("Lesson10Task2.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            readingFromFile();
        }
    }

    private void readingFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lesson10Task2.txt"))) {
            int tlCount = ois.readInt();
            for (int i = 0; i < tlCount; i++) {
                listTask.add((TaskList) ois.readObject());
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class TaskList implements Serializable {
    private static final long serialVersionUID = 1L;
    String headline;
    String description;
    String priority;
    String dateOfCreation;
    String expirationDate;
    String whoWillPerform;
    String completionMark;

    public TaskList(String headline, String description, String priority, String dateOfCreation,
                    String expirationDate, String whoWillPerform, String completionMark) {
        this.headline = headline;
        this.description = description;
        this.priority = priority;
        this.dateOfCreation = dateOfCreation;
        this.expirationDate = expirationDate;
        this.whoWillPerform = whoWillPerform;
        this.completionMark = completionMark;
    }

    public String getTaskList() {
        return "\n {Заголовок: " + headline + ",\n" +
                "  Описание: " + description + ",\n" +
                "  Приоритет: " + priority + ",\n" +
                "  Дата создания: " + dateOfCreation + ",\n" +
                "  Дата окончания: " + expirationDate + ",\n" +
                "  Кто будет выполнять: " + whoWillPerform + ",\n" +
                "  Отметка о выполнении: " + completionMark + '}' + "\n";
    }
}
