package src.TaskDrive;

public class SimpleDotCom {
    int[] localionCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        localionCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : localionCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == localionCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
