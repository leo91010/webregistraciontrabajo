package com.worldline.webregistraciontrabajo.repositories;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worldline.webregistraciontrabajo.components.AdministracionesServices;
import com.worldline.webregistraciontrabajo.entities.Administraciones;


@Repository
public interface AdministracionesRepository extends JpaRepository<Administraciones, String>{
	


}
