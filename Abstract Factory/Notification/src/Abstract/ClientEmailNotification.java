package Abstract;

public class ClientEmailNotification implements IEmailNotification {

	@Override
	public void sendEmail() {
		System.out.println("Envio email cliente");		
	}

}
