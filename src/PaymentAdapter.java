public class PaymentAdapter implements PaymentGateway {
    private OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {

        this.oldSystem = oldSystem;
    }

    @Override
    public void pay(int amount) {
        oldSystem.makePayment(String.valueOf(amount));
    }
}
