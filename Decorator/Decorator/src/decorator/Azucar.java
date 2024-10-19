package decorator;

public class Azucar extends BebidaDecorator{

	public Azucar(IBebida bebida) {
		super(bebida);
		
	}
	
	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + " Azucar";
	}
	
	@Override
	public double getCosto() {
		return bebida.getCosto() + 100;
	}
	
}
