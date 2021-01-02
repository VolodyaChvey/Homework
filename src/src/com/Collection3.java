package src.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection3 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }
        Collections.shuffle(integerList);
        for (int i = 0;i<5;i++){
            System.out.println(integerList.get(i));
        }
    }
}
