package es.salesianos.models;

import java.io.Serializable;

public class Estudiante implements Serializable{
	private String name;
	private Comida comida;
	private int totalPrecio;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public int getTotalPrecio() {
		return totalPrecio;
	}

	public void setTotalPrecio(int totalPrecio) {
		this.totalPrecio = totalPrecio;
	}
}
