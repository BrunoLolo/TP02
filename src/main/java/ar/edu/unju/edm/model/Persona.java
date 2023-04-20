package ar.edu.unju.edm.model;

import java.time.LocalDate;
import org.springframework.stereotype.Component;
@Component 
public class Persona {

		private String nombres;
		private String apellidos;
		private LocalDate fechaNaci;
		private Integer edad;
		private String signoZodiaco;
		private String estacion;

	public Persona() {
		
	}
	
	public Persona(String nombres, String apellidos, LocalDate fechaNaci) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNaci = fechaNaci;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
		
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public LocalDate getFechaNaci() {
		return fechaNaci;
	}
	
	public void setFechaNaci(LocalDate fechaNaci) {
		this.fechaNaci = fechaNaci;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSignoZodiaco() {
		return signoZodiaco;
	}

	public void setSignoZodiaco(String signoZodiaco) {
		this.signoZodiaco = signoZodiaco;
	}

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}
	
}