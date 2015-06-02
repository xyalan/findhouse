package com.hialan.findhouse.web.subscribe.email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/19/15 16:41
 */
public class HiAlanMailAuthenticator extends Authenticator {
	private String userName;

	private String password;

	public HiAlanMailAuthenticator(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}


	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
}
