package entities;

public class Arbre extends Producte {
	private double alcada;

	public Arbre() {
		
	}

	public Arbre(double preu, double alcada) {
		super(Producte.getIndex(), preu);
		this.alcada = alcada;
	}

	public double getAlcada() {
		return alcada;
	}

	public void setAlcada(double alcada) {
		this.alcada = alcada;
	}

	

	

	

	
	
}
