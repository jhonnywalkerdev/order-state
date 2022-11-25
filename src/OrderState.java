public abstract class OrderState {
    public abstract void check();

    public abstract void sendProduct();

    public abstract boolean pay();

    public abstract boolean cancel();
}
