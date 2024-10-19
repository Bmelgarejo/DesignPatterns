package adapter;

public class SendGridAdapter implements EmailSender{

	private SendGridAPI sendGridAPI;
	
	public SendGridAdapter(SendGridAPI sendGridApi) {
		this.sendGridAPI = sendGridApi;
	}

	@Override
	public void send(String from, String to, String subject, String body) {
		sendGridAPI.sendMail(from, to, subject, body);
	}
	
}
