package ejercicio04.entity;

public class Persona {

	// Atributos de clase siempre privados
    private String nombre;
    private int edad;
    private double altura;

    // Constructor publico (En este caso) para acceder desde fuera del paquete
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //Getters, si no usas los setters no hace falta ponerlos pero generalmente siempre se ponen los dos.
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getAltura() {
		return altura;
	}
    
    


}
