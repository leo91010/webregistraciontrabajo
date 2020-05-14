package com.worldline.webregistraciontrabajo.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuariosWeb")
public class UsuariosWeb {
	
	public String usuario;
	public String password;
	public String repetirPassword;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepetirPassword() {
		return repetirPassword;
	}
	public void setRepetirPassword(String repetirPassword) {
		this.repetirPassword = repetirPassword;
	}

}
