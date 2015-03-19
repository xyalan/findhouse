package com.hialan.subscribe.push;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/19/15 11:02
 */
public class MailSender {
	private Session session = null;

	private final String userName = "";

	private final String password = "";

	public MailSender create() {
		return new MailSender();
	}

	private Properties getProps() {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		return props;
	}

	public MailSender createSession() {
		Authenticator authenticator = new HiAlanMailAuthenticator(userName, password);
		session = Session.getInstance(getProps(), authenticator);
		return this;
	}

	private Message buildMsg(String content) throws MessagingException  {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("alan@hialan.com"));
		message.setRecipient(Message.RecipientType.TO, null);
		message.setSubject("");
		message.setText(content);

		return message;
	}

	public void sendMail(String content) throws MessagingException {
		Transport.send(buildMsg(content));
	}
}
