package Abstract;

public interface INotificationFactory {

	IEmailNotification createEmail();
	ISMSNotification createSMS();
}
