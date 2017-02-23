package es.salesianos.edu.webpages;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.model.Bocadillo;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceBocadillo;




public class DesayunoPage extends WebPage{
	private static final long serialVersionUID = -1935854748907274886L;
	@SpringBean 
	ServiceBocadillo serviceBocadillo;

	@Autowired
	Repository repository;
	
	public DesayunoPage(){
	Form form = new Form("formInsertDesayuno", new CompoundPropertyModel(new Bocadillo())) {
		
		@Override
		protected void onSubmit() {
			super.onSubmit();
			Bocadillo newBocadillo= new Bocadillo();
			
			
			newBocadillo.setTipo(((Bocadillo) getModelObject()).getTipo());
			newBocadillo.setNaaranja(((Bocadillo) getModelObject()).getNaaranja());

			//newBocadillo.setPrecio(((Bocadillo) getModelObject()).getPrecio());
			
			serviceBocadillo.insert(newBocadillo);
			//addViewList();
		}
	};
	
	form.add(new Label("tipoLabel", "Tipo de bocata"));
	form.add(new Label("naaranjaLabel", "Naranja "));
	form.add(new RequiredTextField("tipo"));
	form.add(new RequiredTextField("naaranja"));
	
	add(form);
	
	
	}
}

