package homework10Fone_v2;

import java.util.Random;

abstract public class ATM implements Runnable {
    Random random = new Random();
    private Card card;

    public ATM(Card card) {
        this.card = card;
    }

    protected void changeAccount() {
        card.setSolvency(card.workCard(workATM()));
    }

    protected abstract int workATM();

    @Override
    public void run() {
        while (card.getSolvensy()) {
            changeAccount();
            try {
                Thread.sleep((random.nextInt(4) + 2) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
