package homework10Fone;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Homework10 {
    private static volatile boolean b = true;

    public static boolean isB() {
        return b;
    }

     static Random random = new Random();
     static int moneyProducer = random.nextInt(3) + 3;
     static int moneyConsumer = random.nextInt(3) + 3;
    public static void main(String[] args) {
        Card card = new Card(500);

        ExecutorService executorService = Executors.newFixedThreadPool(moneyProducer + moneyProducer);
        for (int i = 0; i < moneyConsumer + moneyProducer; i++) {
            int money = method(i);
            executorService.submit(new ATM() {
                @Override
                public void run() {
                    while (b) {
                        b = card.workCard(money);
                       // System.out.println(Thread.currentThread().getName());
                        try {
                            Thread.sleep((random.nextInt(4) + 2) * 1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    executorService.shutdown();
                }
            });
        }
    }

    private static int method(int i) {
        if (i < moneyProducer) {
            return random.nextInt(6) + 5;
        }
        return random.nextInt(6) - 10;
    }
}
