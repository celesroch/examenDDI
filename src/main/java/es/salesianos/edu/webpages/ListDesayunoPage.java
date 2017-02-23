package es.salesianos.edu.webpages;

import java.util.Collections;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;

import es.salesianos.edu.model.Bocadillo;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceBocadillo;



public class ListDesayunoPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean
	ServiceBocadillo service;
	
	@Autowired
	Repository repository;

	private List<Bocadillo> listBocadillo = Collections.emptyList();
	

	public ListDesayunoPage() {
		initC();
	}
	
	/*public void addFormList() {
		Form form = new Form("formListTeam", new CompoundPropertyModel(new Team())) {
			
		};
		add(form);
	}*/
	
	public void initC(){
		//addFormList();
		addViewListForm();
	}
	
	
	
	
	
	public void addViewListForm() {
		Bocadillo bocadillo = new Bocadillo();
		listBocadillo = service.addListTeam();
		ListView<Bocadillo> bocadillos = new ListView<Bocadillo>("team-group", listBocadillo) {
			@Override
			protected void populateItem(ListItem item) {
				Bocadillo bocadillo = (Bocadillo) item.getModelObject();
				item.add(new Label("bocadilloTipo", bocadillo.getTipo()));
				item.add(new Label("bocadilloNaranja", bocadillo.getNaaranja()));
			}
		};
		add(bocadillos);
	}
}
