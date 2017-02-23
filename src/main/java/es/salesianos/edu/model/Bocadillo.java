package es.salesianos.edu.model;

import java.io.Serializable;

public class Bocadillo implements Serializable{
	private String tipo;
	private String precio;
	private String naaranja;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getNaaranja() {
		return naaranja;
	}
	public void setNaaranja(String naaranja) {
		this.naaranja = naaranja;
	}
}