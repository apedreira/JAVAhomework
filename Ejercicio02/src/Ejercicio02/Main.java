package ejercicio02;

import java.util.Scanner;

import ejercicio02.entity.Persona;

public class Main {
	public static void main(String[] args) {

		Persona novaPersoa = new Persona();
		// Try with resources para cerrar el flujo de datos de entrada.
		// ¡Ojo! basta solamente con una instancia de Scanner, no tienes que abrir más
		// de una para nada.
		try (Scanner entradaDatos = new Scanner(System.in)) {
			System.out.printf("Introduce nome: ");
			String nom = entradaDatos.nextLine();
			novaPersoa.cambiaNome(nom);

			System.out.printf("Introduce idade (anos): ");
			int idade = entradaDatos.nextInt();
			novaPersoa.cambiaIdade(idade);

			System.out.printf("Introduce altura (metros): ");
			float altura = entradaDatos.nextFloat();
			novaPersoa.cambiaAltura(altura);

			System.out.println("Nome: " + nom);
			System.out.println("Idade: " + idade + " anos");
			// printf con %.2f solo muestra dos decimales del float aunque pongas 1,772125.
			System.out.printf("Altura:  %.2f%s", altura, " metros");
		}
	}
}
