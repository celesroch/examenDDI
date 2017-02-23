package es.salesianos.edu.connection;

import java.util.ArrayList;

import es.salesianos.edu.model.Bocadillo;


public class DataBase {

	private ArrayList<Bocadillo> bocadillo = new ArrayList<Bocadillo>();

	public ArrayList<Bocadillo> getBocadillos() {
		return bocadillo;
	}

	public void setTeams(ArrayList<Bocadillo> bocadillos) {
		this.bocadillo = bocadillos;
	}

}
