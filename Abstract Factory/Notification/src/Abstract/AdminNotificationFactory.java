package Abstract;

public class AdminNotificationFactory implements INotificationFactory {

	@Override
	public IEmailNotification createEmail() {
		return new AdminEmailNotification();
	}

	@Override
	public ISMSNotification createSMS() {
		return new AdminSMSNotification();
	}


}
