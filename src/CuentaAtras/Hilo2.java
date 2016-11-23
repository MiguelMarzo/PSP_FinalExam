package CuentaAtras;

/**
 *
 * @author Miguel
 */
public class Hilo2 implements Runnable {

    /**
     * Instancia de Thread para implementar un hilo.
     */
    Thread t;
    private String mensaje;

    /**
     * Constructor.
     *
     *
     */
    public Hilo2(String mensaje) {
        t = new Thread(this);
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(mensaje);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    /**
     * Arranca el hilo.
     */
    public void start() {
        t.start();
    }

}
