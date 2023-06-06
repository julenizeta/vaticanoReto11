package reto11;
/**
 * Calendario de eventos anual de la Ciudad de Vaticano
 */

public class SubCalendarioPoo extends SuperClase {
	
	/**
     * Arreglos de eventos para cada mes del año.
     */
	
	private String enero[][];
	private String febrero[][];
	private String marzo[][];
	private String abril[][];
	private String mayo[][];
	private String junio[][];
	private String julio[][];
	private String agosto[][];
	private String septiembre[][];
	private String octubre[][];
	private String noviembre[][];
	private String diciembre[][];

	
	/**
     * Arreglo de nombres de los meses.
     */
	private String meses[];
	 /**
     * Constructor de la clase SubCalendarioPoo.
     * Inicializa los arreglos de eventos para cada mes y el arreglo de nombres de los meses.
     */
	public SubCalendarioPoo() {
	    meses = new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
	    };
	 // Inicialización de los arreglos de eventos para cada mes

	    enero = new String[][] {
	        {"Dia 3", "Santa Misa en la iglesia del Gesu"},
	        {"Dia 8", "Audiencia General"},
	        {"Dia 12", "Los cardenales que seran creados en el Consistorio"},
	        {"Dia 17", "Meditaciones diarias"},
	        {"Dia 19", "Visita pastoral a la parroquia romana"},
	        {"Dia 23", "Corazones libres de envidias y celos"},
	        {"Dia 28", "La oracion de la alabanza"}
	    };

	    febrero = new String[][] {
	        {"Dia 2", "Carta a las familias"},
	        {"Dia 4", "Cuando Dios llora"},
	        {"Dia 8", "A los peregrinos de Sri Lanka"},
	        {"Dia 10", "En misa sin reloj"},
	        {"Dia 17", "Santa paciencia"},
	        {"Dia 20", "Consistorio extraordinario"},
	        {"Dia 23", "Santa misa de los nuevos cardenales"}
	    };

	    marzo = new String[][] {
	        {"Dia 3", "A los participantes en la Asamblea de la Federacion Italiana de Ejercicios Espirituales"},
	        {"Dia 6", "Meditaciones diarias. El estilo Cristiano"},
	        {"Dia 7", "El fantasma de la hipocresia"},
	        {"Dia 14", "Discurso al final de los ejercicios espirituales"},
	        {"Dia 16", "Visita pastoral a la parroquia romana de Santa Maria de la Oracion"},
	        {"Dia 20", "Encuentro con la fundacion Libera de Don Luigi Ciotti"},
	        {"Dia 28", "Celebracion penitencial"}
	    };

	    abril = new String[][] {
	        {"Dia 1", "Mas alla de los normalismos"},
	        {"Dia 4", "Donde esta prohibido rezar"},
	        {"Dia 7", "El perdon de la caricia"},
	        {"Dia 10", "La dictadura del pensamiento"},
	        {"Dia 11", "Al movimiento por la Vida italiano"},
	        {"Dia 16", "Audiencia general"},
	        {"Dia 19", "Vigilia pascual"},
	        {"Dia 25", "Mensaje a los bergamascos con motivo de la canonizacion del beato Juan Pablo XXIII"},
	        {"Dia 29", "La comunidad cristiana en tres pinceladas"}
	    };

	    mayo = new String[][] {
	        {"Dia 2", "Hoy tambien se mata en nombre de Dios"},
	        {"Dia 6", "El testimonio del cristiano"},
	        {"Dia 8", "Nada de burocracia en la sacristia"},
	        {"Dia 10", "Palabras del Santo Padre a los participantes en el encuentro organizado por la conferencia Italiana de los Institutos Seculares"},
	        {"Dia 15", "Entre memoria y esperanza"},
	        {"Dia 22", "La obra de Jesus"},
	        {"Dia 26", "Visita al memorial de Yad Vashem"}
	    };

	    junio = new String[][] {
	        {"Dia 2", "Tres amores para un matrimonio"},
	        {"Dia 6", "El primer amor jamas se olvida"},
	        {"Dia 8", "Oracion por la paz"},
	        {"Dia 13", "Una brisa suave"},
	        {"Dia 16", "Cuando pagan los pobres"},
	        {"Dia 23", "Nadie puede juzgar"},
	        {"Dia 30", "Martirio de guante blanco"}
	    };

	    julio = new String[][] {
	        {"Dia 7", "Santa Misa en la Capilla de la Casa Santa Marta con algunas victimas de abusos sexuales por parte del Clero"},
	        {"Dia 26", "Encuentro con los sacerdotes de la diocesis"},
	        {"Dia 27", "Angelus"}
	    };

	    agosto = new String[][] {
	        {"Dia 1", "A los deportistas y a los organizadores del partido de futbol por la paz"},
	        {"Dia 4", "¿Por que gloriarse de los pecados?"},
	        {"Dia 8", "Pequeña y santa"},
	        {"Dia 11", "Esos cristianos necios"},
	        {"Dia 13", "Santa misa en el monumento militar de Redipuglia"},
	        {"Dia 18", "El perfume de la pecadora"},
	        {"Dia 11", "Esos cristianos necios"},
	        {"Dia 25", "He deshojado la cebolla"}
	    };

	    septiembre = new String[][] {
	        {"Dia 3", "Salvados a nuestro modo"},
	        {"Dia 10", "Corazones relevantes"},
	        {"Dia 15", "Mensajes a los obispos de Avila"},
	        {"Dia 17", "Al inicio del cielo"},
	        {"Dia 24", "La piedra y los ladrillos"},
	        {"Dia 28", "Catolicos pero no demasiado"}
	    };

	    octubre = new String[][] {
	        {"Dia 3", "La alegria de un obispo"},
	        {"Dia 6", "Dios va siempre al limite"},
	        {"Dia 10", "Cristianos escandalosos"},
	        {"Dia 13", "En el reino de Dios con un euro"},
	        {"Dia 18", "¿No estoy vivo por dentro?"},
	        {"Dia 23", "Ceremonia de Canonizacion de seis beatos"}
	    };

	    noviembre = new String[][] {
	        {"Dia 3", "Jornada mundial del enfermo"},
	        {"Dia 11", "La cancion de cuna de Dios"},
	        {"Dia 15", "Corazones tenebrosos"},
	        {"Dia 21", "Carta del Santo Padre a los cristianos de Oriente"},
	        {"Dia 30", "Mensaje del Santo Padre"}
	    };

	    diciembre = new String[][] {
	        {"Dia 4", "Sin maquillaje sobre la roca"},
	        {"Dia 7", "Iluminacion del arbol de navidad de Gubbio"},
	        {"Dia 9", "Salir para dar vida"},
	        {"Dia 16", "Los que iran en primer lugar"},
	        {"Dia 20", "A los miembros de asociacion Comunidad"},
	        {"Dia 24", "Misa en la Solemnidad de la Navidad"},
	        {"Dia 31", "Celebracion de las Visperas y Te Deum de accion de gracias"}
	    };
	}
	
	/**
     * Muestra las opciones disponibles al usuario y solicita que elija un número de mes.
     */

	public void mostrarOpciones() {

		int numeroMes;

		System.out.println("Bienvenido al calendario de eventos de la Ciudad del Vaticano! ");
		System.out.println("Elige un número de mes:");

		for (int i=0; i<meses.length; i++) {
			System.out.println((i+1) + ". " + meses[i]);
		}

		numeroMes = pedirNumValidado(meses.length);

		mostrarCalendario(numeroMes);		
	}

	/**
     * Muestra el calendario de eventos para el mes seleccionado.
     * @param opcion El número de mes seleccionado.
     */

	public void mostrarCalendario(int opcion) {


		switch(opcion){

		case 1:

			imprimirMes(enero);

			break;

		case 2:

			imprimirMes(febrero);

			break;

		case 3:

			imprimirMes(marzo);

			break;

		case 4:

			imprimirMes(abril);

			break;

		case 5:

			imprimirMes(mayo);

			break;

		case 6:

			imprimirMes(junio);

			break;

		case 7:

			imprimirMes(julio);

			break;

		case 8:

			imprimirMes(agosto);

			break;

		case 9:

			imprimirMes(septiembre);

			break;

		case 10:

			imprimirMes(octubre);

			break;

		case 11:

			imprimirMes(noviembre);

			break;

		case 12:

			imprimirMes(diciembre);

			break;
		}
	}

	/**
     * Imprime los eventos de un mes.
     * @param mes La matriz de eventos para el mes.
     */
	public void imprimirMes(String[][] mes) {
		for (int i= 0; i<mes.length ;i++) {
			for(int j=0; j<mes[i].length; j++) {

				if (j==0)
				{
					System.out.print(mes[i][j]+": ");

				} else

				{

					System.out.println(mes[i][j]);

				}

			}

		}

	}




}

	

