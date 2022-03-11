package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("first")
@Scope("prototype")
public class MessageBeans {
	
	private String message , sender;
	
	@Autowired
	private ContactDetaills contactDetails;
	
	public MessageBeans() {

		this.setMessage("Hello from Anotation type msg");
		this.setSender("Dhanraj");
	
	}
	

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

	

	@Override
	public String toString() {
		return "MessageBeans [message=" + message + ", sender=" + sender + "]";
	}

}
