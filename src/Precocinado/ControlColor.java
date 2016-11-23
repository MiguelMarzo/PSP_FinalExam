package Precocinado;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Miguel
 */
public class ControlColor extends Thread {

    protected Semaphore midPrioridad;

    /**
     * Constructor. 
     * @param midPrioridad
     */
    public ControlColor(Semaphore midPrioridad, int p) {
        this.midPrioridad = midPrioridad;
        this.setPriority(p);
    }

    @Override
    public void run() {
        try {
            this.midPrioridad.acquire();
            System.out.println("Ejecutando REALMENTE ControlColor");            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Fin ControlColor");
        // Release the sempahore adding 1 to the permits variable.
        this.midPrioridad.release();
    }
}

