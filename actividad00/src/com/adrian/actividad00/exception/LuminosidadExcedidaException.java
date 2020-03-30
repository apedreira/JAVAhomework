/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.actividad00.exception;

/**
 * Excepcion custom para determinar que se ha excedido el numero de lumenes permitido
 * Se pone un nombre relevante a la excepción, en este caso LuminosidadExcedidaException
 * Tiene un constructor al que le pasas un mensaje de error cuando haces el
 * 'throw new LuminosidadExcedidaException(mensajeError)' y en el constructor se lo pasas al padre, la
 * clase Exception que a su vez llama a su padre, la clase Throwable, que es la que se encarga de pintar
 * la excepción por consola.
 *
 * @author PC
 */
public class LuminosidadExcedidaException extends Exception {

    public LuminosidadExcedidaException(String mensajeError) {
        super(mensajeError);
    }
    
}
