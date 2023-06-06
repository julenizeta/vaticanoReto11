package reto11;

/**
 * Guia turistica de la Ciudad de Vaticano
 */

public class SubGuiaTuristicaPoo extends SuperClase {

	private String[] menu;

	/**
	 * Constructor de la clase SubGuiaTuristicaPoo.
	 * Inicializa el menú con las opciones disponibles.
	 */
	public SubGuiaTuristicaPoo() {
		menu = new String[4];
		menu[0] = "1. Transporte";
		menu[1] = "2. Gastronomia";
		menu[2] = "3. Hospedaje";
		menu[3] = "4. Monumentos";
	}

	/**
	 * Muestra el menú de la guía turística por pantalla.
	 */
	public void mostrarMenu() {
		System.out.println();
		System.out.println("---------------GUIA TURISTICA---------------");

		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
	}

	/**
	 * Muestra la información correspondiente a la opción seleccionada del menú.
	 * 
	 * @param opcion La opción seleccionada.
	 */
	public void infoSeleccionada(int opcion) {
		switch (opcion) {
			case 1:
				// Información sobre el transporte
				System.out.println("METRO // El precio del billete de metro es de 1,50€ // Horario de 5:30h a 23:30h ");
				System.out.println();
				System.out.println("PARADAS METRO CERCANAS //");
				System.out.println("- Parada de Cipro");
				System.out.println("- Parada de Ottaviano");
				System.out.println();
				System.out.println("BUS // El precio del billete de metro es de 1,50€ // Horario de 5:30h a 23:30h ");
				System.out.println();
				System.out.println("LINEAS BUS //");
				System.out.println("Bus 64: conecta la estación de Termini con la Ciudad del Vaticano, pasando por Piazza Venezia. Tendréis que bajaros en Ospedale Generale Santo Spirito.\r\n"
						+ "Bus 62: conecta  Repubblica, Plaza de España, Piazza Venezia… con El Vaticano. Tendréis que bajaros al final de via della conciliazione.\r\n"
						+ "Bus 40: es un autobús express que para en Termini, Piazza Venezia, Argentina, Piazza Pia (junto al Vaticano).\r\n"
						+ "Bus 81: conecta el Coliseo, el Circo Massimo, Piazza Venezia, Piazza Colonna, Piazza Imperatore… con el Vaticano. Tendréis que bajar en Piazza Risorgimento");
				break;
			case 2:
				// Información sobre la gastronomía
				System.out.println("Estos son los platos tradicionales de Italia:");
				System.out.println();
				System.out.println("1 – Spaghetti alla carbonara");
				System.out.println();
				System.out.println("2 – Lasagna");		
				System.out.println();
				System.out.println("3 – Pizza Margherita");
				System.out.println();
				System.out.println("4 – Tagliatelle al ragù bolognese");
				System.out.println();
				System.out.println("5 – Risotto alla milanese");
				System.out.println();
				System.out.println("6 – Gelato");
				break;
			case 3:
				// Información sobre el hospedaje
				System.out.println("En el país de Ciudad de Vaticano no hay hoteles pero estos son los mejores hoteles por los alrededores:");
				System.out.println();
				System.out.println("1. Al Ponte Del Papa B&B (Via Aurelia, 62, Vaticano Prati, 00165 Roma, Italia)");
				System.out.println("2. Growel Exclusive Suites San Pietro (Via Ottaviano n°6 piano 2, Vaticano Prati, 00192 Roma, Italia)");
				System.out.println("3. Folia (Via Ottaviano, Vaticano Prati, 00192 Roma, Italia)");
				System.out.println("4. La Porta Rossa di Borgo (Via Cardinal Agliardi 16, Vaticano Prati, 00165 Roma, Italia)");
				System.out.println("5. Cameo B&B (Piazza del Risorgimento, 55, Vaticano Prati, 00192 Roma, Italia)");
				break;
			case 4:
				// Información sobre los monumentos
				System.out.println("Estos son los monumentos mas relevantes de Vaticano: ");
				System.out.println();
				System.out.println("1.La Plaza de San Pedro");
				System.out.println();
				System.out.println("2.La Basílica de San Pedro");
				System.out.println();
				System.out.println("3.La Capilla Sixtina");
				System.out.println();
				System.out.println("4.Los doce Museos del Vaticano");
				System.out.println();
				System.out.println("4.Los doce Museos del Vaticano");
				break;
		}
	}
}
