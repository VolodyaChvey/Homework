package homework26_12;

import java.util.EnumMap;
import java.util.Map;
import java.util.Random;

public class RandomFilling {
    Random random = new Random();

    public Workman nWorkman() {
        Map<ProfSkill, Integer> workman = new EnumMap<>(ProfSkill.class);
        for (int i = 0; i < random.nextInt(3) + 1; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    workman.put(ProfSkill.ONESKILL, costSkill());
                    break;
                case 1:
                    workman.put(ProfSkill.TWOSKILL, costSkill());
                    break;
                case 2:
                    workman.put(ProfSkill.THREESKILL, costSkill());
                    break;
            }
        }
        return new Workman(workman);
    }

    private Integer costSkill() {
        return random.nextInt(10) * 10 + 10;
    }

    public Brigada novBrigada() {
        Brigada brigada = new Brigada();
        int nWorkInBrig = random.nextInt(5) + 5;
        for (int i = 0; i < nWorkInBrig; i++) {
            brigada.addWorkman(nWorkman());
        }
        return brigada;
    }
}
