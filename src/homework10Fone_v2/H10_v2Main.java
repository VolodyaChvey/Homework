package homework10Fone_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class H10_v2Main {
    static Random random = new Random();
    private static List<ATM> numberATM = new ArrayList<>();

    public static void main(String[] args) {
        int moneyProducer = random.nextInt(3) + 3;
        int moneyConsumer = random.nextInt(3) + 3;
        if (moneyConsumer == moneyProducer) {
            moneyConsumer++;
        }
        ExecutorService executorService = Executors.newFixedThreadPool(moneyConsumer + moneyProducer);
        Card card = new Card(500);
        for (int i = 0; i < moneyProducer; i++) {
            numberATM.add(new MoneyProducer(card));
        }
        for (int i = 0; i < moneyConsumer; i++) {
            numberATM.add(new MoneyConsumer(card));
        }
        numberATM.forEach(executorService::submit);
        executorService.shutdown();
    }
}
