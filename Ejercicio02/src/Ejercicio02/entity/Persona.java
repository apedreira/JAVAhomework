package ejercicio02.entity;

public class Persona {

	// Atributos de clase siempre privados
	private String nombre;
	private int edad;
	private float altura;

	public String consultaNome() {
		return nombre;
	}

	public void cambiaNome(String nom) {
		nombre = nom;
	}

	public int consultaIdade() {
		return edad;
	}

	public void cambiaIdade(int idade) {
		edad = idade;
	}

	/*
	 * si la altura está introducida en floats es mala idea castearla a int (vas a
	 * perder los datos decimales que en este caso son muy importantes) imaginate
	 * que el valor es 1.70, te va a devolver redondeado hacia arriba el numero 2 y
	 * no es lo mismo medir 1.70 que medir 2 metros jaja
	 */
	public float consultaAltura() {
		// return (int) altura;
		return altura;
	}

	// Esto fue un copy paste en toda regla eh jaja
	public void cambiaAltura(float altura) {
		this.altura = altura;
	}

}
