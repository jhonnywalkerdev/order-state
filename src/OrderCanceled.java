public class OrderCanceled extends OrderState {
    @Override
    public void check() {
        System.out.println("Status do pedido: cancelado.");
    }

    @Override
    public void sendProduct() {
        System.out.println("O produto não será enviado, pois o pagamento foi cancelado.");
    }

    @Override
    public boolean pay() {
        System.out.println("Este pedido já foi cancelado e portanto não será possível realizar o pagamento.");
        return false;
    }

    @Override
    public boolean cancel() {
        System.out.println("Este pagamento já foi cancelado.");
        return false;
    }
}
