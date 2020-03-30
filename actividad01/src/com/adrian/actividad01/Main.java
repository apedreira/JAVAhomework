package com.adrian.actividad01;

import java.util.Scanner;

import com.adrian.actividad01.entity.Persona;

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
         * En estos casos como despues de que pidas el nombre se finaliza la aplicacion ya se cierra automaticamente
         * el flujo de datos, pero imaginate que no se acabase. Por ejemplo:
         * 
         * metodo 'a' abre un InputStream
         * dentro del metodo 'a' se llama a un metodo 'b' el cual instancia otra vez Scanner abriendo otro InputStream
         * sin haber cerrado el otro previamente. En el mejor de los casos tendremos un 'memory leak' que en algun momento puede hacer
         * petar la aplicacion por memoria.
         * 
         * En el peor de los casos tenemos si hay dos InputStreams queriendo acceder a un mismo fichero, tendremos 
         * una operacion de lectura/escritura que bloquee el programa.
         * 
         * Para evitar esto se hace un 'try with resources' (Java 7+) que lo que hace es cerrarte el input 
         * cuando se acaban de realizar las operaciones en el bloque. 
         * Si no quieres hacerlo as� puedes llamar manualmente al método close de Scanner.
         */
       
    }
	
}
