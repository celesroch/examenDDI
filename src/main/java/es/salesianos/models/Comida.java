package es.salesianos.models;

import java.io.Serializable;

public class Comida implements Serializable{
	private String tofu;
	private String longaniza; 
	private boolean naranja;
	private int precio;
	
	public String getTofu() {
		return tofu;
	}
	public void setTofu(String tofu) {
		this.tofu = tofu;
	}
	public String getLonganiza() {
		return longaniza;
	}
	public void setLonganiza(String longaniza) {
		this.longaniza = longaniza;
	}
	public boolean isNaranja() {
		return naranja;
	}
	public void setNaranja(boolean naranja) {
		this.naranja = naranja;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
