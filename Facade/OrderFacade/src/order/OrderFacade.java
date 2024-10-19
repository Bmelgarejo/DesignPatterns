package order;

import java.util.HashMap;
import java.util.Map;

public class OrderFacade {

    private BillingManager billingManager;
    private KitchenManager kitchenManager;
    private MenuManager menuManager;

    public OrderFacade() {
        billingManager = new BillingManager();
        kitchenManager = new KitchenManager();
        menuManager = new MenuManager();
    }

    public void makeOrder(String[] items) {
        Map<String, Integer> menu = menuManager.getMenu();
        Map<String, Integer> order = new HashMap<>();
        
        for (String item : items) {
            if (menu.containsKey(item)) {
                int price = menu.get(item);
                order.put(item, price);
            } else {
                System.out.println("No tenemos " + item + " en el menú.");
            }
        }

        if (order.isEmpty()) {
            System.out.println("No se puede procesar el pedido");
            return;
        }

        kitchenManager.sendToKitchen(order);
        kitchenManager.updateStatus(order, "En preparación");

        billingManager.generateBill(order);
    }
}
