package com.test.ejercicio.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ejercicio.bbdd.dao.PhoneDao;
import com.test.ejercicio.bbdd.dao.UsuarioDao;
import com.test.ejercicio.bbdd.entidades.Phone;
import com.test.ejercicio.bbdd.entidades.Usuario;
import com.test.ejercicio.dto.PhoneRequest;
import com.test.ejercicio.dto.PhoneResponse;
import com.test.ejercicio.dto.UserRequest;
import com.test.ejercicio.dto.UserResponse;

@Service
public class UsuarioService implements IUsuarioService {

	/** The usuario dao. */
	@Autowired
    private UsuarioDao usuarioDao;
	
	/** The phone dao. */
	@Autowired
    private PhoneDao phoneDao;
	
	
    public Boolean validarUsuario(UserRequest userRequest) {
		List<Usuario> findByEmail = usuarioDao.findByEmail(userRequest.getEmail());
		return findByEmail.isEmpty();
	}
	
    /**
     * Crear usuario.
     *
     * @param userRequest the user request
     * @return the user response
     */
    @Override
	@Transactional
    public UserResponse crearUsuario(UserRequest userRequest) {
    	
    	//creación de los usuarios
    	Usuario usuario = UserRequestToUsuario(userRequest);
    	Usuario nuevoUsuario = usuarioDao.save(usuario);
    	
    	//creación de los telefonos
    	ArrayList<Phone> phones = new ArrayList<Phone>();
    	if(userRequest.getPhones() != null) {
			for (PhoneRequest phoneRequest : userRequest.getPhones()) {
				Phone phone = new Phone();
				phone.setNumber(phoneRequest.getNumber());
				phone.setCitycode(phoneRequest.getCitycode());
				phone.setContrycode(phoneRequest.getContrycode());
				phone.setUsuario(nuevoUsuario);
				Phone nuevoPhone = phoneDao.save(phone);
				phones.add(nuevoPhone);
			}
			nuevoUsuario.setPhones(phones);
    	}
		
        return UserToUserResponse(nuevoUsuario);
    }
    
	/**
	 * User request to usuario.
	 *
	 * @param userRequest the user request
	 * @return the usuario
	 */
	private Usuario UserRequestToUsuario(UserRequest userRequest){
		//obtiene la fecha y hora actual
        LocalDateTime datetime = LocalDateTime.now();
        
		Usuario usuario = new Usuario();
		usuario.setCreated(datetime.toString());
		usuario.setModified(datetime.toString());
		usuario.setLastLogin(datetime.toString());
		usuario.setToken("token");
		usuario.setIsactive(Boolean.TRUE);
		usuario.setName(userRequest.getName());
		usuario.setEmail(userRequest.getEmail());
		usuario.setPassword(userRequest.getPassword());

		return usuario;
		
	}
	
	/**
	 * User to user response.
	 *
	 * @param usuario the usuario
	 * @return the user response
	 */
	private UserResponse UserToUserResponse(Usuario usuario){
		UserResponse retorno = new UserResponse();
		retorno.setId(usuario.getId());
		retorno.setCreated(usuario.getCreated());
		retorno.setModified(usuario.getModified());
		retorno.setLastLogin(usuario.getLastLogin());
		retorno.setToken(usuario.getToken());
		retorno.setIsactive(usuario.getIsactive());
		retorno.setName(usuario.getName());
		retorno.setEmail(usuario.getEmail());
		retorno.setPassword(usuario.getPassword());
		
		
		ArrayList<PhoneResponse> phones = new ArrayList<PhoneResponse>();
		if(usuario.getPhones() != null && !usuario.getPhones().isEmpty()) {
			for (Phone phoneRequest : usuario.getPhones()) {
					PhoneResponse phone = new PhoneResponse();
					phone.setNumber(phoneRequest.getNumber());
					phone.setCitycode(phoneRequest.getCitycode());
					phone.setContrycode(phoneRequest.getContrycode());
					phones.add(phone);
				}
			
			retorno.setPhones(phones);
		}
		return retorno;
		
	}
    
}
