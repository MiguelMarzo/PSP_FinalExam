package Padovan;


import java.util.concurrent.BlockingQueue;

/**
 * Clase consumidor. Retira los números de la serie Padovan.
 * @author Miguel Marzo
 */
public class Consumer
        extends Thread {

    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int n = queue.take();
                System.out.println(n);
            }
        } catch (InterruptedException e) {
        }
    }
}
