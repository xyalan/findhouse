package com.hialan.subscribe.email;

import com.hialan.subscribe.constant.MailServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/19/15 11:02
 */
public class MailSender {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private Session session = null;

	private Message message = null;

	public static MailSender create() {
		return new MailSender();
	}

	private Properties getProps() {
		Properties props = new Properties();
		props.put(MailServerConfig.MAIL_SMTP_AUTH, "true");
		props.put(MailServerConfig.MAIL_SMTP_STARTTLS_ENABLE, "true");
		props.put(MailServerConfig.MAIL_SMTP_HOST, "smtp.qq.com");
		props.put(MailServerConfig.MAIL_SMTP_PORT, "587");
		return props;
	}

	public MailSender createSession(Authenticator authenticator) {
		session = Session.getInstance(getProps(), authenticator);
		return this;
	}

	private Message buildMsg(Email email) throws MessagingException  {
		message = new MimeMessage(session);
		message.setFrom(email.getFrom());
		message.setRecipients(Message.RecipientType.TO, email.getAllRecipients());
		message.setSubject(email.getSubject());
		message.setText(email.getContent());

		return message;
	}

	public void sendMail()  {
		try {
			Transport.send(message);
		} catch (MessagingException e) {
			logger.warn("send message failed", e);
		}
	}

}
