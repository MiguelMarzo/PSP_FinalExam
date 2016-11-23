package Padovan;


import java.util.concurrent.BlockingQueue;
/**
 * Clase productor. Produce los números de la serie Padovan.
 * @author Miguel Marzo
 */
public class ProducerPadovan
        extends Thread {

    private int f1 = 1;
    private int f2 = 1;
    private int f3 = 1;
    private final BlockingQueue<Integer> queue;
    private static final int ITERATIONS_NUMBER = 100;

    public ProducerPadovan(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i<ProducerPadovan.ITERATIONS_NUMBER ; i++) {
                int fn = f1 + f2;
                queue.put(fn);
                f1 = f2;
                f2 = f3;
                f3 = fn;
                sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}