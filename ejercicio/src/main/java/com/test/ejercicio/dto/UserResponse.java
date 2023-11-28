package com.test.ejercicio.dto;

import java.util.ArrayList;

/**
 * The Class UserResponse.
 */
public class UserResponse {
	
	/** The created. */
	private String created;
	
	/** The modified. */
	private String modified;
	
	/** The last login. */
	private String lastLogin;
	
	/** The token. */
	private String token;
	
	/** The isactive. */
	private Boolean isactive;
	
	/** The name. */
	private String name;
	
	/** The email. */
	private String email;
	
	/** The password. */
	private String password;
	
	/** The phones. */
	private ArrayList<PhoneResponse> phones;
	
	/**
	 * Gets the created.
	 *
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}
	
	/**
	 * Gets the modified.
	 *
	 * @return the modified
	 */
	public String getModified() {
		return modified;
	}
	
	/**
	 * Gets the last login.
	 *
	 * @return the last login
	 */
	public String getLastLogin() {
		return lastLogin;
	}
	
	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	
	/**
	 * Gets the isactive.
	 *
	 * @return the isactive
	 */
	public Boolean getIsactive() {
		return isactive;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Gets the phones.
	 *
	 * @return the phones
	 */
	public ArrayList<PhoneResponse> getPhones() {
		return phones;
	}
	
	/**
	 * Sets the created.
	 *
	 * @param created the new created
	 */
	public void setCreated(String created) {
		this.created = created;
	}
	
	/**
	 * Sets the modified.
	 *
	 * @param modified the new modified
	 */
	public void setModified(String modified) {
		this.modified = modified;
	}
	
	/**
	 * Sets the last login.
	 *
	 * @param lastLogin the new last login
	 */
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * Sets the isactive.
	 *
	 * @param isactive the new isactive
	 */
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
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
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * Sets the phones.
	 *
	 * @param phones the new phones
	 */
	public void setPhones(ArrayList<PhoneResponse> phones) {
		this.phones = phones;
	}
	
	/** The id. */
	private Integer id;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	


}
