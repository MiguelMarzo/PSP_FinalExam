package CuentaAtras;

/**
 *
 * @author Miguel
 */
public class Main {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2("VOY A BORRAR");
        
        hilo1.start();
        hilo2.start();
    }

}
/**
 * Para que se ejecuten los dos hilos concurrentemente no solo hay que implementar Runnable, sino que hay
 * que crear una instancia de Thread y llamar al start() de Thread que ejecutará el run() de forma concurrente
 * Para hacer que se ejecutase Hilo1 entero y luego Hilo2 valdría con quitar la instancia de Thread 
 */