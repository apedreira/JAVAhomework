package Ejercicio03;

public class Persona {

    String nombre;
    int edad;
    double altura;

    Persona(String nomePersoa, int idadePersoa, double alturaPersoa) {
        nombre = nomePersoa;
        edad = idadePersoa;
        altura = alturaPersoa;
    }

    public static void main(String[] args) {
        Persona novaPersoa = new Persona("Luisa Pérez", 22, 1.70);
        System.out.println("Nome: " + novaPersoa.nombre);
        System.out.println("Idade: " + novaPersoa.edad);
        System.out.println("Altura: " + String.format("%.2f", novaPersoa.altura));
    }
}
