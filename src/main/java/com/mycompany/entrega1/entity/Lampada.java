/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entrega1.entity;

/**
 *
 * @author PC
 */
public class Lampada {
    int consumo;
    int maxLuminosidade;
    int minLuminosidade;
    int luminosidade;
    boolean on;

    public Lampada(int consumo, int maxLuminosidade, int minLuminosidade, int luminosidade, boolean on) {
        this.consumo = consumo;
        this.maxLuminosidade = maxLuminosidade;
        this.minLuminosidade = minLuminosidade;
        this.luminosidade = luminosidade;
        this.on = false;

    }

    public Lampada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void encender() {
        if (!on) {
            on = true;
            luminosidade = 1;
            System.out.println("On(" + luminosidade + ")");
        }
    }

    public void apagar() {
        if (on == true) {
            on = false;
            luminosidade = 0;
            System.out.println("Off()");
        }
    }

    public void cambiarLuminosidade(int cambio) throws exception {
        if (on && (luminosidade + cambio >= 1) && (luminosidade + cambio <= 100.000)) {
            luminosidade = luminosidade + cambio;
            System.out.println("On(" + luminosidade + ")");
        }
        if (on && (luminosidade + cambio > 100.000)) {
            throw new exception("Luminosidade excesiva");
        }
    }

}
