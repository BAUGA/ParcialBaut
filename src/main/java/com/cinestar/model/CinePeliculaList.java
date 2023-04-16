package com.cinestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CinePeliculaList {

	public String getHorarios() {
		return Horarios;
	}
	public void setHorarios(String horarios) {
		Horarios = horarios;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	@Id
	private String Titulo;
	private String Horarios;
	public String getTitulo() {
		return Titulo;
}
}
