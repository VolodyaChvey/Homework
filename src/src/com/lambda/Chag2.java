package src.com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chag2 {
    public static void main(String[] args) {
        List<Fish> fishes = new ArrayList<>();
        fishes.add(new Fish("eel", 1.5, 120));
        fishes.add(new Fish("salmon", 2.5, 180));
        fishes.add(new Fish("carp", 3.5, 80));
        fishes.add(new Fish("tuna", 4.2, 320));
        fishes.add(new Fish("trout", 2.8, 150));
        System.out.println("Before Sorting: ");
        for (Fish f : fishes) {
            System.out.println(f);
        }

       /* fishes.stream()
                .filter(f -> f.getPrice() > 100)
                .forEach(f -> f.setPrice((int) (f.getPrice() * 0.9)));
        System.out.println("After:");
        fishes.forEach(System.out::println);
        List<Fish>selected=fishes.stream()
                .filter(fish -> fish.getPrice()>100)
                .collect(Collectors.toList());
        System.out.println("After2:");
        selected.forEach(System.out::println);

        */

       /* fishes.sort(Comparator.comparing(Fish::getPrice));
        System.out.println("After Sorting");
        for (Fish f : fishes) {
            System.out.println(f);
        }
        System.out.println("Fishes more expensive than 200");
        getByPredicate(fishes, (f) -> f.getPrice() > 200);
        System.out.println("Fishes more expensive than 100 and heavier than 2: ");
        getByPredicate(fishes, (f) -> f.getWeight() > 2 && f.getPrice() > 100);
        System.out.println("Fishes with names longer than 5 charasters: ");
        getByPredicate(fishes,(f)->f.getName().length()>5);

        */
    }

    public static void getByPredicate(List<Fish> fishes, Predicate<Fish> p) {
        for (Fish f : fishes) {
            if (p.test(f)) {
                System.out.println(f);
            }
        }
    }
}

class Fish {
    String name;
    double weight;
    int price;

    public Fish(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}