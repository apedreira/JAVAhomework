package ejercicio03.entity;

public class Persona {

	// Atributos de clase siempre privados
    private String nombre;
    private int edad;
    // cuanto más acotes los valores mejor gestionarás la memoria en este caso nos vale un float para la altura
    private double altura;

    // Constructor público (en este caso) para poder acceder desde fuera del paquete
    public Persona(String nomePersoa, int idadePersoa, double alturaPersoa) {
        nombre = nomePersoa;
        edad = idadePersoa;
        altura = alturaPersoa;
    }

    
    // Para acceder a los atributos (que son siempre privados), siempre se utilizan los getters/setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
    

}
