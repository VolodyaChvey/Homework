package src.Homework7_3;

import java.util.Scanner;

public class Task1 extends Coffemachine implements Coffee1 {
    public Task1(int water, int groundCoffe, int wastCoffeTank) {
        super(water, groundCoffe, wastCoffeTank);
    }

    public static void main(String[] args) {
        Task1 b = new Task1(1000, 200, 100);
        b.start();
    }

    public void makeCoffee() {
        while (offOn) {
            Scanner scanner = new Scanner(System.in);
            noGroundCoffe(groundCoffee - COFE);
            fullTank(wasteCoffe + COFE);
            System.out.println("Приготовить эспрессо или американо? (1 или 2)(default - выключение)");
            int cofe=scanner.nextInt();
            switch (cofe) {
                case 1:
                    makeEspresso();
                    break;
                case 2:
                    makeAmericano();
                    break;
                default:
                    offOn = off();
            }
            givCoffee(cofe);
        }
    }

    @Override
    public void makeEspresso() {
        noWater(water - ESPRESSO);
        groundCoffee -= COFE;
        water -= ESPRESSO;
        wasteCoffe += COFE;
    }

    @Override
    public void makeAmericano() {
        noWater(water - AMERICANO);
        groundCoffee -= COFE;
        water -= AMERICANO;
        wasteCoffe += COFE;
    }
}
