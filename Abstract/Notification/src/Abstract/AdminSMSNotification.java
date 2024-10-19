package Abstract;

public class AdminSMSNotification implements ISMSNotification {

	@Override
	public void sendSMS() {
		System.out.println("Envio SMS admin");		
	}

}
