package com.adrian.actividad05.numeros;

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

	// Estos consulta y cambia no dejan de ser getters/setters normales, se les va mucho la olla a los profesores xD.
	public double consultaReal() {
		return real;
	}

	public double consultaImag() {
		return (int) imag;
	}

	public void cambiaReal(double real) {
		this.real = (int) real;
	}

	public void cambiaImag(double imag) {
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

}
