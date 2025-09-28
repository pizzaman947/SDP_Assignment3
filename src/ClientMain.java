public class ClientMain {
    public static void main(String[] args) {
      OldPaymentSystem oldSystem = new OldPaymentSystem();
      PaymentGateway gateway = new PaymentAdapter(oldSystem);

        gateway.pay(100);
    }
}
