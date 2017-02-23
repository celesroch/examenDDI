package es.salesianos.edu.webpages;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class Botones extends WebPage{
	public Botones(){
	   // Add a form with an onSubmit implementation that sets a message
    Form form = new Form("formBotones") {
    	public void onSubmit() {
            info("Form.onSubmit executed");
        }
    };

    Button button1 = new Button("bLonganiza") {
        public void onSubmit() {
            info("bLonganiza.onSubmit executed");
        }
    };
    form.add(button1);

    Button button2 = new Button("bTofu") {
        public void onSubmit() {
            info("bTofu.onSubmit executed");
        }
    };
    form.add(button2);
    
    Button button3 = new Button("bNaranjas") {
        public void onSubmit() {
            info("bNaranjas.onSubmit executed");
        }
    };
    form.add(button3);
    
    Button button4 = new Button("bTotalizado") {
        public void onSubmit() {
            info("bTotalizado.onSubmit executed");
        }
    };
    form.add(button4);

    add(form);
	}
}
