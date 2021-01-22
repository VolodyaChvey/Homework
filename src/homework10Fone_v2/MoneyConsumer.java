package homework10Fone_v2;

public class MoneyConsumer extends ATM {
    public MoneyConsumer(Card card) {
        super(card);
    }

    @Override
    protected int workATM() {
        return random.nextInt(6) - 10;
    }
}
