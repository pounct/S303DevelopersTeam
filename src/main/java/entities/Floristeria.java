package entities;

public class Floristeria {
	private Long id;
	private String nom;
	
	public Floristeria(Long id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public Floristeria() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Floristeria [id=" + id + ", nom=" + nom + "]";
	}

	
}
