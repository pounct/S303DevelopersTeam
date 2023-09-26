package entities;

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
        floristeria.getDecoracios().add(decoracio);
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

}
