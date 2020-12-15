package src.Homework7_3;

import java.util.Scanner;

public class Task2 extends Coffemachine implements Coffee1, Coffee2 {
    protected int milk;
    protected int milkMax;

    public Task2(int water, int groundCoffe, int wastCoffeTank, int milkMax) {
        super(water, groundCoffe, wastCoffeTank);
        this.milkMax = milkMax;
        this.milk = milkMax;
    }

    public static void main(String[] args) {
        Task2 a = new Task2(500, 500, 500, 500);
        a.start();
    }

    void noMilk(int m) {
        if (m <= 0) {
            System.out.println("Отсутствует молоко");
            System.out.println("Выключить кофемашину и долить молока (+/-)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if (s.equals("+")) {
                offOn = off();
                milk = milkMax;
                System.out.println("Молоко долито");
            }
            start();
        }
    }

    @Override
    public void makeLatte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавить молока больше или меньше (+/-)");
        int m;
        if (scanner.next().equals("+")) {
            m = 60;
        } else {
            m = 30;
        }
        noMilk(milk - m);
        makeEspresso();
        milk -= m;
    }

    @Override
    public void makeCappuccino() {
        noMilk(milk - 150);
        makeEspresso();
        milk -= 150;
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

    @Override
    public void makeCoffee() {
        while (offOn) {
            Scanner scanner = new Scanner(System.in);
            noGroundCoffe(groundCoffee - COFE);
            fullTank(wasteCoffe + COFE);
            System.out.println("Приготовить эспрессо, американо, лате или капучино? (1, 2,3 или 4)(default - выключение)");
            int cofe = scanner.nextInt();
            switch (cofe) {
                case 1:
                    makeEspresso();
                    break;
                case 2:
                    makeAmericano();
                    break;
                case 3:
                    makeLatte();
                    break;
                case 4:
                    makeCappuccino();
                    break;
                default:
                    offOn = off();
            }
            givCoffee(cofe);
        }
    }
}
