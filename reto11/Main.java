package reto11;

/**
 * Esta es la clase principal, donde se crean los objetos y se ejecutan pidiendole al usuario.
 */

public class Main  {

	public static void main(String[] Args) {

		int opcion;
		int cantidadOpcionesHistoria;
		int pedirNumeroPrograma;
		char repetir; 

		SuperClase Menu = new SuperClase();
		SubGuiaTuristicaPoo Guia = new SubGuiaTuristicaPoo();
		SubHistoriaPoo Historia = new SubHistoriaPoo();
		SubCalendarioPoo Calendario = new SubCalendarioPoo();
		SubQuizPoo Cuestionario = new SubQuizPoo();

		System.out.println("Bienvenido al programa de la Ciudad del Vaticano!");

		do 
		{
			System.out.println("Elija un numero asociado al programa:");
			System.out.println("1. Guia turistica");
			System.out.println("2. Historia");
			System.out.println("3. Calendario de eventos");
			System.out.println("4. Cuestionario");

			pedirNumeroPrograma = Menu.pedirNumValidado(4);
			
			switch (pedirNumeroPrograma)
			{
			case 1:
				//PROGRAMA GUIA TURISTICA
				Guia.mostrarMenu();
				opcion = Guia.pedirNumValidado(4);
				Guia.infoSeleccionada(opcion);
				
				break;
			case 2:
				//PROGRAMA HISTORIA VATICANO
				Historia.mostrarOpciones();
				cantidadOpcionesHistoria = Historia.getCantidadOpciones();
				opcion = Historia.pedirNumValidado(cantidadOpcionesHistoria);
				Historia.mostrarInfo(opcion);
				
				break;
			case 3: 
				//PROGRAMA CALENDARIO
				Calendario.mostrarOpciones();
				break;
				
			case 4: 
				// PROGRAMA QUIZ
				Cuestionario.iniciar();
				break;
			}			
			
			System.out.println("--------------------------------");

			repetir = Menu.repetirPrograma("¿Quieres abrir otro programa? (s/n)");

		} while(repetir == 's');

		System.out.println("Adios. Nos vemos.");
		System.exit(0);
	}	
}
