package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBebida miCafe = new Cafe();
		System.out.println(miCafe.getDescripcion()+ " Cuesta $" + miCafe.getCosto());
		
		miCafe = new Leche(miCafe);
		System.out.println(miCafe.getDescripcion()+ " Cuesta $" + miCafe.getCosto());
		
		miCafe = new Azucar(miCafe);
		System.out.println(miCafe.getDescripcion()+ " Cuesta $" + miCafe.getCosto());
	}

}
