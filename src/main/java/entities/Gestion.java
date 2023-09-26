package entities;

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

}
