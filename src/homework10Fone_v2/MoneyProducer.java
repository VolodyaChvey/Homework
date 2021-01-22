package homework10Fone_v2;

public class MoneyProducer extends ATM {
    public MoneyProducer(Card card) {
        super(card);
    }

    @Override
    protected int workATM() {
        return random.nextInt(6) + 5;
    }
}
