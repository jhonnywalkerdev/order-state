

public class OrderPending extends OrderState {
    @Override
    public void check() {
        System.out.println("Status do pedido: pendente.");
    }

    @Override
    public void sendProduct() {
        System.out.println("O produto ainda não pode ser enviado, pois o pagamento consta como pendente.");
    }

    @Override
    public boolean pay() {
        System.out.println("Pagamento realizado com sucesso.");
        return true;
    }

    @Override
    public boolean cancel() {
        System.out.println("Pagamento cancelado.");
        return true;
    }
}
