package Ejercicio01;

import java.util.Scanner;

public class Persona {

    String nombre;
    int edad;
    float altura;

    String consulta_nome() {
        return nombre;
    }

    void cambia_nome(String nom) {
        nombre = nom;
    }

    public static void main(String[] args) {

        Persona nova_persoa = new Persona();
        Scanner entrada_nome = new Scanner(System.in);
        System.out.printf("Introduce o nome da persoa: ");
        String nom = entrada_nome.nextLine();
        System.out.printf("Nome: " + nom);
    }
}
