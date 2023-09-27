package entities;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private Long id;
	private List<Producte> productes;

	public Ticket() {
		
	}
	
	public Ticket(Long id) {
		this.id = id;
		this.productes = new ArrayList<Producte>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Producte> getProductes() {
		return productes;
	}

	
	
	
	//	public List<Arbre> getArbres() {
//		return arbres;
//	}
//
//	public List<Flor> getFlors() {
//		return flors;
//	}
//
//	public List<Decoracio> getDecoracions() {
//		return decoracions;
//	}
}
