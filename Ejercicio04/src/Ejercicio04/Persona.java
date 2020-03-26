package Ejercicio04;

public class Persona {

    String nombre;
    int edad;
    double altura;

    Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Persona novaPersoa = new Persona("Manuel Fernández", 26, 1.81);
        System.out.println("Nome: " + novaPersoa.nombre);
        System.out.println("Idade: " + novaPersoa.edad);
        System.out.println("Altura: " + String.format("%.2f", novaPersoa.altura));
    }
}
