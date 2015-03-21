package com.hialan.subscribe.email;

import javax.mail.Address;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Optional;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/20/15 17:11
 */
public class Email {
	private String content;

	private String subject;

	private String from;

	private String recipient;

	private String[] recipients;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Address getFrom() throws AddressException {
		Address address = null;
		Optional<String> optional = Optional.ofNullable(from) ;
		if (optional.isPresent()) {
			address = new InternetAddress(optional.get());
		}

		return address;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getAllRecipients() {
		Address[] address = null;
		Optional<String[]> optional = Optional.ofNullable(recipients);
		if (optional.isPresent()) {
			address = new Address[optional.get().length];
			for (String rp : optional.get()) {
			}
		}
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public void setRecipients(String[] recipients) {
		this.recipients = recipients;
	}

	public static void main(String[] args) throws AddressException {
		Email email = new Email();
		email.setFrom("alan@hialan.com");
		System.out.println(email.getFrom());
	}

}
