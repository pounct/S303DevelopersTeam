package entities;

public class Flor extends Producte {
	private String color;

	public Flor() {
		
	}

	public Flor(double preu, String color) {
		super(Producte.getIndex(), preu);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
