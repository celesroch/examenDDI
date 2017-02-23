package es.salesianos.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage{
	
	public HomePage() {
		
		BookmarkablePageLink link1 = 
			new BookmarkablePageLink("linkPlayerDesayuno", 
			DesayunoPage.class);
		
		
		add(link1);

		
	}

}
