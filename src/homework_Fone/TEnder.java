package homework_Fone;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class TEnder {
    Queue<Brig> listBrigada = new PriorityQueue<>();

    public static void main(String[] args) {
        TEnder t = new TEnder();
        t.nTender(2, 1, 2);
    }

    private void nTender(int oneSkill, int towSkill, int threeSkill) {
        Random random = new Random();
        RandomFilling rf=new RandomFilling();
        for (int i = 0; i < random.nextInt(5) + 5; i++) {
            Brig b = rf.novBrigada();
            if (b.tender(b, oneSkill, towSkill, threeSkill)) {
                listBrigada.add(b);
            }
        }
        if (listBrigada.isEmpty()){
            System.out.println("Бригады не найдено");
        }else {
            System.out.println(listBrigada.poll());
        }
    }
}
