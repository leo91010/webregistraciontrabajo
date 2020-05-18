package com.worldline.webregistraciontrabajo.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.worldline.webregistraciontrabajo.entities.Administraciones;
import com.worldline.webregistraciontrabajo.entities.UsuariosWeb;
import com.worldline.webregistraciontrabajo.repositories.AdministracionesRepository;
import com.worldline.webregistraciontrabajo.repositories.UsuariosWebRepository;

public class AdministracionesServices {
	
	
	

	private final AdministracionesRepository administracionesRepo;
	
	
	private AdministracionesServices(AdministracionesRepository administracionesRepo) {
		this.administracionesRepo = administracionesRepo;
		
		
	}
	




	private List<Administraciones> findAll() {
		return administracionesRepo.findAll();
		
	}
	
	
	private Administraciones findById(int id) {
		return null;
	}
	
	private void save(Administraciones user) {
	}
	
	private void deleteById(int id) {
	}
	
	

}
