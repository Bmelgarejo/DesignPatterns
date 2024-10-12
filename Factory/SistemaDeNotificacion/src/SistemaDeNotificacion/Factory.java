package SistemaDeNotificacion;

public class Factory {

	public Notificacion devolverMensaje(String tipo) {
		switch (tipo.toUpperCase()) {
        case "WHATSAPP":
            return new Whatsapp(); 
        case "FACEBOOK":
            return new Facebook();
        case "INSTAGRAM":
            return new Instagram(); 
        case "EMAIL":
            return new Email(); 
        case "TELEGRAM":
            return new Telegram(); 
        case "X":
            return new X(); 
        case "SMS":
        	return new SMS();
        default:
            throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
    }
	}
}
