package homework26_12;

import java.util.Map;

public class Workman {
    private Map<ProfSkill, Integer> wmMap;

    public Workman(Map<ProfSkill, Integer> wmMap) {
        this.wmMap = wmMap;
    }

    public Map<ProfSkill, Integer> getWmMap() {
        return wmMap;
    }

    public void setWmMap(Map<ProfSkill, Integer> wmMap) {
        this.wmMap = wmMap;
    }

    @Override
    public String toString() {
        return "Workman" + wmMap;
    }


}
