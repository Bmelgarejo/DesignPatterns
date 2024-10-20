package Abstract;

public class Main {

	public static void main(String[] args) {
	
		//Notificaciones cleinte
		INotificationFactory clientFactory = new ClientNotificationFactory();
		IEmailNotification clientEmail = clientFactory.createEmail();
		ISMSNotification clientSms = clientFactory.createSMS();
				
		//Notificaciones Admin
		INotificationFactory adminFactory = new AdminNotificationFactory();
		IEmailNotification adminEmail = adminFactory.createEmail();
		ISMSNotification adminSms = adminFactory.createSMS();
		
		clientEmail.sendEmail();
		adminEmail.sendEmail();

	}

}
