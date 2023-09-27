package entities;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// floristeria a activar
		Floristeria floristeria = null;
		// gestionar floristeria
		Gestion gestion = new Gestion();
		boolean onProgram = true;

		Byte opcion;

		while (onProgram) {

			System.out.println(" Floristeria actiu : " + ((floristeria != null) ? floristeria.getNom() : "cap"));

			System.out.println("-----------------\n");
			System.out.println(" 1.Crear Floristeria."); // obrir floristeria
			System.out.println(" 14.Obrir Floristeria.");
			System.out.println(" 2.Afegir Arbre.");
			System.out.println(" 3.Afegir Flor.");
			System.out.println(" 4.Afegir Decoració.");
			System.out.println(" 5.Stock");
			System.out.println(" 6.Retirar arbre.");
			System.out.println(" 7.Retirar flor.");
			System.out.println(" 8.Retirar decoració.");
			System.out.println(" 9.Stock Amb Quantitats");
			System.out.println(" 10.Valor Stock");
			System.out.println(" 11.Compra amb múltiples objectes");
			System.out.println(" 12.Compres Antigues.");
			System.out.println(" 13.diners guanyats");
			System.out.println(" 0.fin");
			opcion = sc.nextByte();
			sc.nextLine();
			switch (opcion) {
			case 1:
				// 1.Crear Floristeria.
				floristeria = crearFloristeria(gestion);
				break;
			case 2:
				// 2.Afegir Arbre.
				if (floristeria != null) {
					afegirArbre(gestion, floristeria);
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 3:
				// 3.Afegir Flor.
				if (floristeria != null) {
					afegirFlor(gestion, floristeria);
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 4:
				// 4.Afegir Decoració.
				if (floristeria != null) {
					afegirDecoracio(gestion, floristeria);
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 5:
				// Stock: Imprimeix per pantalla tots els arbres, flors i decoració
				// que té la floristeria.
				// 5.Stock
				if (floristeria != null) {
					imprimirStock();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 6:
				// 6.Retirar arbre.
				if (floristeria != null) {
					retirarArbre();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 7:
				// 7.Retirar flor.
				if (floristeria != null) {
					retirarFlor();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 8:
				// 8.Retirar decoració.
				if (floristeria != null) {
					retirarDecoracio();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 9:
				// Printar per pantalla stock amb quantitats.
				// 9.Stock Amb Quantitats
				if (floristeria != null) {
					imprimirStockQuantitats();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 10:
				// Printar per pantalla valor total de la floristeria.
				// 10.Valor Stock // Valor Compres // ValorVendes
				if (floristeria != null) {
					imprimirValorStock();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 11:
				// Crear tickets de compra amb múltiples objectes.
				// 11.Compra amb múltiples objectes
				if (floristeria != null) {
					crearTicket(gestion);
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 12:
				// Mostrar una llista de compres antigues.
				// 12.Compres Antigues.
				if (floristeria != null) {
					mostrarTickets();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
			case 13:
				// Visualitzar el total de diners guanyats amb totes les vendes.*/
				// 13.diners guanyats
				// Vendes
				if (floristeria != null) {
					visualitzarTotalTickets();
				} else {
					System.out.println(" no hi ha floristeria!!!");
				}
				break;
//			case 14:
//				// 14.Obrir Floristeria.
//				obrirFloristeria();
//				break;
			case 0:
				onProgram = false;
				System.out.println("      Fin de programe.");
				break;

			default:
				break;
			}
		}

	}

	private static void afegirArbre(Gestion gestion, Floristeria floristeria) {
		System.out.println(" Alçada arbre ");
		double alcada = sc.nextDouble();
		System.out.println(" Preu arbre: ");
		double preu = sc.nextDouble();
		Arbre arbre = new Arbre(preu, alcada);
		gestion.afegirArbre(arbre, floristeria);

	}

	private static void afegirFlor(Gestion gestion, Floristeria floristeria) {

		System.out.println(" Color flor: ");
		String color = sc.nextLine();
		System.out.println(" Preu flor: ");
		double preu = sc.nextDouble();
		Flor flor = new Flor(preu, color);
		gestion.afegirFlor(flor, floristeria);

	}

	private static void afegirDecoracio(Gestion gestion, Floristeria floristeria) {
		System.out.println(" Material decoracio: ");
		System.out.println("1. Fusta, 2. Plastic");
		Material material = (sc.nextByte() == 1) ? Material.FUSTA : Material.PLASTIC;
		System.out.println(" Preu decoracio: ");
		double preu = sc.nextDouble();
		Decoracio decoracio = new Decoracio(preu, material);
		gestion.afegirDecoracio(decoracio, floristeria);

	}

	private static void visualitzarTotalTickets() {
		// TODO Auto-generated method stub

	}

	private static void mostrarTickets() {
		// TODO Auto-generated method stub

	}

	private static void crearTicket(Gestion gestion) {
		Ticket ticket = gestion.crearTicket();
		boolean finTicket = false;
		byte opcion;

		while (!finTicket) {
			System.out.println("1. Afegir arbre");
			System.out.println("2. Afegir flor");
			System.out.println("3. Afegir decoracio");
			System.out.println("0. Finalitzar ticket");
			opcion = sc.nextByte();

			switch (opcion) {
			case 1:
				// preparar arbre
				gestion.afegirProducte(new Arbre(), ticket);
				break;
			case 2:
				gestion.afegirProducte(new Flor(), ticket);
				break;
			case 3:
				gestion.afegirProducte(new Decoracio(), ticket);
				break;
			case 0:
				finTicket = true;
				break;
			default:
				break;
			}

		}

	}

	private static void imprimirValorStock() {
		// TODO Auto-generated method stub

	}

	private static void imprimirStockQuantitats() {
		// TODO Auto-generated method stub

	}

	private static void retirarDecoracio() {
		// TODO Auto-generated method stub

	}

	private static void retirarFlor() {
		// TODO Auto-generated method stub

	}

	private static void retirarArbre() {
		// TODO Auto-generated method stub

	}

	private static void imprimirStock() {
		// TODO Auto-generated method stub

	}

	private static Floristeria crearFloristeria(Gestion gestion) {
		System.out.println("Crear Floristeria.\n");
		System.out.println("nom : ");
		String nom = sc.nextLine();
		Long index = 1L; // generar index
		// Crear i recuperar Floristeria
		return gestion.crearFloristeria(index, nom);

	}

}
