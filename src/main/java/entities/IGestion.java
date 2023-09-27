package entities;

import java.util.List;

public interface IGestion {

	Floristeria crearFloristeria(Long id, String nom);

	void retirarArbre(Arbre arbre, Floristeria floristeria);

	void retirarFlor(Flor flor, Floristeria floristeria);

	void retirarDecoracio(Decoracio decoracio, Floristeria floristeria);

	void afegirArbre(Arbre arbol, Floristeria floristeria);

	void afegirFlor(Flor flor, Floristeria floristeria);

	void afegirDecoracio(Decoracio decoracio, Floristeria floristeria);

	void imprimirStock(Floristeria floristeria);

	void imprimirStockQuantitats(Floristeria floristeria);

	void imprimirStockValor(Floristeria floristeria);

	Ticket crearTicket();

	void mostrarTickets();

	void visualitzarTotalTickets();

}
