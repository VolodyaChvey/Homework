package homework26_12;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Brigada implements Comparable<Brigada> {
    private Queue<Workman> workmanQueue = new PriorityQueue<>();
    private List<Workman> oneWork = new ArrayList<>();
    private List<Workman> towWork = new ArrayList<>();
    private List<Workman> threeWork = new ArrayList<>();
    private int cost;

    void addWorkman(Workman man) {
        workmanQueue.add(man);
    }

    public Queue<Workman> getWorkmanQueue() {
        return workmanQueue;
    }

    boolean tender(Brigada brigada,int oneSkill, int towSkill, int threeSkill) {
        boolean bool = false;
        if (oneSkill + towSkill + threeSkill > brigada.getWorkmanQueue().size()) {
            return bool;
        }
        Workman workman;
        while ((workman = brigada.getWorkmanQueue().poll()) != null) {
            if (oneSkill + towSkill + threeSkill > oneWork.size() + towWork.size() + threeWork.size()) {
                if (workman.getSkillList().contains(ProfSkill.ONESKILL)) {
                    if (oneSkill > oneWork.size()) {
                        oneWork.add(workman);
                        continue;
                    } else if (towSkill > towWork.size()) {
                        for (int i = 0; i < oneWork.size(); i++) {
                            if (oneWork.get(i).getSkillList().contains(ProfSkill.TWOSKILL)) {
                                towWork.add(oneWork.remove(i));
                                oneWork.add(workman);
                                break;
                            }
                        }
                    } else if (threeSkill > threeWork.size()) {
                        for (int i = 0; i < oneWork.size(); i++) {
                            if (oneWork.get(i).getSkillList().contains(ProfSkill.TWOSKILL)) {
                                for (int j = 0; j < towWork.size(); j++) {
                                    if (towWork.get(j).getSkillList().contains(ProfSkill.THREESKILL)) {
                                        threeWork.add(towWork.remove(j));
                                        towWork.add(oneWork.remove(i));
                                        oneWork.add(workman);
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    if (threeSkill > threeWork.size()) {
                        for (int i = 0; i < oneWork.size(); i++) {
                            if (oneWork.get(i).getSkillList().contains(ProfSkill.THREESKILL)) {
                                threeWork.add(oneWork.remove(i));
                                oneWork.add(workman);
                                break;
                            }
                        }
                    }
                }
                if (workman.getSkillList().contains(ProfSkill.TWOSKILL)) {
                    if (towSkill > towWork.size()) {
                        towWork.add(workman);
                        continue;

                    } else if (threeSkill > threeWork.size()) {
                        for (int i = 0; i < towWork.size(); i++) {
                            if (towWork.get(i).getSkillList().contains(ProfSkill.THREESKILL)) {
                                threeWork.add(towWork.remove(i));
                                towWork.add(workman);
                                break;
                            }
                        }
                    }
                }
                if (threeSkill > threeWork.size() && workman.getSkillList().contains(ProfSkill.THREESKILL)) {
                    threeWork.add(workman);
                }
            }
        }
        if (oneSkill + towSkill + threeSkill == oneWork.size() + towWork.size() + threeWork.size()) {
            bool = true;
            List<Workman> list = new ArrayList<>();
            list.addAll(oneWork);
            list.addAll(towWork);
            list.addAll(threeWork);
            for (Workman w : list) {
                cost += w.getCostMan();
            }

        }
        return bool;
    }

    @Override
    public int compareTo(Brigada o) {
        return this.cost - o.cost;
    }

    @Override
    public String toString() {
        return "Brigada{" + "Стоимость: " + cost +
                "\n oneWork=" + oneWork +
                ",\n towWork=" + towWork +
                ",\n threeWork=" + threeWork +
                '}';
    }
}
