package facade;

public class HomeFacade {

	private Luces luces;
	private Termostato termostato;
	private Alarma alarma;
	
	public HomeFacade() {
		this.luces = new Luces();
		this.termostato = new Termostato();
		this.alarma = new Alarma();
	}

	public void activarModoNocturno() {
		luces.apagar();
		alarma.activar();
		termostato.ajustarTemperatura(20);
		System.out.println("modo nocturno activado.");
		
	}
	
	public void desactivarModoNocturno() {
		luces.encender();
		alarma.desactivar();
		termostato.ajustarTemperatura(17);
		System.out.println("modo nocturno desactivado.");
		
		
	}
}
