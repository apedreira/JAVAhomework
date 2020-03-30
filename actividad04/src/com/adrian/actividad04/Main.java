package com.adrian.actividad04;

import com.adrian.actividad04.entity.Persona;

public class Main {

    public static void main(String[] args) {
        Persona novaPersoa = new Persona("Manuel Fern�ndez", 26, 1.81);
        System.out.println("Nome: " + novaPersoa.getNombre());
        System.out.println("Idade: " + novaPersoa.getEdad());
        System.out.println("Altura: " + String.format("%.2f", novaPersoa.getAltura()));
    }
	
}
