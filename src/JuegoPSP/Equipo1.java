package JuegoPSP;

import java.util.concurrent.Semaphore;

public class Equipo1 extends Thread {

    protected Semaphore semaphore;
    private String jugadores = "Asier A, Mikel y David";

    public Equipo1(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            this.semaphore.acquire(3);
            System.out.println("Entra/n a jugar " + this.jugadores);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            sleep(6000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        // Release the sempahore adding 3 to the permits variable.
        this.semaphore.release(3);
        System.out.println("Sale/n del juego " + this.jugadores + " QUEDAN " + semaphore.availablePermits() + " HUECOS");
    }
}
