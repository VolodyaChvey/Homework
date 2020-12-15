package src.Homework7_3;

import java.util.Scanner;

public class Task3 extends Task2 {
    private int beansCoffee;
    private int beansCoffeeMax;

    public Task3(int water, int groundCoffe, int wastCoffeTank, int milkMax, int beansCoffeeMax) {
        super(water, groundCoffe, wastCoffeTank, milkMax);
        this.beansCoffeeMax = beansCoffeeMax;
        this.beansCoffee = beansCoffeeMax;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3(500, 500, 500, 500, 500);
        task3.start();
    }

    @Override
    public void makeCoffee() {
        while (offOn) {
            Scanner scanner = new Scanner(System.in);
            noGroundCoffe(groundCoffee - COFE);
            fullTank(wasteCoffe + COFE);
            System.out.println("Приготовить  американо или лате? (1, 2)(default - выключение)");
            int cofe = scanner.nextInt();
            switch (cofe) {
                case 1:
                    makeAmericano();
                    cofe = 2;
                    break;
                case 2:
                    makeLatte();
                    cofe = 3;
                    break;
                default:
                    offOn = off();
            }
            givCoffee(cofe);
        }
    }

    @Override
    void noGroundCoffe(int groundCoffe) {
        if (groundCoffe <= 0) {
            System.out.println("Отсутствует молотый кофе");
            System.out.println("Выключить кофемашину. Добавить молотый кофе или молоть зерновой? (+/-)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            offOn = off();
            if (s.equals("+")) {
                this.groundCoffee = groundCoffeeMax;
                System.out.println("Молотый кофе добавлен");
            } else {
                grindCoffee();
            }
            start();
        }
    }

    private void grindCoffee() {
        noBeansCoffee(beansCoffee);
        groundCoffee = beansCoffee;
        beansCoffee = 0;
        System.out.println("Кофе помолот");
    }

    private void noBeansCoffee(int beans) {
        if (beans <= 0) {
            System.out.println("Отсутствует зерновой кофе");
            System.out.println("Выключить кофемашину и добавить зерновой кофе? (+/-)");
            offOn = off();
            beansCoffee = beansCoffeeMax;
            System.out.println("Зерновой кофе добавлен");
        }
    }
}


