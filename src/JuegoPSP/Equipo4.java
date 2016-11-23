package JuegoPSP;

import java.util.concurrent.Semaphore;

public class Equipo4 extends Thread {

    protected Semaphore semaphore;
    private String jugadores = "Miguel, David E y Sergio";

    public Equipo4(Semaphore semaphore) {
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
            sleep(4000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        // Release the sempahore adding 3 to the permits variable.
        this.semaphore.release(3);
        System.out.println("Sale/n del juego " + this.jugadores + " QUEDAN " + semaphore.availablePermits() + " HUECOS");
    }
}
