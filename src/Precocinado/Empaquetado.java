package Precocinado;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Miguel
 */
public class Empaquetado extends Thread {

    protected Semaphore minPrioridad;

    /**
     * Constructor.
     *
     * @param minPrioridad
     */
    public Empaquetado(Semaphore minPrioridad, int p) {
        this.minPrioridad = minPrioridad;
        this.setPriority(p);
    }

    @Override
    public void run() {
        try {
            this.minPrioridad.acquire(2);
             System.out.println("Ejecutando REALMENTE Empaquetado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Fin Empaquetado");
        // Release the sempahore adding 1 to the permits variable.
        this.minPrioridad.release();
    }
}
