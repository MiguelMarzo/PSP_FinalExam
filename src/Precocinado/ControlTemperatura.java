package Precocinado;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Miguel
 */
public class ControlTemperatura extends Thread {

    protected Semaphore midPrioridad;

    /**
     * Constructor.
     *
     * @param midPrioridad
     */
    public ControlTemperatura(Semaphore midPrioridad, int p) {
        this.midPrioridad = midPrioridad;
        this.setPriority(p);
    }

    @Override
    public void run() {
        try {
            this.midPrioridad.acquire();
            System.out.println("Ejecutando REALMENTE ControlTemperatura");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Fin ControlTemperatura");
        // Release the sempahore adding 1 to the permits variable.
        this.midPrioridad.release();
    }
}
