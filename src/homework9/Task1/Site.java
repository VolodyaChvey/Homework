package homework9.Task1;

import java.util.*;

public class Site {
    Scanner scanner = new Scanner(System.in);
    private List<Game> gameList = new ArrayList<>();
    private static Map<String, Double> userList = new TreeMap<>();

    public static void main(String[] args) {
        RandomFill rf = new RandomFill();
        Site s = new Site();
        s.gameList.addAll(rf.nGameList());
        s.menu();
    }

    public void menu() {
        System.out.println("\nРегистрация: введите 1");
        System.out.println("Играть: введите 2");
        System.out.println("Список игр, в которые играют все игроки: введите 3");
        System.out.println("Рейтинг по имени игрока: введите 4");
        System.out.println("Топ-10 игроков в определённой игре: введите 5");
        System.out.println("Топ-10 игроков с учётом всех игр: введите 6");
        System.out.println("Ввыход: введите иное");
        switch (scanner.next()) {
            case "1":
                registration();
                break;
            case "2":
                totalIsGame();
                break;
            case "3":
                totalGames();
                break;
            case "4":
                ratingByName();
                break;
            case "5":
                topIsGame(10);
                break;
            case "6":
                topIsSite(10);
                break;
            default:
                return;
        }
        menu();
    }

    private void topIsSite(int maxSize) {
        System.out.printf("Top-%d игроков на сайте%n", maxSize);
        userList.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(maxSize)
                .forEach(k -> {
                    System.out.printf("  Gamer: %-12s rating - %.2f%n", k.getKey(), k.getValue());
                });
    }

    private void topIsGame(int maxSize) {
        System.out.printf("Введите № игры (1-%d)%n", gameList.size());
        try {
            int number = scanner.nextInt();
            System.out.printf("Top-%d игроков в игре №%d%n", maxSize, number);
            Game g = gameList.get(number - 1);
            g.getMapUser().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(maxSize)
                    .forEach((k) -> {
                        System.out.printf("  Gamer: %-12s rating - %d%n", k.getKey(), k.getValue());
                    });
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такой игры на сайте нет");
        }
    }

    private void totalIsGame() {
        for (Game g : gameList) {
            g.isGame();
        }
        for (Map.Entry<String, Double> m : userList.entrySet()) {
            int count = 0;
            double summ = 0;
            for (Game g : gameList) {
                if (g.getMapUser().containsKey(m.getKey())) {
                    summ += g.getMapUser().get(m.getKey());
                    count++;
                }
            }
            m.setValue(summ / count);
        }
        System.out.println("Игры проведены\n");
    }

    private void ratingByName() {
        System.out.println("Введите ник игрока");
        String gamer = scanner.next();
        if (userList.containsKey(gamer)) {
            System.out.println("Gamer: " + gamer);
            for (Game g : gameList) {
                if (g.getMapUser().containsKey(gamer)) {
                    System.out.printf("  Game №%d rating: %d", g.getNumberGame(), g.getMapUser().get(gamer));
                    System.out.println();
                }
            }
            System.out.printf("  Рейтинг с учётом всех игр: %.2f", userList.get(gamer));
            System.out.println();
        } else {
            System.out.println("Игрок с ником " + gamer + " на сайте не зарегистрирован");
        }
    }

    private void totalGames() {
        boolean b = false;
        for (Game g : gameList) {
            if (userList.keySet().equals(g.getMapUser().keySet())) {
                System.out.printf("\nВ игру №%d играют все игроки!", g.getNumberGame());
                b = true;
            }
        }
        if (!b) {
            System.out.println("\nИгры в которую играют все игроки нет");
        }
        System.out.println();
    }

    private void registration() {
        System.out.println("Введите свой ник");
        String nik = scanner.next();
        if (userList.containsKey(nik)) {
            System.out.println("Такой игрок уже существует, выберите другой ник");
        } else {
            userList.put(nik, 0.0);
            for (int i = 0; i < gameList.size(); i++) {
                System.out.println("Вы будете играть в игру №" + (i + 1) + "(+/-)");
                if (scanner.next().equals("+")) {
                    gameList.get(i).getMapUser().put(nik, 0);
                }
            }
            System.out.println("Вы зарегистрированы");
        }
    }

    public static Map<String, Double> getUserList() {
        return userList;
    }
}
