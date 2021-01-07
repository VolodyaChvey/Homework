package homework9.Task1;

import java.util.*;

public class Game {
    private Map<String, Integer> mapUser;
    private int numberGame;

    public Game(Map<String, Integer> mapUser, int numberGame) {
        this.mapUser = mapUser;
        this.numberGame = numberGame;
    }

    public void isGame() {
        Random random = new Random();
        for (Map.Entry<String, Integer> m : mapUser.entrySet()) {
            m.setValue(m.getValue() + random.nextInt(mapUser.size()));
        }
    }

    public Map<String, Integer> getMapUser() {
        return mapUser;
    }

    public int getNumberGame() {
        return numberGame;
    }


    @Override
    public String toString() {
        return "\nGame{" + "numberGame=" + numberGame +
                ", mapUser=" + mapUser +
                '}';
    }
}
