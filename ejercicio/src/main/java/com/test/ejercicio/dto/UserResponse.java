package com.test.ejercicio.dto;

import java.util.ArrayList;

/**
 * The Class UserResponse.
 */
public class UserResponse {
	
	public String getCreated() {
		return created;
	}
	public String getModified() {
		return modified;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public String getToken() {
		return token;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public ArrayList<PhoneResponse> getPhones() {
		return phones;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhones(ArrayList<PhoneResponse> phones) {
		this.phones = phones;
	}
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String created;
	private String modified;
	private String lastLogin;
	private String token;
	private Boolean isactive;
	private String name;
	private String email;
	private String password;
	private ArrayList<PhoneResponse> phones;

}
