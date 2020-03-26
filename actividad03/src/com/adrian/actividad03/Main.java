package com.adrian.actividad03;

import ejercicio03.entity.Persona;

public class Main {

	public static void main(String[] args) {
		Persona novaPersoa = new Persona("Luisa P�rez", 22, 1.70);
		System.out.println("Nome: " + novaPersoa.getNombre());
		System.out.println("Idade: " + novaPersoa.getEdad());
		// Bien! por el String format para los decimales
		System.out.println("Altura: " + String.format("%.2f", novaPersoa.getAltura()));
	}

}
