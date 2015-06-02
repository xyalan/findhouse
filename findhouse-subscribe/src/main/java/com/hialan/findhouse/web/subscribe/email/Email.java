package com.hialan.findhouse.web.subscribe.email;

import javax.mail.Address;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Arrays;
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

	public Address[] getAllRecipients() {
		Address[] address = null;
		Optional<String[]> optional = Optional.ofNullable(recipients);
		if (optional.isPresent()) {
			address = Arrays.stream(optional.get()).map(s -> {
				InternetAddress internetAddress = null;
				try {
					internetAddress = new InternetAddress(s);
				} catch (AddressException e) {

				}
				return internetAddress;
			}).toArray(InternetAddress[]::new);

		}

		return address;
	}

	public void setRecipients(String... recipients) {
		this.recipients = recipients;
	}

}
