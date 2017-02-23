package es.salesianos.edu.repository;

import java.util.List;

import es.salesianos.edu.connection.DataBase;
import es.salesianos.edu.model.Bocadillo;


@org.springframework.stereotype.Repository
public class Repository{

	 private DataBase db = new DataBase();

	public DataBase getDb() {
		return db;
	}

	public void setDb(DataBase db) {
		this.db = db;
	}
	
	public boolean insertBocadillo (Bocadillo bocadillo) {
		db.getBocadillos().add(bocadillo);
		return true;
	}
	
	public List<Bocadillo> listBocadillo() {
		
		return db.getBocadillos();
	}

	
}
