package homework10Fone_v2;

public class Card {
    private int account;
    private volatile boolean solvency;

    public Card(int account) {
        this.account = account;
        if (account > 0) {
            solvency = true;
        }
    }

    public boolean getSolvensy() {
        return solvency;
    }

    public void setSolvency(boolean b) {
        this.solvency = b;
    }

    public synchronized boolean workCard(int money) {
        if (solvency) {
            if (account + money < 0) {
                System.out.println("Insufficient funds in the account");
                return false;
            } else if (account > 1000) {
                System.out.println("On account more than 1000$");
                return false;
            } else {
                account += money;
                System.out.printf("Money %+3d$  account = %d$%n", money, account);
                return true;
            }
        }
        return false;
    }
}
