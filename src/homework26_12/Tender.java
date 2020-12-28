package homework26_12;

import java.util.*;

public class Tender {
    Random random = new Random();
    Queue<Brigada> brigadaQueue = new PriorityQueue<>();

    public static void main(String[] args) {
        Tender t = new Tender();
        t.newTender(2, 1,2);
    }

    private void newTender(int oneSkill,int towSkill, int threeSkill) {
        for (int i = 0; i < random.nextInt(5) + 5; i++) {
            Brigada b = novBrigada();
            if (b.tender(b,oneSkill, towSkill, threeSkill)) {
                brigadaQueue.add(b);
            }
        }
        if (brigadaQueue.isEmpty()) {
            System.out.println("Бригады не найдено");
        } else {
            System.out.println(brigadaQueue.poll());
        }
    }

    private Workman nWorkman() {
        int cost = random.nextInt(10) * 10 + 10;
        Set<ProfSkill> list = new HashSet<>();
        for (int i = 0; i < random.nextInt(3) + 1; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    list.add(ProfSkill.ONESKILL);
                    break;
                case 1:
                    list.add(ProfSkill.TWOSKILL);
                    break;
                case 2:
                    list.add(ProfSkill.THREESKILL);
                    break;
            }
        }
        return new Workman(cost, list);
    }

    private Brigada novBrigada() {
        Brigada brigada = new Brigada();
        int nWorkInBrig = random.nextInt(5) + 5;
        for (int i = 0; i < nWorkInBrig; i++) {
            brigada.addWorkman(nWorkman());
        }
        return brigada;
    }
}

