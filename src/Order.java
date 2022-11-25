import java.util.Scanner;

public class Order {

    private OrderState state = new OrderPending();

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que bom que você concluiu seu carrinho! Agora só falta o pagamento. Escolha oque você vai fazer: ");
        int chose = 0;
        while(chose < 5){
            System.out.println("\n1 - Verificar status do pedido.");
            System.out.println("2 - Solicitar entrega do produto.");
            System.out.println("3 - Pagar com cartão de crédito.");
            System.out.println("4 - Cancelar pedido.");
            System.out.println("5 - Sair.");
            System.out.print("Digite a opcao desejada: ");
            chose = sc.nextInt();
            switch (chose){
                case 1:
                    check();
                    break;
                case 2:
                    sendProduct();
                    break;
                case 3:
                    pay();
                    break;
                case 4:
                    cancel();
                    break;
            }
        }
    }

    public void check() {
        state.check();
    }

    public void sendProduct() {
        state.sendProduct();
    }

    public boolean pay() {
        boolean p = state.pay();
        if (p) {
            setState(new OrderApproved());
            return true;
        }
        return false;
    }

    public boolean cancel() {
        boolean p = state.cancel();
        if (p) {
            setState(new OrderCanceled());
            return true;
        }
        return false;
    }
}
