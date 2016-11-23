package Precocinado;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Miguel
 */
public class Main {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(0);
        Ultracongelado ultracongelado = new Ultracongelado(semaphore, Thread.MAX_PRIORITY);
        System.out.println("Creado Ultracongelado");
        ControlColor controlColor = new ControlColor(semaphore, 5);
        System.out.println("Creado ControlColor");
        ControlTemperatura controlTemperatura = new ControlTemperatura(semaphore, 5);
        System.out.println("Creado ControlTemperatura");
        Empaquetado empaquetado = new Empaquetado(semaphore, Thread.MIN_PRIORITY);
        System.out.println("Creado Empaquetado");

        ultracongelado.start();
        System.out.println("Ejecutando Ultracongelado");
        controlColor.start();
        System.out.println("Ejecutando ControlColor");
        controlTemperatura.start();
        System.out.println("Ejecutando ControlTemperatura");
        empaquetado.start();
        System.out.println("Ejecutando Empaquetado");
    }
}
