package Ejercicio02;

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

    int consulta_idade() {
        return edad;
    }

    void cambia_idade(int idade) {
        edad = idade;
    }

    int consulta_altura() {
        return (int) altura;
    }

    void cambia_idade(float altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {

        Persona novaPersoa = new Persona();
        Scanner entrada_nome = new Scanner(System.in);
        System.out.printf("Introduce nome: ");
        String nom = entrada_nome.nextLine();
        Scanner entrada_idade = new Scanner(System.in);
        System.out.printf("Introduce idade (anos): ");
        int idade = entrada_idade.nextInt();
        Scanner entrada_altura = new Scanner(System.in);
        System.out.printf("Introduce altura (metros): ");
        float altura = entrada_altura.nextFloat();
        System.out.println("Nome: " + nom);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
    }
}
