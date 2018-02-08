public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int mult) {
        return new Dollar(amount * mult);
    }
}
