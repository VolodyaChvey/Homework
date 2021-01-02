package homework_Fone;

import java.util.EnumMap;
import java.util.Map;

public class WorkMan {
    private Map<ProfesSkill, Integer> wmMap;

    public WorkMan(Map<ProfesSkill, Integer> wmMap) {
        this.wmMap = wmMap;
    }

    public Map<ProfesSkill, Integer> getWmMap() {
        return wmMap;
    }

    public void setWmMap(Map<ProfesSkill, Integer> wmMap) {
        this.wmMap = wmMap;
    }

    @Override
    public String toString() {
        return "WorkMan" + wmMap;
    }


}
