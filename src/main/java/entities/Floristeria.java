package entities;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
	private Long id;
	private String nom;
	private List<Arbre> arbres;
	private List<Flor> flors;
	private List<Decoracio> decoracions;

	public Floristeria(Long id, String nom) {
		this.id = id;
		this.nom = nom;
		this.arbres = new ArrayList<Arbre>();
		this.flors = new ArrayList<Flor>();
		this.decoracions = new ArrayList<Decoracio>();
	}

	public List<Arbre> getArbres() {
		return arbres;
	}

	public List<Flor> getFlors() {
		return flors;
	}

	public List<Decoracio> getDecoracions() {
		return decoracions;
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

<<<<<<< HEAD
	public void setNom(String nom) {
		this.nom = nom;
	}
=======
    public List<Arbre> getArbres() {
        return arbres;
    }

    public List<Flor> getFlors() {
        return flors;
    }

    public List<Decoracio> getDecoracios() {
        return decoracios;
    }

    @Override
    public String toString() {
        return "Floristeria [id=" + id + ", nom=" + nom + "]";
    }
>>>>>>> e49d224a6f65e8b95961eb8ca0dd609d9a8da54c

	@Override
	public String toString() {
		return "Floristeria [id=" + id + ", nom=" + nom + "]";
	}

}
