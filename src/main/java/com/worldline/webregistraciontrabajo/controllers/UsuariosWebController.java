package com.worldline.webregistraciontrabajo.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosWebController {
	
	@RequestMapping("/")
	public String getUsuariosWeb() {
		return "getAllTheUsers";
		
	}
	

}
