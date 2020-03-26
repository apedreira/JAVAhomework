package ejercicio05;

import ejercicio05.numeros.Complejo;

/* Menuda ida de olla de ejercicio, pero está perfecto hecho jaja*/ 
public class Main {
    public static void main(String[] args) {

        System.out.println("#1. public Complejo(): Constructor que inicializa "
        + "los atributos a cero:");
        Complejo complejo0 = new Complejo();
        System.out.println("(" + complejo0.consultaReal() + "," + complejo0.consultaImag() + ")");

        System.out.println("#2. public Complejo(double real, double imag): "
        + "Constructor que inicializa los \n" +
        "atributos a los valores indicados por los parámetros (8,6):");    
        Complejo complejoA = new Complejo(8, 6);
        System.out.println("(" + complejoA.consultaReal() + "," + complejoA.consultaImag() + ")");

        System.out.println("#3. public double consulta_Real(): Devuelve la parte "
        + "real del objeto:");
        System.out.println(complejoA.consultaReal());

        System.out.println("#4. public double consulta_Imag(): Devuelve la parte "
        + "imaginaria del objeto:");
        System.out.println(complejoA.consultaImag());

        System.out.println("#5. public void cambia_Real(double real): Asigna a la "
        + "parte real del\n" + "objeto el valor indicado en el parámetro real (3).");
        complejoA.cambiaReal(3);
        System.out.println(complejoA.consultaReal());
        
        System.out.println("#6. public void cambia_Imag(double imag): Asigna a la "
        + "parte imaginaria del \n" +"objeto el valor indicado en el parámetro imag:"); 
 
        complejoA.cambiaImag(4);
        System.out.println(complejoA.consultaImag());

        System.out.println("#7. public String toString(): Convierte a String el número complejo, mediante \n" +
        "la concatenación de sus atributos y devuelve como resultado la cadena de \n" +
        "texto 3 + 4i, si 3 es la parte real y 4 la parte imaginaria."); 

        System.out.println(complejoA.toString());

        System.out.println("#8. public void sumar(Complejo b): Suma la parte real con la parte real del \n" +
        "número complejo b y la parte imaginaria con la parte imaginaria del \n" +
        "número complejo b:");
        Complejo complejoB = new Complejo(2, 1);
        System.out.println("Complejo A: (" + complejoA.consultaReal() + "," + complejoA.consultaImag() + ")");
        System.out.println("Complejo B: (" + complejoB.consultaReal() + "," + complejoB.consultaImag() + ")");
        complejoA.sumar(complejoB);
        System.out.println("Suma: (" + complejoA.consultaReal() + "," + complejoA.consultaImag() + ")");
    }
}
