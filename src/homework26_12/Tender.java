package homework26_12;

import java.util.*;

public class Tender {
    Queue<Brigada> listBrigada = new PriorityQueue<>();

    public static void main(String[] args) {
        Tender t = new Tender();
        t.nTender(2, 3, 2);
    }

    private void nTender(int oneSkill, int towSkill, int threeSkill) {
        Random random = new Random();
        RandomFilling rf = new RandomFilling();
        for (int i = 0; i < random.nextInt(5) + 5; i++) {
            Brigada b = rf.novBrigada();
            if (b.tender(b, oneSkill, towSkill, threeSkill)) {
                listBrigada.add(b);
            }
        }
        if (listBrigada.isEmpty()) {
            System.out.println("Бригады не найдено");
        } else {
            System.out.println(listBrigada.poll());
        }
    }
}

