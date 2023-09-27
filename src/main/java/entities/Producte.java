package entities;

public abstract class Producte {
	
	private static Long index=0L;
	private Long id;
	private double preu;
	
	public static Long getIndex() {
		return index++;
	}
	
	public Producte(Long id, double preu) {
		this.id = id;
		this.preu = preu;
	}

	public Producte() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	


}
