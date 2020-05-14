package com.worldline.webregistraciontrabajo.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "consorcios")
public class Consorcios {
	
	public String domicilio;
	public String nombreYApellidoEncargado;
	public String telMovilEncargo;
	public String telMovilReferenteConsorcio;
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombreYApellidoEncargado() {
		return nombreYApellidoEncargado;
	}
	public void setNombreYApellidoEncargado(String nombreYApellidoEncargado) {
		this.nombreYApellidoEncargado = nombreYApellidoEncargado;
	}
	public String getTelMovilEncargo() {
		return telMovilEncargo;
	}
	public void setTelMovilEncargo(String telMovilEncargo) {
		this.telMovilEncargo = telMovilEncargo;
	}
	public String getTelMovilReferenteConsorcio() {
		return telMovilReferenteConsorcio;
	}
	public void setTelMovilReferenteConsorcio(String telMovilReferenteConsorcio) {
		this.telMovilReferenteConsorcio = telMovilReferenteConsorcio;
	}

}
