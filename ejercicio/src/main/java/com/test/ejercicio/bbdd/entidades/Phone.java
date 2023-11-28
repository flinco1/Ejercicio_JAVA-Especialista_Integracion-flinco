package com.test.ejercicio.bbdd.entidades;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * The Class Phone.
 */
@Entity
public class Phone implements Serializable{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7328849920502931933L;
	
	/** The id. */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	/** The number. */
	private String number;
	
	/** The citycode. */
	private String citycode;
	
	/** The contrycode. */
	private String contrycode;
	
	/** The usuario. */
	@ManyToOne
	private Usuario usuario;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * Gets the citycode.
	 *
	 * @return the citycode
	 */
	public String getCitycode() {
		return citycode;
	}
	
	/**
	 * Gets the contrycode.
	 *
	 * @return the contrycode
	 */
	public String getContrycode() {
		return contrycode;
	}
	
	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Sets the number.
	 *
	 * @param number the new number
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 * Sets the citycode.
	 *
	 * @param citycode the new citycode
	 */
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	
	/**
	 * Sets the contrycode.
	 *
	 * @param contrycode the new contrycode
	 */
	public void setContrycode(String contrycode) {
		this.contrycode = contrycode;
	}
	
	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    
}
