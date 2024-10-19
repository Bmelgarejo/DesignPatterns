package adapter;

public interface EmailSender {
	
	void send(String from,String to, String subject, String body);
}
