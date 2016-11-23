package Padovan;


import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;

/**
 * Clase principal. Construye la BlockingQueueu y arranca los hilos.
 * @author Eugenia Pérez
 */
public class Padovan {

    public static void main(String[] args) {
        //BlockingQueue<Integer> queue = new LinkedBlockingDeque<Integer>();
        BlockingQueue<Integer> queue = new SynchronousQueue<Integer>();
        ProducerPadovan productor = new ProducerPadovan(queue);
        Consumer consumer = new Consumer(queue);
        productor.start();
        consumer.start();
    }
}

/**
 * Para un resultado igual sin usar BlockingQueue deberíamos usar métodos synchronized dentro de 
 * un contenedor que almacenase los números del productor y no permitiese acceso al consumidor
 * hasta que el productor hubiese puesto un número y viceversa.
 */