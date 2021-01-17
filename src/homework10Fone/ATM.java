package homework10Fone;

import java.util.Random;

abstract public class ATM implements Runnable {
    Random random = new Random();

    public int moneyProducer() {
        return random.nextInt(6) + 5;
    }

    public int moneyConsumer() {
        return random.nextInt(6) - 10;
    }

    abstract public void run();
}

