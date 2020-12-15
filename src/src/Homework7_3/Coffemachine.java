package src.Homework7_3;

import java.util.Scanner;

abstract class Coffemachine {
    protected boolean offOn;
    protected int waterMax;//Вместимость бака с водой
    protected int water;//Воды осталось
    protected int groundCoffeeMax;//Вместимость бака с молотым кофе
    protected int groundCoffee;//Кофе осталось
    protected int wastCoffeTank;//Вместимость бака с отработанным кофе
    protected int wasteCoffe;//Отработанное кофе


    public Coffemachine(int waterMax, int groundCoffeeMax, int wastCoffeTank) {
        this.waterMax = waterMax;
        this.water = waterMax;
        this.groundCoffeeMax = groundCoffeeMax;
        this.groundCoffee = groundCoffeeMax;
        this.wastCoffeTank = wastCoffeTank;
    }

    void noWater(int water) {
        if (water <= 0) {
            System.out.println("Отсутствует вода");
            System.out.println("Выключить кофемашину и долить воды? (+/-)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if (s.equals("+")) {
                offOn = off();
                this.water = waterMax;
                System.out.println("Вода долита");
            }
            start();
        }
    }

    void noGroundCoffe(int groundCoffe) {
        if (groundCoffe <= 0) {
            System.out.println("Отсутствует молотый кофе");
            System.out.println("Выключить кофемашину и добавить молотый кофе? (+/-)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if (s.equals("+")) {
                offOn = off();
                this.groundCoffee = groundCoffeeMax;
                System.out.println("Молотый кофе добавлен");
            }
            start();
        }
    }

    void fullTank(int wC) {
        if (wastCoffeTank <= wC) {
            System.out.println("Переполнен бак с отработанным кофе");
            System.out.println("Выключить кофемашину и очисть бак с отработанным кофе? (+/-)");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if (s.equals("+")) {
                offOn = off();
                wasteCoffe = 0;
                System.out.println("Бак с отработанным кофе очищен");
            }
            start();
        }
    }

    public boolean off() {
        System.out.println("Кофемашина выключена");
        return false;
    }

    public boolean on() {
        System.out.println("Кофемашина включена");
        return true;
    }

    public void start() {
        System.out.println("Включить кофемашину? (+/-)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.equals("+")) {
            offOn = on();
            makeCoffee();
        }
    }

    public void givCoffee(int coffee) {
        if (offOn) {
            switch (coffee) {
                case 1:
                    System.out.println("Ваш кофе - эспрессо");
                    break;
                case 2:
                    System.out.println("Ваш кофе - американо");
                    break;
                case 3:
                    System.out.println("Ваш кофе - лотте");
                    break;
                case 4:
                    System.out.println("Ваш кофе - капучино");
                    break;
            }
        }
    }

    abstract public void makeCoffee();
}
