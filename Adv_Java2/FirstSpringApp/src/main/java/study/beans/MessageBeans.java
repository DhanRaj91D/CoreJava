package study.beans;

public class MessageBeans {
	
	private String message , sender;
	
	private ContactDetaills contactDetails;
	

	

	public ContactDetaills getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetaills contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageBeans(String message, String sender) {
		super();
		this.message = message;
		this.sender = sender;
	}

	public MessageBeans() {
		super();
	}

	@Override
	public String toString() {
		return "MessageBeans [message=" + message + ", sender=" + sender + "]";
	}

}
