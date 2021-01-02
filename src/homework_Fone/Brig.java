package homework_Fone;

import java.util.*;

public class Brig implements Comparable<Brig> {
    private List<WorkMan> workmanList = new ArrayList<>();
    private List<WorkMan> oneWork = new ArrayList<WorkMan>();
    private List<WorkMan> towWork = new ArrayList<WorkMan>();
    private List<WorkMan> threeWork = new ArrayList<WorkMan>();
    private int cost;

    public void addWorkman(WorkMan workMan) {
        workmanList.add(workMan);
    }

    public List<WorkMan> getWorkmanList() {
        return workmanList;
    }

    public void setWorkmanList(List<WorkMan> workmanList) {
        this.workmanList = workmanList;
    }

    boolean tender(Brig b, int oneSkill, int towSkill, int threeSkill) {
        boolean bool = false;
        int countMan = oneSkill + towSkill + threeSkill;
        if (countMan > b.getWorkmanList().size()) {
            return false;
        }
        for (int i = 0; i < b.getWorkmanList().size(); i++) {
            WorkMan workman = b.workmanList.get(i);
            if (countMan > oneWork.size() + towWork.size() + threeWork.size()) {
                if (workman.getWmMap().containsKey(ProfesSkill.ONESKILL)) {
                    if (oneSkill > oneWork.size()) {
                        oneWork.add(workman);
                        continue;
                    }
                    if (towSkill > towWork.size()) {
                        for (int j = 0; j < oneWork.size(); j++) {
                            if (oneWork.get(j).getWmMap().containsKey(ProfesSkill.TWOSKILL)) {
                                towWork.add(oneWork.remove(j));
                                oneWork.add(workman);
                                break;
                            }
                        }
                    } else if (threeSkill > threeWork.size()) {
                        for (int j = 0; j < oneWork.size(); j++) {
                            if (oneWork.get(j).getWmMap().containsKey(ProfesSkill.THREESKILL)) {
                                threeWork.add(oneWork.remove(j));
                                oneWork.add(workman);
                                break;
                            } else if (oneWork.get(j).getWmMap().containsKey(ProfesSkill.TWOSKILL)) {
                                for (int k = 0; k < towWork.size(); k++) {
                                    if (towWork.get(k).getWmMap().containsKey(ProfesSkill.THREESKILL)) {
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
                            if (oneWork.get(j).getWmMap().containsKey(ProfesSkill.THREESKILL)) {
                                threeWork.add(oneWork.remove(j));
                                oneWork.add(workman);
                                break;
                            }
                        }
                    }
                }
                if (workman.getWmMap().containsKey(ProfesSkill.TWOSKILL)) {
                    if (towSkill > towWork.size()) {
                        towWork.add(workman);
                        continue;
                    } else if (threeSkill > threeWork.size()) {
                        for (int j = 0; j < towWork.size(); j++) {
                            if (towWork.get(j).getWmMap().containsKey(ProfesSkill.THREESKILL)) {
                                threeWork.add(towWork.remove(j));
                                towWork.add(workman);
                                break;
                            }
                        }
                    }
                }
                if (workman.getWmMap().containsKey(ProfesSkill.THREESKILL) && threeSkill > threeWork.size()) {
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
        for (WorkMan w : oneWork) {
            cost += w.getWmMap().get(ProfesSkill.ONESKILL);
        }
        for (WorkMan w : towWork) {
            cost += w.getWmMap().get(ProfesSkill.TWOSKILL);
        }
        for (WorkMan w : threeWork) {
            cost += w.getWmMap().get(ProfesSkill.THREESKILL);
        }
    }

    private void costSkill(WorkMan workman) {
        if (workman.getWmMap().containsKey(ProfesSkill.ONESKILL)) {
            oneWork.sort((o1, o2) -> o2.getWmMap().get(ProfesSkill.ONESKILL) - o1.getWmMap().get(ProfesSkill.ONESKILL));
            if (workman.getWmMap().get(ProfesSkill.ONESKILL)
                    < oneWork.get(0).getWmMap().get(ProfesSkill.ONESKILL)) {
                WorkMan nWork = oneWork.remove(0);
                oneWork.add(workman);
                costSkill(nWork);
                // return;
            }
        }
        if (workman.getWmMap().containsKey(ProfesSkill.TWOSKILL)) {
            towWork.sort((o1, o2) -> o2.getWmMap().get(ProfesSkill.TWOSKILL) - o1.getWmMap().get(ProfesSkill.TWOSKILL));
            if (workman.getWmMap().get(ProfesSkill.TWOSKILL)
                    < towWork.get(0).getWmMap().get(ProfesSkill.TWOSKILL)) {
                WorkMan nWork = towWork.remove(0);
                towWork.add(workman);
                costSkill(nWork);
                //return;
            }
        }
        if (workman.getWmMap().containsKey(ProfesSkill.THREESKILL)) {
            threeWork.sort((o1, o2) -> o2.getWmMap().get(ProfesSkill.THREESKILL) - o1.getWmMap().get(ProfesSkill.THREESKILL));
            if (workman.getWmMap().get(ProfesSkill.THREESKILL)
                    < threeWork.get(0).getWmMap().get(ProfesSkill.THREESKILL)) {
                WorkMan nWork = threeWork.remove(0);
                threeWork.add(workman);
                costSkill(nWork);
            }
        }
    }

    @Override
    public int compareTo(Brig o) {
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