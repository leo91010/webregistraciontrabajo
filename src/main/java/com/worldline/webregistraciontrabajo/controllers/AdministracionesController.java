package com.worldline.webregistraciontrabajo.controllers;

import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.worldline.webregistraciontrabajo.components.AdministracionesServices;

@RestController
public class AdministracionesController {
	
	@Autowired
	private AdministracionesServices administracionesServices;
	
	@GetMapping("/getAdministraciones")
	public Object getAdministraciones() {
		return null;
	}

}
