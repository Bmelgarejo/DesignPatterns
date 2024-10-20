package Abstract;

public class AdminEmailNotification implements IEmailNotification {

	@Override
	public void sendEmail() {
		System.out.println("Envio email admin");		
	}

}
