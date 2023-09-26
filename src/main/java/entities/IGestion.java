package entities;

import java.util.List;

public interface IGestion {

<<<<<<< HEAD
	Floristeria crearFloristeria(Long id, String nom);
	void afegirArbre();
	void afegirFlor();
	void afegirDecoracio();
	void retirarArbre(Arbre arbre, Floristeria floristeria);
	void retirarFlor(Flor flor, Floristeria floristeria);
	void retirarDecoracio(Decoracio decoracio, Floristeria floristeria);
=======
	void afegirArbre(Arbre arbol, Floristeria floristeria);
	void afegirFlor(Flor flor, Floristeria floristeria);
	void afegirDecoracio(Decoracio decoracio, Floristeria floristeria);
	void retirarArbre();
	void retirarFlor();
	void retirarDecoracio();
>>>>>>> e49d224a6f65e8b95961eb8ca0dd609d9a8da54c
	void imprimirStock();
	void imprimirStockQuantitats();
	void imprimirStockValor();
	void crearTicket();
	void mostrarTickets();
	void visualitzarTotalTickets();
	
	
}
