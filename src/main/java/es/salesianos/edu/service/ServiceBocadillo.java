package es.salesianos.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.salesianos.edu.model.Bocadillo;
import es.salesianos.edu.repository.Repository;



@Component
public class ServiceBocadillo {
	
	@Autowired
	Repository repository;
		
	public boolean insert(Bocadillo bocadillo) {
		repository.insertBocadillo(bocadillo);
		
		return true;
	}
	
	public boolean show() {
		
		return true;
	}
	
	public List<Bocadillo> addListTeam() {
		return repository.getDb().getBocadillos();
	}
}
