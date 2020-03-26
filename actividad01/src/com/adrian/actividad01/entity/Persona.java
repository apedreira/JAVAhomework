package com.adrian.actividad01.entity;

public class Persona {

	// Atributos de clase siempre privados, elimino los atributos (idade, altura) no utilizados en este ejercicio
    private String nombre;

    public String consultaNome() {
        return nombre;
    }

    public void cambiaNome(String nom) {
        nombre = nom;
    }


}
