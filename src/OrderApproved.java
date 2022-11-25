public class OrderApproved extends OrderState {
    @Override
    public void check() {
        System.out.println("Status do pedido: aprovado.");
    }

    @Override
    public void sendProduct() {
        System.out.println("O pagamento já foi aprovado, seu produto está em fase de separação para a realização do envio.");
    }

    @Override
    public boolean pay() {
        System.out.println("Este pedido já foi pago, portanto você não conseguirá pagar novamente.");
        return false;
    }

    @Override
    public boolean cancel() {
        System.out.println("Pedido cancelado. O valor pago será reembolsado em até 2 dias úteis.");
        return true;
    }
}
