package Abstract;

public class ClientNotificationFactory implements INotificationFactory {

	@Override
	public IEmailNotification createEmail() {
		return new ClientEmailNotification();
	}

	@Override
	public ISMSNotification createSMS() {
		return new ClientSMSNotification();
	}

}
