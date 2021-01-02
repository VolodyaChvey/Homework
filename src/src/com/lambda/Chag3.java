package src.com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chag3 {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(11);
        items.add(5);
        items.add(120);
        items.add(85);
        items.add(251);
        items.add(199);
        items.forEach(item -> {
            if (item > 100) {
                int index = items.indexOf(item);
                items.set(index, item / 10);
            }
        });
        System.out.println("After:");
        items.forEach(item -> System.out.println(item));
        List<Integer> squares = items.stream()
                .map((i) -> i * i)
                .collect(Collectors.toList());
        System.out.println("Squares:");
        squares.forEach(System.out::println);
    }
}
