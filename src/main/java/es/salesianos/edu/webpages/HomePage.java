package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage{
	
	public HomePage() {
		
		BookmarkablePageLink link1 = 
			new BookmarkablePageLink("linkDesayuno", 
			DesayunoPage.class);
		BookmarkablePageLink link2 = 
				new BookmarkablePageLink("linkDesayunoList", 
				ListDesayunoPage.class);
		
		
		add(link1);
		add(link2);

		
	}

}
