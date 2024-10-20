package paymentAdapter;

public class Main {
	
    public static void main(String[] args) {
    	
        double amount = 100.0; 
        PayPal paypal = new PayPal();
        IPaymentProcessor paypalAdapter = new PayPalAdapter(paypal);  
        paypalAdapter.pay(amount);
    }
}
