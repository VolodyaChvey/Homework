package src.Homework7_1;

import java.util.Scanner;

public class Money {
    private long grivna;
    private byte kopeyka;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Money money = new Money();
        Money money1 = new Money();
        money.grivna = 25;
        money.kopeyka = 45;
        money1.grivna = 10;
        money1.kopeyka = 65;
        System.out.println(money.addition(money1));
        System.out.println(money.subtraction(money1));
        System.out.println(money.division(2));
        System.out.println(money.fractionalDivision(1.5));
        System.out.println(money.fractionalMultiplication(1.1));
        System.out.println(money.more(money1));
        System.out.println(money.less(money1));
        System.out.println(money.equally(money1));
    }

    public Money addition(Money money) {
        Money result = new Money();
        int i = (kopeyka + money.getKopeyka()) / 100;
        result.setGrivna(grivna + money.getGrivna() + i);
        result.setKopeyka((byte) ((kopeyka + money.getKopeyka()) % 100));
        return result;
    }

    public Money subtraction(Money money) {
        Money result = new Money();
        if (kopeyka < money.getKopeyka()) {
            result.setGrivna(grivna - money.getGrivna() - 1);
            result.setKopeyka((byte) (100 + kopeyka - money.getKopeyka()));
        } else {
            result.setGrivna(grivna - money.getGrivna());
            result.setKopeyka((byte) (kopeyka - money.getKopeyka()));
        }
        return result;
    }

    public Money division(int i) {
        Money result = new Money();
        long summ = (grivna * 100 + kopeyka) / i;
        result.setGrivna(summ / 100);
        result.setKopeyka((byte) (summ % 100));
        return result;
    }

    public Money fractionalDivision(double d) {
        Money result = new Money();
        double summ = (grivna * 100 + kopeyka) / d;
        result.setGrivna((long) summ / 100);
        result.setKopeyka((byte) (summ % 100));
        return result;
    }

    public Money fractionalMultiplication(double d) {
        Money result = new Money();
        double summ = (grivna * 100 + kopeyka) * d;
        result.setGrivna((long) summ / 100);
        result.setKopeyka((byte) (summ % 100));
        return result;
    }

    public boolean more(Money money) {
        boolean result = false;
        if (grivna > money.getGrivna()) {
            result = true;
        } else if (grivna == money.getGrivna()) {
            if (kopeyka > money.getKopeyka()) {
                result = true;
            }
        }
        return result;
    }

    public boolean less(Money money) {
        boolean result = false;
        if (grivna < money.getGrivna()) {
            result = true;
        } else if (grivna == money.getGrivna()) {
            if (kopeyka < money.getKopeyka()) {
                result = true;
            }
        }
        return result;
    }

    public boolean equally(Money money) {
        boolean result = false;
        if (grivna == money.getGrivna() && kopeyka == money.getKopeyka()) {
            result = true;
        }
        return result;
    }


    public long getGrivna() {
        return grivna;
    }

    public void setGrivna(long grivna) {
        this.grivna = grivna;
    }

    public byte getKopeyka() {
        return kopeyka;
    }

    public void setKopeyka(byte kopeyka) {
        this.kopeyka = kopeyka;
    }

    @Override
    public String toString() {
        return grivna + "," + kopeyka;
    }
}
