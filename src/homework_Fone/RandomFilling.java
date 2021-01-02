package homework_Fone;


import java.util.EnumMap;
import java.util.Map;
import java.util.Random;

public class RandomFilling {
    Random random = new Random();

    public WorkMan nWorkman() {
        Map<ProfesSkill, Integer> workman = new EnumMap<>(ProfesSkill.class);
        for (int i = 0; i < random.nextInt(3) + 1; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    workman.put(ProfesSkill.ONESKILL, costSkill());
                    break;
                case 1:
                    workman.put(ProfesSkill.TWOSKILL, costSkill());
                    break;
                case 2:
                    workman.put(ProfesSkill.THREESKILL, costSkill());
                    break;
            }
        }
        return new WorkMan(workman);
    }

    private Integer costSkill() {
        return random.nextInt(10) * 10 + 10;
    }

    public Brig novBrigada() {
        Brig brigada = new Brig();
        int nWorkInBrig = random.nextInt(5) + 5;
        for (int i = 0; i < nWorkInBrig; i++) {
            brigada.addWorkman(nWorkman());
        }
        return brigada;
    }
}
