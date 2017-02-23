package es.salesianos.edu.model;

import java.io.Serializable;

public class Estudiante implements Serializable{
	private Bocadillo Bocadillo;
	private int totalPrecio;

	

	public int getTotalPrecio() {
		return totalPrecio;
	}

	public void setTotalPrecio(int totalPrecio) {
		this.totalPrecio = totalPrecio;
	}

	public Bocadillo getBocadillo() {
		return Bocadillo;
	}

	public void setBocadillo(Bocadillo bocadillo) {
		Bocadillo = bocadillo;
	}
}
