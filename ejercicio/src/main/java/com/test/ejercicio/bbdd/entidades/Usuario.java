package com.test.ejercicio.bbdd.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario implements Serializable{

	public Integer getId() {
		return id;
	}

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

	public List<Phone> getPhones() {
		return phones;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setPhones(ArrayList<Phone> phones) {
		this.phones = phones;
	}

	private static final long serialVersionUID = 4404395764722848956L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String created;
	private String modified;
	private String lastLogin;
	private String token;
	private Boolean isactive;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "usuario",fetch = FetchType.EAGER)
	private List<Phone> phones;
	


    
}
