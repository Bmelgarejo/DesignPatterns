package decorator;

public class Leche extends BebidaDecorator{

	public Leche(IBebida bebida) {
		super(bebida);
		
	}
	
	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + " Leches";
	}
	
	@Override
	public double getCosto() {
		return bebida.getCosto() + 400;
	}
	
}
