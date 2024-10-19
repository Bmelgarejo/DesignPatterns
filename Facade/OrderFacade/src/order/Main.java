package order;

public class Main {

	public static void main(String[] args) {
		OrderFacade orderFacade = new OrderFacade();
		String[] items = {"Asado", "Vino", "Helado"}; 
		orderFacade.makeOrder(items);
		}
}
