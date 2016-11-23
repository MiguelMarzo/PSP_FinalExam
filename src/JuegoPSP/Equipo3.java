package JuegoPSP;

import java.util.concurrent.Semaphore;

public class Equipo3 extends Thread {

    protected Semaphore semaphore;
    private String jugadores = "Adrián y Raúl";

    public Equipo3(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            this.semaphore.acquire(2);
            System.out.println("Entra/n a jugar " + this.jugadores);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        // Release the sempahore adding 2 to the permits variable.
        this.semaphore.release(2);
        System.out.println("Sale/n del juego " + this.jugadores + " QUEDAN " + semaphore.availablePermits() + " HUECOS");
    }
}
