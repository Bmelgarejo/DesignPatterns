package adapter;

public class ConventionalEmailSender implements EmailSender {

	@Override
	public void send(String from,String to, String subject, String body) {
		System.out.println("Envio de correo desde conventionalEmailSender");
		System.out.println("from " + from);
		System.out.println("to" + to);
		System.out.println("subject" + subject);
		System.out.println("body" + body);
	}

}
