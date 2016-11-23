
package JuegoPSP;

import java.util.concurrent.Semaphore;


public class Juego {


    public static void main(String[] args) {
        Semaphore aforo = new Semaphore(5);
        Equipo1 equipo1 = new Equipo1(aforo);
        Equipo2 equipo2 = new Equipo2(aforo);
        Equipo3 equipo3 = new Equipo3(aforo);
        Equipo4 equipo4 = new Equipo4(aforo);
 
        equipo1.start();
        equipo2.start();
        equipo3.start();
        equipo4.start();
        

    }
}
/**
 * He aplicado la implementación inicial, la de 2.5 pts
 */