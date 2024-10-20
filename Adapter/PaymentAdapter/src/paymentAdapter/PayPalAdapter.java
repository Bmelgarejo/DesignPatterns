package paymentAdapter;

public class PayPalAdapter implements IPaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.sendPayment(amount);
    }
}
