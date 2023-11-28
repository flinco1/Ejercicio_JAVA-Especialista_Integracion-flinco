package com.test.ejercicio.bbdd.entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Phone implements Serializable{


	private static final long serialVersionUID = 7328849920502931933L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String number;
	private String citycode;
	private String contrycode;
	
	@ManyToOne
	private Usuario usuario;
	
	public Integer getId() {
		return id;
	}
	public String getNumber() {
		return number;
	}
	public String getCitycode() {
		return citycode;
	}
	public String getContrycode() {
		return contrycode;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    
}
