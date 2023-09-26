package entities;

<<<<<<< HEAD
import java.util.List;

public class Gestion implements IGestion {

	public Floristeria crearFloristeria(Long id, String nom) {
		return new Floristeria(id, nom);
	}

	public void afegirArbre() {

	}

	public void afegirFlor() {
		// TODO Auto-generated method stub

	}

	public void afegirDecoracio() {
		// TODO Auto-generated method stub

	}

	public void retirarArbre(Arbre arbre, Floristeria floristeria) {
		floristeria.getArbres().remove(arbre);

	}

	public void retirarFlor(Flor flor, Floristeria floristeria) {
		floristeria.getFlors().remove(flor);

	}

	public void retirarDecoracio(Decoracio decoracio, Floristeria floristeria) {
		floristeria.getDecoracions().remove(decoracio);

	}

	public void imprimirStock() {
		// TODO Auto-generated method stub

	}

	public void imprimirStockQuantitats() {
		// TODO Auto-generated method stub

	}

	public void imprimirStockValor() {
		// TODO Auto-generated method stub

	}

	public void crearTicket() {
		// TODO Auto-generated method stub

	}

	public void mostrarTickets() {
		// TODO Auto-generated method stub

	}

	public void visualitzarTotalTickets() {
		// TODO Auto-generated method stub

	}
=======
public class Gestion implements IGestion {

    public void afegirArbre(Arbre arbol, Floristeria floristeria) {
        floristeria.getArbres().add(arbol);
        System.out.println("El arbol " + arbol.toString() + " se ha añadido");
    }

    public void afegirFlor(Flor flor, Floristeria floristeria) {
        floristeria.getFlors().add(flor);
        System.out.println("La flor " + flor.toString() + " se ha añadido");
    }

    public void afegirDecoracio(Decoracio decoracio, Floristeria floristeria) {
        floristeria.getDecoracions().add(decoracio);
        System.out.println("La decoració " + decoracio.toString() + " se ha añadido");

    }

    public void retirarArbre() {
        // TODO Auto-generated method stub

    }

    public void retirarFlor() {
        // TODO Auto-generated method stub

    }

    public void retirarDecoracio() {
        // TODO Auto-generated method stub

    }

    public void imprimirStock() {
        // TODO Auto-generated method stub

    }

    public void imprimirStockQuantitats() {
        // TODO Auto-generated method stub

    }

    public void imprimirStockValor() {
        // TODO Auto-generated method stub

    }

    public void crearTicket() {
        // TODO Auto-generated method stub

    }

    public void mostrarTickets() {
        // TODO Auto-generated method stub

    }

    public void visualitzarTotalTickets() {
        // TODO Auto-generated method stub

    }
>>>>>>> e49d224a6f65e8b95961eb8ca0dd609d9a8da54c

}
