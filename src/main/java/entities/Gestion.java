package entities;

import java.util.List;

public class Gestion implements IGestion {

	public Floristeria crearFloristeria(Long id, String nom) {
		return new Floristeria(id, nom);
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

	public void imprimirStock(Floristeria floristeria) {
		System.out.println("Productes:");
		System.out.println("----------");
		System.out.println("Arbres:");
		System.out.println(floristeria.getArbres());
		System.out.println("Flors:");
		System.out.println(floristeria.getFlors());
		System.out.println("Decoracions:");
		System.out.println(floristeria.getDecoracions());

	}

	public void imprimirStockQuantitats(Floristeria floristeria) {
		System.out.println("Productes amb Quantitats:");
		System.out.println("----------");
		System.out.print("Arbres: ");
		System.out.println(floristeria.getArbres().size());
		System.out.print("Flors: ");
		System.out.println(floristeria.getFlors().size());
		System.out.print("Decoracions: ");
		System.out.println(floristeria.getDecoracions().size());

	}

	public void imprimirStockValor(Floristeria floristeria) {
		System.out.print("Valor Total Productes de la floristeria : " + floristeria.getNom());
		System.out.println(
				floristeria.getValorArbres() + floristeria.getValorFlors() + floristeria.getValorDecoracions());

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
