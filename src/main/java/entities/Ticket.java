package entities;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private Long id;
	private static Long index=0L;
	private List<Producte> productes;
	
	public static Long getIndex() {
		return index++;
	}

	
	
	public Ticket() {
		id=getIndex();
		productes = new ArrayList<Producte>();
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



	@Override
	public String toString() {
		return id + "\n productes=" + productes + "]";
	}

	

}
