package order;

import java.util.Map;

public class KitchenManager {

	public void sendToKitchen(Map<String, Integer> order) {
		System.out.println("Enviando a la cocina: " + order.keySet());
	}

	public void updateStatus(Map<String, Integer> order, String status) {
		System.out.println("Estado del pedido: " + status);
	}
}
