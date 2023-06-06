package reto11;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Este programa implementa un cuestionario sobre el Vaticano, donde se pueden elegir varias categorías.
	Permite al usuario responder preguntas sobre arquitectura, historia, religión y arte del Vaticano.
	También incluye una opción para preguntas mixtas que combina todas las categorías.
	El programa registra las preguntas falladas y muestra los resultados al final del cuestionario.
 * @author Izeta
 *
 */

public class SubQuizPoo extends SuperClase {

	/**
	 *  El método principal que inicia el programa.
	 * @param args
	 */
	
	Scanner sc;
	ArrayList<String[]> preguntasFalladas;
	
	final int NUMERO_CATEGORIAS = 4;
	int acertadas;
	int cantidadPreguntas; // Cantidad de preguntas que se hacen al usuario (Se puede cambiar la cantidad de preguntas que se le hace)
	int categoriaElegida; // Sirve para hacer preguntas sobre una categoria en concreto (se le va a preguntar al usuario)
	char repetir; // Validacion (S/N) para preguntas al usuario si quiere repetir el programa

	
	String[][] preguntasArquitectura; 
	String[][] preguntasHistoria; 
	String[][] preguntasReligion; 
	String[][] preguntasArte; 
	String[][] preguntasMixtas; 

	String[][] preguntasCategoria = null; // Array para obtimizar el switch para escoger categoria.
	String[][][] arrayPreguntas;
	
	
	public SubQuizPoo()
	{
		this.sc = new Scanner(System.in);
		this.preguntasFalladas = new ArrayList<String[]>();
		
		this.acertadas = 0;
		this.cantidadPreguntas = 5; // Cantidad de preguntas que se hacen al usuario (Se puede cambiar la cantidad de preguntas que se le hace)
		
		this.preguntasArquitectura = new String[][] 
				{{"¿Cuántas capillas hay en la Basílica de San Pedro?", "45"}, 
			{"¿Quién fue el arquitecto principal del Palacio Apostólico?", "Donato Bramante"},
			{"¿Cómo se llama la torre del Reloj en la Basílica de San Pedro?", "Torre dei Venti"},
			{"¿Cuál es el nombre de la plaza en el centro del Vaticano?", "Plaza de San Pedro"},
			{"¿Qué arquitecto diseñó la Piazza del Campidoglio en Roma?", "Miguel Angel"},
			{"¿Cuál es el nombre de la entrada principal del Vaticano?", "Puerta de Bronce"},
			{"¿Cómo se llama la capilla que se encuentra dentro del Palacio Apostólico?", "Capilla Sixtina"},
			{"¿Cuántas estatuas hay en la cima de la fachada de la Basílica de San Pedro?", "13"},
			{"¿La Basílica de San Pedro es la iglesia más grande del mundo?", "Si"},
			{"¿El Vaticano es un territorio completamente autónomo sin ningún tipo de relación con Italia?", "No"}};

		this.preguntasHistoria = new String[][] 
			{{"¿Es el Vaticano el estado independiente más pequeño del mundo?", "Si"}, 
			{"¿Cuál fue el año de la fundación del Estado de la Ciudad del Vaticano?", "1929"},
			{"¿Quién fue el primer Papa de la Igelsia Católica?", "San Pedro"},
			{"¿Es el Papa Francisco el primer Papa latinoamericano?", "Si"},
			{"¿El Vaticano ha sido atacado militarmente en su historia?", "No"},
			{"¿Cómo se llama el Papa actual?", "Francisco"},
			{"¿El Vaticano alberga una de las colecciones de arte más importantes del mundo?", "Si"},
			{"¿El Vaticano ha tenido un Papa de nacionalidad africana?", "No"},
			{"¿El Vaticano ha sufrido daños significativos durante la Segunda Guerra Mundial?", "No"},
			{"¿El Vaticano ha sido gobernado por una reina en su historia?", "No"}};

		this.preguntasReligion = new String[][] 
				{{"¿Es el Papa el líder espiritual de la Iglesia Católica?", "Si"}, 
				{"¿Cómo se le llama al proceso mediante el cual se elige el a un nuevo Papa?", "Cónclave"},
				{"¿El Vaticano considera el aborto como un pecado?", "Si"},
				{"¿El Vaticano ha emitido encíclicas papales sobre temas sociales y medioambientales?", "Si"},
				{"¿El Vaticano permite el matrimonio entre personas del mismo sexo?", "No"},
				{"¿La Iglesia Católica reconoce la ordenación de mujeres como sacerdotisas?", "No"},
				{"¿El Vaticano apoya la práctica de la eutanasia?", "No"},
				{"¿La Iglesia Católica aprueba la práctica de la poligamia?", "No"},
				{"¿En qué año tuvo lugar la coronación del Papa Francisco como el 266º Papa de la Iglesia Católica?", "2013"},
				{"¿En qué año fue canonizado el Papa Juan Pablo II?", "2014"}};

		this.preguntasArte = new String[][] 
				{{"¿La Pietà de Miguel Ángel es una de las obras maestras que se exhiben en los Museos del Vaticano?", "RESPUESTA UNO"}, 
				{"¿Quién pintó el techo de la Capilla Sixtina?", "Miguel Ángel"},
				{"¿La Pietà de Miguel Ángel se encuentra en la Basílica de San Pedro?", "Si"},
				{"¿El Vaticano alberga la famosa escultura conocida como \"Apolo del Belvedere\"?", "Si"},
				{"¿En qué siglo se construyó la Basílica de San Pedro en el Vaticano?", "XVI"},
				{"¿Cuándo se inauguró el Museo Gregoriano Egipcio en el Vaticano?", "1839"},
				{"¿La Biblioteca Apostólica Vaticana alberga la famosa \"Virgen con el Niño\" de Leonardo da Vinci?", "No"},
				{"¿El fresco \"La Última Cena\" de Leonardo da Vinci se encuentra en el Vaticano?", "No"},
				{"¿En qué año se inauguró la Pinacoteca Vaticana, el museo de pintura del Vaticano?", "1932"},
				{"¿El Vaticano alberga una escultura famosa llamada \"Venus de Milo\"?", "No"}};
	}
	
	/**

    Método para iniciar el quiz.
    Imprime un mensaje de bienvenida a la sección del Quiz.
    Genera un array de preguntas mixtas a partir de las categorías existentes.
    Permite al usuario jugar múltiples rondas del Quiz.
    Al finalizar cada ronda, muestra la cantidad de preguntas acertadas y las preguntas falladas.
    Pregunta al usuario si desea repetir o volver al menú principal.
    */
	
	public void iniciar()
	{
		System.out.println("Bienvenido a la seccion del Quiz!");
		
		arrayPreguntas = new String[][][] {preguntasArquitectura, preguntasHistoria, preguntasReligion, preguntasArte};

		preguntasMixtas = generarPreguntasMixtas(arrayPreguntas);
	    
		do
		{
			preguntasFalladas.clear();
					
			categoriaElegida = escogerCategoria(NUMERO_CATEGORIAS);

			switch (categoriaElegida) {
			case 1:
				preguntasCategoria = preguntasArquitectura;
				break;
			case 2: 
				preguntasCategoria = preguntasHistoria;
				break;
			case 3: 
				preguntasCategoria = preguntasReligion;
				break;
			case 4: 
				preguntasCategoria = preguntasArte;
				break;
			case 5:
				preguntasCategoria = preguntasMixtas;
				break;
			}
			
			acertadas = hacerPreguntas(preguntasCategoria, cantidadPreguntas, preguntasFalladas);

			System.out.println("---------------------------");

			System.out.println("Has acertado " + acertadas + " preguntas de " + cantidadPreguntas);

			imprimirFallados(preguntasFalladas);

			repetir = repetirPrograma("¿Quieres repetir el cuestonario? (s/n)");
		
			
		} while (repetir == 's');
		
	}


	public int escogerCategoria(int maximoCategorias)
	{
		int numeroCategoria;

		do 
		{
			System.out.println("Escoja la categoria de las preguntas");
			System.out.println("1. Arquitectura");
			System.out.println("2. Historia");
			System.out.println("3. Religion");
			System.out.println("4. Arte");
			System.out.println("5. Mixto");
			System.out.print("Inserte la categoria: ");

			numeroCategoria = pedirNumValidado(maximoCategorias+1);
					
			System.out.println();
		} while (numeroCategoria < 1 || (numeroCategoria-1) > maximoCategorias);

		return numeroCategoria;
	}
	
	  /**
     * Genera un número aleatorio dentro de un rango determinado.
     *
     * @param maximo El valor máximo del rango.
     * @return El número aleatorio generado.
     */

	public int generarNumeroAleatorio(int maximo)
	{
		return (int)(Math.random() * (maximo+1));
	}
	
	   /**
     * Realiza preguntas al usuario basadas en un conjunto de preguntas y almacena las preguntas falladas.
     *
     * @param arrayPreguntas     El conjunto de preguntas.
     * @param numeroPreguntas    El número de preguntas a realizar.
     * @param preguntasFalladas  La lista de preguntas falladas.
     * @return El número de preguntas acertadas.
     */

	public int hacerPreguntas(String[][] arrayPreguntas, int numeroPreguntas, ArrayList<String[]> preguntasFalladas)
	{		
		ArrayList<Integer> preguntasHechas = new ArrayList<Integer>();

		final int CANTIDAD_PREGUNTAS = numeroPreguntas;
		int acertadas = 0;
		int indice;
		int aleatorio;
		String respueta;

		for (int i = 0; i<CANTIDAD_PREGUNTAS; i++)
		{
			indice = (i+1);

			do
			{
				aleatorio = generarNumeroAleatorio(arrayPreguntas.length-1);				
			} while (preguntasHechas.contains(aleatorio));

			System.out.println(" -------- PREGUNTA " + indice + " -------- ");

			System.out.println();
			System.out.print(arrayPreguntas[aleatorio][0] + ": ");

			preguntasHechas.add(aleatorio); 

			respueta = sc.nextLine();

			System.out.println();

			if (respueta.equalsIgnoreCase(arrayPreguntas[aleatorio][1]))
			{
				acertadas++;
			} else 
			{
				String[] fallo = {arrayPreguntas[aleatorio][0], arrayPreguntas[aleatorio][1]};
				preguntasFalladas.add(fallo);
			}

		}
		return acertadas;
	}
	
	 /**
     * Imprime las preguntas falladas.
     *
     * @param preguntasFalladas La lista de preguntas falladas.
     */

	public void imprimirFallados(ArrayList<String[]> preguntasFalladas)
	{
		System.out.println("Estas son las preguntas que has fallado: ");
		System.out.println();

		for (int i = 0; i < preguntasFalladas.size(); i++) {

			String[] arrayPregunta = preguntasFalladas.get(i);

			for (int j = 0; j < arrayPregunta.length; j++) {
				if (j%2==0)
				{
					System.out.print(arrayPregunta[j] + " ");					
				} else 
				{
					System.out.println(arrayPregunta[j]);	
				}
			}

		}
	}
	
	 /**
     * Genera un conjunto de preguntas mixtas seleccionadas aleatoriamente de diferentes categorías.
     *
     * @param arrayPreguntas El conjunto de preguntas por categoría.
     * @return Las preguntas mixtas generadas.
     */
	
	public String[][] generarPreguntasMixtas(String[][][] arrayPreguntas) {
	    int cantidadCategorias = arrayPreguntas.length;
	    int cantidadPreguntas = arrayPreguntas[0].length;
	    int totalPreguntas = cantidadCategorias * cantidadPreguntas;

	    int numeroAleatorioArray, numeroAleatorioIndex;

	    String[][] preguntasMixtas = new String[totalPreguntas][2];

	    for (int i = 0; i < totalPreguntas; i++) {
	        numeroAleatorioArray = generarNumeroAleatorio(cantidadCategorias - 1);
	        numeroAleatorioIndex = generarNumeroAleatorio(cantidadPreguntas - 1);

	        preguntasMixtas[i] = arrayPreguntas[numeroAleatorioArray][numeroAleatorioIndex];
	    }

	    return preguntasMixtas;
	}
}
