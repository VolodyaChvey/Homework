package homework9.Task1;

import java.util.*;

public class RandomFill {
    Random random = new Random();

    private String nUser() {
        char[] chars = new char[random.nextInt(5) + 5];
        for (int i = 0; i < chars.length; i++) {
            char ch = (char) ((char) random.nextInt(58) + 65);
            if (Character.isAlphabetic(ch)) {
                chars[i] = ch;
            }
        }
        return String.valueOf(chars);
    }

    public List<Game> nGameList() {
        List<Game> list = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5) + 3; i++) {
            list.add(new Game(new HashMap<>(), i + 1));
        }
        for (int j = 0; j < random.nextInt(10) + 10; j++) {
            String user = nUser();
            if (!Site.getUserList().containsKey(user)) {
                Site.getUserList().put(user, 0.0);
                for (Game game : list) {
                    game.getMapUser().put(user, 0);
                }
            }
        }
        return list;
    }
}
