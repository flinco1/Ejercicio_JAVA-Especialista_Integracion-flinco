package com.test.ejercicio.bbdd.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.ejercicio.bbdd.entidades.Phone;

@Repository
public interface PhoneDao extends CrudRepository<Phone, Integer>  {

}
