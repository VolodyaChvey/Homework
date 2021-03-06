package homework26_12;

import java.util.ArrayList;
import java.util.List;

public class Brigada implements Comparable<Brigada> {
    private List<Workman> workmanList = new ArrayList<>();
    private List<Workman> oneWork = new ArrayList<>();
    private List<Workman> towWork = new ArrayList<>();
    private List<Workman> threeWork = new ArrayList<>();
    private int cost;

    public void addWorkman(Workman workMan) {
        workmanList.add(workMan);
    }

    public List<Workman> getWorkmanList() {
        return workmanList;
    }

    public void setWorkmanList(List<Workman> workmanList) {
        this.workmanList = workmanList;
    }

    boolean tender(Brigada b, int oneSkill, int towSkill, int threeSkill) {
        boolean bool = false;
        int countMan = oneSkill + towSkill + threeSkill;
        if (countMan > b.getWorkmanList().size()) {
            return false;
        }
        for (int i = 0; i < b.getWorkmanList().size(); i++) {
            Workman workman = b.workmanList.get(i);
            if (countMan > oneWork.size() + towWork.size() + threeWork.size()) {
                if (workman.getWmMap().containsKey(ProfSkill.ONESKILL)) {
                    if (oneSkill > oneWork.size()) {
                        oneWork.add(workman);
                        continue;
                    }
                    if (towSkill > towWork.size()) {
                        for (int j = 0; j < oneWork.size(); j++) {
                            if (oneWork.get(j).getWmMap().containsKey(ProfSkill.TWOSKILL)) {
                                towWork.add(oneWork.remove(j));
                                oneWork.add(workman);
                                break;
                            }
                        }
                    } else if (threeSkill > threeWork.size()) {
                        for (int j = 0; j < oneWork.size(); j++) {
                            if (oneWork.get(j).getWmMap().containsKey(ProfSkill.THREESKILL)) {
                                threeWork.add(oneWork.remove(j));
                                oneWork.add(workman);
                                break;
                            } else if (oneWork.get(j).getWmMap().containsKey(ProfSkill.TWOSKILL)) {
                                for (int k = 0; k < towWork.size(); k++) {
                                    if (towWork.get(k).getWmMap().containsKey(ProfSkill.THREESKILL)) {
                                        threeWork.add(towWork.remove(k));
                                        towWork.add(oneWork.remove(j));
                                        oneWork.add(workman);
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    if (threeSkill > threeWork.size()) {
                        for (int j = 0; j < oneWork.size(); j++) {
                            if (oneWork.get(j).getWmMap().containsKey(ProfSkill.THREESKILL)) {
                                threeWork.add(oneWork.remove(j));
                                oneWork.add(workman);
                                break;
                            }
                        }
                    }
                }
                if (workman.getWmMap().containsKey(ProfSkill.TWOSKILL)) {
                    if (towSkill > towWork.size()) {
                        towWork.add(workman);
                        continue;
                    } else if (threeSkill > threeWork.size()) {
                        for (int j = 0; j < towWork.size(); j++) {
                            if (towWork.get(j).getWmMap().containsKey(ProfSkill.THREESKILL)) {
                                threeWork.add(towWork.remove(j));
                                towWork.add(workman);
                                break;
                            }
                        }
                    }
                }
                if (workman.getWmMap().containsKey(ProfSkill.THREESKILL) && threeSkill > threeWork.size()) {
                    threeWork.add(workman);
                }
            } else {
                bool = true;
                costSkill(workman);
            }
        }
        if (bool) {
            costBrig();
        }
        return bool;
    }

    private void costBrig() {
        for (Workman w : oneWork) {
            cost += w.getWmMap().get(ProfSkill.ONESKILL);
        }
        for (Workman w : towWork) {
            cost += w.getWmMap().get(ProfSkill.TWOSKILL);
        }
        for (Workman w : threeWork) {
            cost += w.getWmMap().get(ProfSkill.THREESKILL);
        }
    }

    private void costSkill(Workman workman) {
        if (workman.getWmMap().containsKey(ProfSkill.ONESKILL)) {
            oneWork.sort((o1, o2) -> o2.getWmMap().get(ProfSkill.ONESKILL) - o1.getWmMap().get(ProfSkill.ONESKILL));
            if (workman.getWmMap().get(ProfSkill.ONESKILL)
                    < oneWork.get(0).getWmMap().get(ProfSkill.ONESKILL)) {
                Workman nWork = oneWork.remove(0);
                oneWork.add(workman);
                costSkill(nWork);
            }
        }
        if (workman.getWmMap().containsKey(ProfSkill.TWOSKILL)) {
            towWork.sort((o1, o2) -> o2.getWmMap().get(ProfSkill.TWOSKILL) - o1.getWmMap().get(ProfSkill.TWOSKILL));
            if (workman.getWmMap().get(ProfSkill.TWOSKILL)
                    < towWork.get(0).getWmMap().get(ProfSkill.TWOSKILL)) {
                Workman nWork = towWork.remove(0);
                towWork.add(workman);
                costSkill(nWork);
            }
        }
        if (workman.getWmMap().containsKey(ProfSkill.THREESKILL)) {
            threeWork.sort((o1, o2) -> o2.getWmMap().get(ProfSkill.THREESKILL) - o1.getWmMap().get(ProfSkill.THREESKILL));
            if (workman.getWmMap().get(ProfSkill.THREESKILL)
                    < threeWork.get(0).getWmMap().get(ProfSkill.THREESKILL)) {
                Workman nWork = threeWork.remove(0);
                threeWork.add(workman);
                costSkill(nWork);
            }
        }
    }

    @Override
    public String toString() {
        return "Brigada{" + "Стоимость: " + cost +
                "\n oneWork=" + oneWork +
                ",\n towWork=" + towWork +
                ",\n threeWork=" + threeWork +
                '}';
    }

    @Override
    public int compareTo(Brigada o) {
        return this.cost - o.cost;
    }
}
