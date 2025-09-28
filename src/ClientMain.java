public class ClientMain {
    public static void main(String[] args) {
      OldPaymentSystem oldSystem = new OldPaymentSystem();
      PaymentGateway gateway = new PaymentAdapter(oldSystem);

  oldSystem.makePayment("dвsвad");
        gateway.pay(100);
    }
}
