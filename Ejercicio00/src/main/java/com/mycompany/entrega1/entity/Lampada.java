/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entrega1.entity;

import com.mycompany.entrega1.exceptions.LuminosidadExcedidaException;

/**
 *
 * @author PC
 */
public class Lampada {
    //Los atributos de clase siempre tienen que ser privados, si necesitas acceder desde fuera se harán los
    // getters y setters que hagan falta
    private int consumo;
    //MAX Y MIN luminosidade tienen siempre un valor, es buena práctica hacerlos constantes
    // las constantes son static final.
    // static:
    // siempre que se utilice usará la misma instancia y se apuntará por referencia a un mismo objeto
    // en vez de instanciar siempre uno nuevo.
    // final: el valor nunca se podrá cambiar.
    private static final Integer MAX_LUMINOSIDADE = 100000;
    private static final Integer MIN_LUMINOSIDADE = 1;
    private int luminosidade;

    private boolean on;

    public Lampada() {
    }

    public void encender() {
        if (!this.on) {
            this.on = true;
            this.luminosidade = 1;
            System.out.println("On(" + this.luminosidade + ")");
        } else {
            System.out.println("La lampara no está apagada, no tendrá efecto");
        }
    }

    public void apagar() {
        if (this.on == true) {
            this.on = false;
            this.luminosidade = 0;
            System.out.println("Off()");
        } else {
            System.out.println("La lampara no está encendida, acción sin efecto");
        }
    }

    public void cambiarLuminosidade(int cambio) throws LuminosidadExcedidaException {
        if(!this.on) {
            System.out.println("La lámpara está apagada, acción sin efecto");
            // Vuelve a Main
            return;
        }
        if (lamparaEncendidaYRangoValido(cambio)) {
            this.luminosidade = cambio;
            System.out.println("On(" + this.luminosidade + ")");
        } else {
            throw new LuminosidadExcedidaException("Luminosidade excesiva");
        }
    }

    public void incrementarLuinosidad(int lumenesIncremento) throws LuminosidadExcedidaException {
        int lumenesTotales = this.luminosidade + lumenesIncremento;
        if (lamparaEncendidaYRangoValido(lumenesTotales)) {
            this.luminosidade = lumenesTotales;
            System.out.println("On(" + this.luminosidade + ")");
        } else {
            throw new LuminosidadExcedidaException("Luminosidade excesiva");
        }
    }

    public void decrementarLuinosidad(int lumenesDecremento) {
        int lumenesTotales = this.luminosidade - lumenesDecremento;
        if (lamparaEncendidaYRangoValido(lumenesTotales)) {
            this.luminosidade = lumenesTotales;
            System.out.println("On(" + this.luminosidade + ")");
        } else if(lumenesTotales < 1) {
            // Esto se podría controlar via excepción también, de hecho sería buena práctica,
            // Lanzarías excepción como en el caso de arriba y manejarias el mensaje desde Main.java
            System.out.println("No es posible decrementar tanto la luminosidad, apague la lampara");
        }
    }

    // Podrias crear los getters y setters pero bueno, en este caso no se utilizaría más que este
    public boolean isOn() {
        return this.on;
    }

    private boolean lamparaEncendidaYRangoValido(int lumenesTotales) {
        return this.on && (lumenesTotales >= MIN_LUMINOSIDADE && lumenesTotales <= MAX_LUMINOSIDADE);
    }

}
