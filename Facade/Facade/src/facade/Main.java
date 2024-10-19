package facade;

public class Main {

	public static void main(String[] args) {
		HomeFacade home = new HomeFacade();
		home.activarModoNocturno();
		home.desactivarModoNocturno();

	}

}
