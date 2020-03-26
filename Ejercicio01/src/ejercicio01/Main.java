package ejercicio01;

import java.util.Scanner;

import ejercicio01.entity.Persona;

/* El enunciado del ejercicio deja bastante que desear pero 
 * creo que lo mejor será que separes el método main de la entidad/objeto a manipular
 * (en este caso Persoa).
 * Entiendo que lo que quiere es que se le asigne el nombre a la persona con lo que teclee el usuario
 * y luego con el metodo consultaNome lo muestres por pantalla
 */
public class Main {

    public static void main(String[] args) {

    	//Variables siempre siempre camel case.
        Persona novaPersoa = new Persona();
        
        // Try with resources java
        try (Scanner entradaNome = new Scanner(System.in)) {
			System.out.printf("Introduce o nome da persoa: ");
			String nom = entradaNome.nextLine();

			// Se le asigna el nombre a la instancia de Persona.
			novaPersoa.cambiaNome(nom);
		}
        // Se consulta el nombre de la persona instanciada
        System.out.printf("Nome: " + novaPersoa.consultaNome());
        
        /*
         * Un apunte que no tuvimos en cuenta la semana pasada:
         * Cuando instanciamos la clase Scanner se abre un InputStreamReader, o lo que es lo mismo
         * un flujo de datos de entrada. Siempre que abrimos un flujo de datos de entrada debemos cerrarlo en 
         * cuando acabemos de realizar las operaciones.
         * 
         * En estos casos como después de que pidas el nombre se finaliza la aplicación ya se cierra automaticamente
         * el flujo de datos, pero imaginate que no se acabase. Por ejemplo:
         * 
         * metodo 'a' abre un InputStream
         * dentro del metodo 'a' se llama a un metodo 'b' el cual instancia otra vez Scanner abriendo otro InputStream
         * sin haber cerrado el otro previamente. En el mejor de los casos tendremos un 'memory leak' que en algun momento puede hacer
         * petar la aplicación por memoria.
         * 
         * En el peor de los casos tenemos si hay dos InputStreams queriendo acceder a un mismo fichero, tendremos 
         * una operación de lectura/escritura que bloquee el programa.
         * 
         * Para evitar esto se hace un 'try with resources' (Java 7+) que lo que hace es cerrarte el input 
         * cuando se acaban de realizar las operaciones en el bloque. 
         * Si no quieres hacerlo así puedes llamar manualmente al método close de Scanner.
         */
       
    }

}