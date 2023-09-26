package entities;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
    private Long id;
    private String nom;
    List<Arbre> arbres;
    List<Flor> flors;
    List<Decoracio> decoracios;

    public Floristeria(Long id, String nom) {
        this.id = id;
        this.nom = nom;
        this.arbres = new ArrayList<>();
        this.flors = new ArrayList<>();
        this.decoracios = new ArrayList<>();
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
