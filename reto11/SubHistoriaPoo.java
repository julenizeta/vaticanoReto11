package reto11;

/**
 * Esta clase representa una subhistoria de la asignatura de Historia.
 * Hereda de la clase SuperClase.
 */
public class SubHistoriaPoo extends SuperClase {

	private String[] opciones = {"Siglo I d.c a 41 d.c", "Años 326-1377", "Años 1870-1878", "Año 1929", "Año 1939-1935", "Despues de 1945", "Hoy en dia"};

	private String[] sigloI_41 = {"	Durante la República Romana, el nombre \"Vaticano\" se refería al Ager Vaticanus, una zona con una pequeña ",
			"	colina y una llanura en la orilla oeste del río Tíber. Este barrio estaba en gran parte deshabitado debido a su ",
			"	proximidad a la ciudad etrusca de Veii, así como a las crecidas del Tíber que desembocaban en la ciudad. ",
			"	Después del siglo I, se empezó a utilizar el nombre de Vaticanus, que hace referencia a la zona que incluye la colina ",
			"	del Vaticano, la actual plaza de San Pedro y posiblemente la actual Via della Conciliazione. ",
			"",
			"	Entre el 14 a.C. y el 33 d.C., Agripina la Vieja mandó desecar la zona pantanosa donde se instalaron jardines. ",
			"	Su hijo, el emperador Calígula, construyó en este jardín un circo para cuádrigas. El obelisco que se encuentra en la ",
			"	plaza de San Pedro fue llevado por Calígula desde Egipto para decorarlo. La obra fue completada por Nerón y este lugar ",
			"	llegó a ser conocido como el Circo de Nerón. La zona se convirtió en lugar de martirio para muchos cristianos, ",
			"	incluido San Pedro, según las antiguas tradiciones."};


	private String[] A326_1377 = {"	La Basílica Constantina se construyó en el año 326 sobre lo que se creía que era la tumba de San Pedro. ",
			"	En el siglo V se construyó un palacio durante el papado de Simmaco. Entre el 318 y el 322 se inició la construcción de ",
			"	la primera iglesia, la Basílica de San Pedro Viejo.",
			"",
			"	Con el tiempo, los Papas comenzaron a gobernar las regiones vecinas y, hasta mediados del siglo XIX, gobernaron una gran ",
			"	parte de la península italiana que llegó a denominarse Estados Pontificios. Durante este tiempo, los Papas vivieron ",
			"	en el Palacio de Letrán y, más tarde, en el Palacio del Quirinal. Entre 1309 y 1377, la residencia papal estuvo en Aviñón,",
	"	Francia."};

	private String[] A1870_1878 = {"	En 1870, los diferentes estados de la península italiana se unificaron bajo el poder del Rey Víctor Manuel II. ",
			"	Esto también marcó un periodo de incertidumbre sobre las posesiones del Papa. Este periodo de incertidumbre entre 1861 y",
			"	1929 sobre el estatus del Papa fue conocido como la cuestión Romana.",
			"",
			"	Aunque Italia no interfirió con la Santa Sede dentro del Vaticano, confiscó propiedades de la Iglesia en muchos otros ",
			"	lugares, incluido el Palacio del Quirinal, antigua residencia oficial del Papa. Los papas comenzaron a residir dentro ",
			"	de los muros del Vaticano. Ciertas prerrogativas papales fueron reconocidas por la Ley de Garantías, incluyendo el ",
			"	derecho a enviar y recibir embajadores. Pero los Papas no reconocieron el derecho del rey italiano a gobernar en Roma, ",
			"	y se negaron a abandonar el recinto vaticano hasta que se resolvió la disputa en 1929. El Papa Pío IX (1846-1878), ",
			"	último gobernante de los Estados Pontificios, fue calificado de \"prisionero en el Vaticano\". Obligados a abandonar ",
	"	el poder secular, los papas se dedicaron exclusivamente a las cuestiones espirituales."};

	private String[] A1929 = {"	Las negociaciones para la solución de la cuestión Romana comenzaron en 1926 entre el gobierno de Italia y ",
			"	la Santa Sede y culminaron con los Pactos de Letrán. El acuerdo fue firmado por el Primer Ministro Benito Mussolini ",
			"	en nombre del Rey Víctor Manuel III de Italia y por el Cardenal Secretario de Estado Pietro Gasparri en nombre del ",
			"	Papa Pío XI el 11 de febrero de 1929 y fue ratificado el 7 de junio de 1929.",
			"",
			"	El Tratado de Letrán resolvió la ambigüedad que había provocado el periodo de la cuestión Romana. El tratado estableció ",
			"	la Ciudad del Vaticano como un país independiente, otorgando así 44 hectáreas de tierra que ahora sería totalmente ",
			"	independientes y gobernadas por el Papa. El gobierno italiano también acordó dar a la Iglesia Católica Romana una ",
	"	compensación económica por la pérdida del Estado Pontificio."};

	private String[] A1939_1945 = {"	Durante la Segunda Guerra Mundial, la Ciudad del Vaticano, entonces bajo el liderazgo del Papa Pío XII, ",
			"	se mantuvo neutral. Mientras las tropas alemanas ocupaban la ciudad de Roma, la Ciudad del Vaticano no fue invadida. ",
			"	Las tripulaciones de los aviones, tanto de los aliados como del Eje, tenían órdenes de respetar la neutralidad de la ",
			"	Ciudad del Vaticano incluso cuando bombardeaban Roma. De hecho, eran tan exigentes con el mantenimiento de su estatus ",
			"	de neutralidad que el pontífice protestó incluso porque algunos panfletos de los muchos que los británicos lanzaron ",
			"	sobre Roma aterrizaron dentro de la ciudad-estado. La posición del Vaticano también condicionó las decisiones de las ",
			"	fuerzas aliadas. Tras la entrada de Estados Unidos en la guerra, se opuso a bombardear Roma e incluso eximió a los ",
			"	pilotos y tripulaciones católicas de los ataques aéreos sobre Roma y otras posesiones de la Iglesia, a menos que los ",
	"	quisieran hacer voluntariamente."};

	private String[] A1945 = {"	En 1946, Pío XII, quien no había nombrado cardenales durante la guerra, nombró a 32 de ellos para cubrir los ",
			"	numerosos puestos destacados que habían quedado vacantes. El Cuerpo Militar Pontificio, salvo la Guardia Suiza, ",
			"	se disolvió en 1970. El Cuerpo de Gendarmería se convirtió en policía civil y fuerzas de seguridad. En 1984, un nuevo ",
			"	concordato entre la Santa Sede e Italia modificó algunas disposiciones del tratado anterior, incluida la posición del ",
			"	cristianismo católico como religión del Estado italiano. En 1995, se pretendía construir una nueva casa de huéspedes, ",
			"	Domus Sanctae Marthae, junto a la Basílica de San Pedro pero plan fue criticado por grupos ecologistas italianos e ",
	"	incluso tensó las relaciones entre el Vaticano y el gobierno italiano."};

	private String[] hoy = {"	Hoy en día, con una diminuta población alrededor de 825 personas, la Ciudad del Vaticano es una monarquía absoluta.",
			"	Sede de algunas de las iglesias y museos más famosos del mundo, la Ciudad del Vaticano es sin duda un verdadero tesoro",
			"	cultural e histórico. La Basílica de San Pedro, una de las mayores iglesias del mundo, la mundialmente famosa Capilla",
	"	Sixtina y el Museo Vaticano son algunas de las maravillas que atraen a millones de visitantes a este pequeño paraíso."};

	
	private int cantidadOpciones;
	
	/**
	 * Constructor de la clase SubHistoriaPoo.
	 * Inicializa la cantidad de opciones disponibles.
	 */
	public SubHistoriaPoo() {
		this.cantidadOpciones = opciones.length;
	}
		
	/**
	 * Obtiene la cantidad de opciones disponibles.
	 * 
	 * @return La cantidad de opciones disponibles.
	 */
	public int getCantidadOpciones() {
		return this.cantidadOpciones;
	}
	
	/**
	 * Muestra las opciones disponibles para seleccionar información histórica.
	 */
	public void mostrarOpciones() {
		System.out.println("Bienvenido a la sección de historia!");
		System.out.println("Seleccione la información histórica que desea visualizar: ");
		
		for (int i = 0; i < opciones.length; i++) {
			System.out.println((i+1) + ". " + opciones[i]);
		}
	}

	/**
	 * Muestra la información histórica correspondiente a la opción seleccionada.
	 * 
	 * @param opcion La opción seleccionada.
	 */
	public void mostrarInfo(int opcion) {
		switch(opcion) {
			case 1:
				for (int i = 0; i < sigloI_41.length; i++) {
					System.out.println(sigloI_41[i]);
				}
				break;
			case 2:
				for (int i = 0; i < A326_1377.length; i++) {
					System.out.println(A326_1377[i]);
				}
				break;
			case 3:
				for (int i = 0; i < A1870_1878.length; i++) {
					System.out.println(A1870_1878[i]);
				}
				break;
			case 4:
				for (int i = 0; i < A1929.length; i++) {
					System.out.println(A1929[i]);
				}
				break;
			case 5:
				for (int i = 0; i < A1939_1945.length; i++) {
					System.out.println(A1939_1945[i]);
				}
				break;
			case 6:
				for (int i = 0; i < A1945.length; i++) {
					System.out.println(A1945[i]);
				}
				break;
			case 7:
				for (int i = 0; i < hoy.length; i++) {
					System.out.println(hoy[i]);
				}
				break;
			default:
				System.out.println("Opción inválida.");
				break;
		}
	}

	/**
	 * Método principal para ejecutar el programa.
	 */
	public static void main(String[] args) {
		SubHistoriaPoo subHistoria = new SubHistoriaPoo();
		subHistoria.mostrarOpciones();
		int opcion = 1; // Supongamos que el usuario selecciona la opción 1
		subHistoria.mostrarInfo(opcion);
	}
}
