package Precocinado;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Miguel
 */
public class Ultracongelado extends Thread {

    protected Semaphore maxPrioridad;

    /**
     * Constructor. 
     * @param maxPrioridad
     */
    public Ultracongelado(Semaphore maxPrioridad, int p) {
        this.maxPrioridad = maxPrioridad;
        this.setPriority(p);
    }

    @Override
    public void run() {
        try {
            System.out.println("Ejecutando REALMENTE UltraCongelado");
            sleep(4000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Fin UltraCongelado");
        // Releases the semaphore, adding the value 2 
        this.maxPrioridad.release(2);
    }
}

