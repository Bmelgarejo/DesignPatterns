package adapter;

public class Client {

	private EmailSender sender;
	
	public Client(EmailSender sender) {
		this.sender = sender;
	}
	
	public void ejecutar() {
		String from = " juanperez@gmail.com";
		String to = " destinatario@gmail.com";
		String subject = " Saludos";
		String body = " Cuerpo del mensaje";
		sender.send(from, to, subject, body);
	}
	
	public static void main(String [] args) {
		SendGridAPI sendGridAPI = new SendGridAPI();
		EmailSender sendGridAdapter = new SendGridAdapter(sendGridAPI);
		
		Client client = new Client(sendGridAdapter);
		client.ejecutar();
	}
}
