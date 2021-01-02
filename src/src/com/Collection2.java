package src.com;

import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Argentina", 1);
        hm.put("Norway ", 12);
        hm.put("Canada ", 10);
        hm.put("USA ", 5);
        System.out.println(hm.get("Argentina"));
        int value =(int) hm.get("Argentina");

        hm.put("Argentina", value + 5);
        System.out.println("New value of Argentina: " + hm.get("Argentina"));

    }
}
