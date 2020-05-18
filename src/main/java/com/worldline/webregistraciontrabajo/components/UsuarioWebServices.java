package com.worldline.webregistraciontrabajo.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldline.webregistraciontrabajo.entities.UsuariosWeb;
import com.worldline.webregistraciontrabajo.repositories.UsuariosWebRepository;


public class UsuarioWebServices {
	

	private final UsuariosWebRepository webRegisServRepo;
	
	public UsuarioWebServices(UsuariosWebRepository webRegisServRepo) {
		this.webRegisServRepo = webRegisServRepo;
		
		
	}
	
	public List<UsuariosWeb> findAll() {
		return webRegisServRepo.findAll();
		
	}
	
	

}
