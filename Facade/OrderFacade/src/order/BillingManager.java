package order;
import java.util.Map;

public class BillingManager {

	public int calculateTotal(Map<String, Integer> order) {
		return order.values().stream().mapToInt(Integer::intValue).sum();
	}

	public void generateBill(Map<String, Integer> order) {
		System.out.println("Total a pagar: $" + calculateTotal(order));
	}
}
