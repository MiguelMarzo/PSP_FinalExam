package JuegoPSP;

import java.util.concurrent.Semaphore;

public class Equipo2 extends Thread {

    protected Semaphore semaphore;
    private String jugadores = "Joseba";

    public Equipo2(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            this.semaphore.acquire(1);
            System.out.println("Entra/n a jugar " + this.jugadores);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        // Release the sempahore adding 1 to the permits variable.
        this.semaphore.release(1);
        System.out.println("Sale/n del juego " + this.jugadores + " QUEDAN " + semaphore.availablePermits() + " HUECOS");
    }
}
