package SistemaDeNotificacion;

public class Main {

	public static void main(String[] args) {
	
		String tipoDeAplicacion = "Instagram";
		Factory notificacionFactory = new Factory();
		Notificacion notificacion = notificacionFactory.devolverMensaje(tipoDeAplicacion);
		System.out.print(notificacion.toString());
	}

}
