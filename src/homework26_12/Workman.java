package homework26_12;


import java.util.HashSet;

import java.util.Set;

public class Workman implements Comparable<Workman> {
    private int costMan;
    private Set<ProfSkill> skillList = new HashSet<>();

    public Workman(int costMan, Set<ProfSkill> skillList) {
        this.costMan = costMan;
        this.skillList = skillList;
    }

    public int getCostMan() {
        return costMan;
    }

    public Set<ProfSkill> getSkillList() {
        return skillList;
    }

    @Override
    public String toString() {
        return "Workman{" +
                "costMan=" + costMan +
                ", skillList=" + skillList +
                '}';
    }

    @Override
    public int compareTo(Workman o) {
        return this.costMan - o.costMan;
    }
}
