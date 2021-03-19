package it.mattiameligeni.sim;

import java.util.Scanner;

/**
 *
 * @author Mattia
 */
public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prego inserire numero e credito per la creazione della sim: \n");
        sim s1 = new sim(scan.nextLine(), scan.nextDouble());
        
        while (true) {            
            int scelta;
            System.out.println("---------------------------");
            System.out.println("Digita 1 per inserire una nuova chiamata (System.out.println(Attenzione, ogni chiamata consumera 0,10 euro di credito.)");
            System.out.println("Digita 2 per stampare i minuti totali di conversazione");
            System.out.println("Digita 3 per stampare il numero di telefonate verso un determinato telefono");
            System.out.println("Digita 4 per ricaricare");
            System.out.println("Digita 5 per stampare i dati della sim, e il registro chiamate");
            System.out.println("Digita 6 per uscire\n:");
            scan = new Scanner(System.in);
            scelta = scan.nextInt();
            switch (scelta) {
                case 1:
                    scan = new Scanner(System.in);
                    System.out.println("Inserire numero chiamato e durata con ,\n:");
                    s1.aggiungiChiamata(scan.nextLine(), scan.nextDouble());
                    break;
                case 2:
                    s1.minutiTotali();
                    System.out.println();
                    break;
                case 3:
                    scan = new Scanner(System.in);
                    System.out.println("Inserire il telefono da cercare\n:");
                    s1.contaTelefonate(scan.nextLine());
                    break;
                case 4:
                    scan = new Scanner(System.in);
                    System.out.println("Inserire l'importo da ricaricare\n:");
                    s1.setCredito(s1.getCredito()+scan.nextDouble());
                    break;
                case 5:
                    s1.resoconto();
                    break;
                case 6:
                    System.exit(0);
                    break;
                
            }
            
        }
        
    }
}
