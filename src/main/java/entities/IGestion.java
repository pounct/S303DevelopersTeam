package entities;

import java.util.List;

public interface IGestion {

	Floristeria crearFloristeria(Long id, String nom);
	void afegirArbre();
	void afegirFlor();
	void afegirDecoracio();
	void retirarArbre(Arbre arbre, Floristeria floristeria);
	void retirarFlor(Flor flor, Floristeria floristeria);
	void retirarDecoracio(Decoracio decoracio, Floristeria floristeria);
	void imprimirStock();
	void imprimirStockQuantitats();
	void imprimirStockValor();
	void crearTicket();
	void mostrarTickets();
	void visualitzarTotalTickets();
	
	
}
