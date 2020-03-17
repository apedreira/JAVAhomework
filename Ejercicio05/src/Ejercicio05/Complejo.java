package Ejercicio05;

/**
 *
 * @Adrián Pedreira
 */
public class Complejo {

    int real;
    int imag;

    public Complejo() {
        real = 0;
        imag = 0;
    }

    public Complejo(double real, double imag) {
        this.real = (int) real;
        this.imag = (int) imag;
    }

    public double consulta_Real() {
        return real;
    }

    public double consulta_Imag() {
        return (int) imag;
    }

    public void cambia_Real(double real) {
        this.real = (int) real;
    }

    public void cambia_Imag(double imag) {
        this.imag = (int) imag;
    }

 @Override
    public String toString() {
        return real + " + " + imag + "i";
    }


    public void sumar(Complejo complejo) {
        real = real + complejo.real;
        imag = imag + complejo.imag;
    }

    public static void main(String[] args) {

        System.out.println("#1. public Complejo(): Constructor que inicializa "
        + "los atributos a cero:");
        Complejo complejo0 = new Complejo();
        System.out.println("(" + complejo0.real + "," + complejo0.imag + ")");

        System.out.println("#2. public Complejo(double real, double imag): "
        + "Constructor que inicializa los \n" +
        "atributos a los valores indicados por los parámetros (8,6):");    
        Complejo complejoA = new Complejo(8, 6);
        System.out.println("(" + complejoA.real + "," + complejoA.imag + ")");

        System.out.println("#3. public double consulta_Real(): Devuelve la parte "
        + "real del objeto:");
        System.out.println(complejoA.consulta_Real());

        System.out.println("#4. public double consulta_Imag(): Devuelve la parte "
        + "imaginaria del objeto:");
        System.out.println(complejoA.consulta_Imag());

        System.out.println("#5. public void cambia_Real(double real): Asigna a la "
        + "parte real del\n" + "objeto el valor indicado en el parámetro real (3).");
        complejoA.cambia_Real(3);
        System.out.println(complejoA.consulta_Real());
        
        System.out.println("#6. public void cambia_Imag(double imag): Asigna a la "
        + "parte imaginaria del \n" +"objeto el valor indicado en el parámetro imag:"); 
 
        complejoA.cambia_Imag(4);
        System.out.println(complejoA.consulta_Imag());

        System.out.println("#7. public String toString(): Convierte a String el número complejo, mediante \n" +
        "la concatenación de sus atributos y devuelve como resultado la cadena de \n" +
        "texto 3 + 4i, si 3 es la parte real y 4 la parte imaginaria."); 

        System.out.println(complejoA.toString());

        System.out.println("#8. public void sumar(Complejo b): Suma la parte real con la parte real del \n" +
        "número complejo b y la parte imaginaria con la parte imaginaria del \n" +
        "número complejo b:");
        Complejo complejoB = new Complejo(2, 1);
        System.out.println("Complejo A: (" + complejoA.real + "," + complejoA.imag + ")");
        System.out.println("Complejo B: (" + complejoB.real + "," + complejoB.imag + ")");
        complejoA.sumar(complejoB);
        System.out.println("Suma: (" + complejoA.real + "," + complejoA.imag + ")");
    }
}
