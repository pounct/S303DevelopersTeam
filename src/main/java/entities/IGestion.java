package entities;

public interface IGestion {

	void afegirArbre(Arbre arbol, Floristeria floristeria);
	void afegirFlor(Flor flor, Floristeria floristeria);
	void afegirDecoracio(Decoracio decoracio, Floristeria floristeria);
	void retirarArbre();
	void retirarFlor();
	void retirarDecoracio();
	void imprimirStock();
	void imprimirStockQuantitats();
	void imprimirStockValor();
	void crearTicket();
	void mostrarTickets();
	void visualitzarTotalTickets();
	
	
}
