package reto11;

import java.util.Scanner;

/**
 * La clase SuperClase proporciona métodos comunes para la validación de números y la repetición del programa.
 */
public class SuperClase {

    Scanner sc = new Scanner(System.in);
    char repetir;

    /**
     * Solicita al usuario un número válido en el rango del 1 al máximo especificado.
     *
     * @param maximo el valor máximo permitido para el número.
     * @return el número válido ingresado por el usuario.
     */
    public int pedirNumValidado(int maximo) {

        int num;
        do {
            System.out.print("Introduce un número válido: ");
            num = sc.nextInt();
            if (num < 1 || num > maximo) { //CONDICION DE MAXIMO Y MINIMO
                System.out.println("El número no es válido, introduce uno del 1 al " + maximo + ".");
            }
        } while (num < 1 || num > maximo);
        return num;
    }

    /**
     * Solicita al usuario que indique si desea repetir el programa.
     *
     * @param mensaje el mensaje que se muestra al usuario para solicitar su respuesta.
     * @return 's' si el usuario elige repetir el programa, 'n' si el usuario elige no repetirlo.
     */
    public char repetirPrograma(String mensaje) {
        do {
            System.out.println(mensaje);
            sc.nextLine();
            repetir = sc.nextLine().toLowerCase().charAt(0);

            if (repetir != 's' && repetir != 'n') {
                System.out.println("Debes insertar 'S' o 'N', y has insertado " + repetir);
            }

        } while (repetir != 's' && repetir != 'n');

        return repetir;
    }

}
