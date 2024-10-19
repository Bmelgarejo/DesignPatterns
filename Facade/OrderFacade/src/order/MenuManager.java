package order;
import java.util.HashMap;
import java.util.Map;

public class MenuManager {
	
	
	public Map<String, Integer> getMenu() {
		
		Map<String, Integer> menu = new HashMap<>();
		menu.put("Asado", 1500);
		menu.put("Choripán", 800);
		menu.put("Ensalada", 600);
		menu.put("Vino", 700);
		return menu;
	}
}

