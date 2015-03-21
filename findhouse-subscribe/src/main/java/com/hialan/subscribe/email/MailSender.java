package com.hialan.subscribe.email;

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

	private Message message = null;

	public static MailSender create() {
		return new MailSender();
	}

	private Properties getProps() {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.qq.com");
		props.put("mail.smtp.port", "587");
		return props;
	}

	public MailSender createSession(Authenticator authenticator) {
		session = Session.getInstance(getProps(), authenticator);
		return this;
	}

	private Message buildMsg(Email email) throws MessagingException  {
		message = new MimeMessage(session);
		/*message.setFrom(new InternetAddress(email.getFrom()));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(email.getRecipient()));*/
		message.setSubject(email.getSubject());
		message.setText(email.getContent());

		return message;
	}

	public void sendMail()  {
		try {
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
