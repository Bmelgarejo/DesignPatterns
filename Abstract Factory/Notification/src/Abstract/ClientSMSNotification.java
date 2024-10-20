package Abstract;

public class ClientSMSNotification implements ISMSNotification {

	@Override
	public void sendSMS() {
		System.out.println("Envio SMS cliente");		
	}

}
