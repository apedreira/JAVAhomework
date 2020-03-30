
package com.adrian.actividad00;

import java.util.Random;
import java.util.Scanner;

import com.adrian.actividad00.entity.Lampada;
import com.adrian.actividad00.exception.LuminosidadExcedidaException;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Esto es muy importante, si no instanciamos la lámpara antes de empezar el menu cualquier
        // llamada a metodos de la clase Lampada resultará en NullPointerException.
        Lampada lampada = new Lampada();
        byte opcion = 0;
        do {
            System.out.println("|----- BIENVENIDO -----|" +
                    "\n¿Que desea hacer?" +
                    "\n1.- Encender lámpara" +
                    "\n2.- Apagar lámpara" +
                    "\n3.- Cambiar luminosidad" +
                    "\n4.- Incrementar luminosidad" +
                    "\n5.- Decrementar luminosidad" +
                    "\n6.- Salir");
            opcion = sc.nextByte();
            switch (opcion) {
                case 1:
                    lampada.encender();
                    break;
                case 2:
                    lampada.apagar();
                    break;
                case 3:
                    if (lampada.isOn()) {
                        try {
                            lampada.cambiarLuminosidade(new Random().nextInt(100000));
                        } catch (LuminosidadExcedidaException e) {
                            System.err.println("No se ha podido efectuar la operación, " + e.getMessage());
                        }
                    } else {
                        mostrarMensajeApagado();
                    }
                    break;
                case 4:
                    if (lampada.isOn()) {
                        System.out.println("Indique la cantidad de lúmenes a incrementar:");
                        int lumenesIncremento = sc.nextInt();
                        try {
                            lampada.incrementarLuinosidad(lumenesIncremento);
                        } catch (LuminosidadExcedidaException e) {
                            System.err.println("No se ha podido efectuar la operación, " + e.getMessage());
                        }
                    } else {
                        mostrarMensajeApagado();
                    }
                    break;
                case 5:
                    if (lampada.isOn()) {
                        System.out.println("Indique la cantidad de lúmenes a decrementar:");
                        int lumenesDecremento = sc.nextInt();
                        lampada.decrementarLuinosidad(lumenesDecremento);
                    } else {
                        mostrarMensajeApagado();
                    }
                    break;
                case 6:
                    System.out.println("Ha salido del programa.");
                    break;
                default:
                    break;
            }
        } while (opcion != 6);

    }

    private static void mostrarMensajeApagado() {
        System.err.println("Lampara apagada, acción sin efecto");
    }

}
