package it.mattiameligeni.tris;

import java.util.Scanner;

/**
 *
 * @author Mattia
 */
public class mainProgram {

    public static void main(String[] args) {
        Tavolo t1 = new Tavolo();
        Scanner scan = new Scanner(System.in);
        t1.stampa();
        
        
        while (true) {
            
            if (t1.getGioca() == 'X') {
                t1.controllo();
                System.out.println("Turno: " + String.valueOf(t1.getTurno() + 1) + ", gioca X, inserire colonna (1,2,3) e riga:\n");
                t1.gioca(scan.nextInt(), scan.nextInt());
                System.out.println("");
                t1.stampa();
                
            } else {
                t1.controllo();
                System.out.println("Turno: " + String.valueOf(t1.getTurno() + 1) + ", gioca O, inserire colonna (1,2,3) e riga:\n");
                t1.gioca(scan.nextInt(), scan.nextInt());
                System.out.println("");
                t1.stampa();
                
            }
            
        }
    }

}
