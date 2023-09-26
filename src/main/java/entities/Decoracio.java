package entities;

public class Decoracio extends Producte {
	private Material material;

	public Decoracio() {
		
	}

	public Decoracio(Long id, double preu, Material material) {
		super(id, preu);
		this.material = material;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	

}
