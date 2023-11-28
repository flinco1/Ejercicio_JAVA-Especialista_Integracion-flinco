package com.test.ejercicio.dto;

import java.util.ArrayList;

/**
 * The Class User.
 */
public class UserRequest {
	
	/** The name. */
	private String name;

	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The phones. */
	private ArrayList<PhoneRequest> phones;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the phones.
	 *
	 * @return the phones
	 */
	public ArrayList<PhoneRequest> getPhones() {
		return phones;
	}

	/**
	 * Sets the phones.
	 *
	 * @param phones the new phones
	 */
	public void setPhones(ArrayList<PhoneRequest> phones) {
		this.phones = phones;
	}

}
