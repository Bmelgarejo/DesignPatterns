package decorator;

abstract class BebidaDecorator implements IBebida{

	protected IBebida bebida;
	
	public BebidaDecorator(IBebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescripcion() {
		return bebida.getDescripcion();
	}
	
	@Override
	public double getCosto() {
		return bebida.getCosto();
	}

}
