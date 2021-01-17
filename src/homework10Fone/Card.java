package homework10Fone;

public class Card {
    private int account;

    public Card(int account) {
        this.account = account;
    }

    public synchronized boolean workCard(int money) {
        if (Homework10.isB()) {
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
