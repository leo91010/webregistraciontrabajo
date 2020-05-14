package com.worldline.webregistraciontrabajo.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldline.webregistraciontrabajo.entities.Consorcios;
import com.worldline.webregistraciontrabajo.entities.UsuariosWeb;
import com.worldline.webregistraciontrabajo.repositories.ConsorciosRepository;
import com.worldline.webregistraciontrabajo.repositories.UsuariosWebRepository;

@Service
public class ConsorciosService {
	
	@Autowired
	private final ConsorciosRepository consorciosRepo;
	
	public ConsorciosService(ConsorciosRepository consorciosRepo) {
		this.consorciosRepo = consorciosRepo;
		
		
	}
	
	public List<Consorcios> findAll() {
		return consorciosRepo.findAll();
		
	}

}
