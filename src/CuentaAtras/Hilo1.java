package CuentaAtras;

/**
 *
 * @author Miguel
 */
public class Hilo1 implements Runnable {

    /**
     * Instancia de Thread para implementar un hilo.
     */
    Thread t;
    
    /**
     * Constructor.
     *
     * 
     */
    public Hilo1() {
        t = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 19; i > 0; i--) {
            if (i > 1) {
                System.out.println(i);
            } else {
                System.out.println("SE ACABO!!");
            }
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
    
