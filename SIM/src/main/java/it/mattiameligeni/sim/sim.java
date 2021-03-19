package it.mattiameligeni.sim;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mattia
 */
class telefonata {

    private String telefono;
    private double minuti;

    public telefonata(String telefono, double minuti) {
        setTelefono(telefono);
        setMinuti(minuti);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getMinuti() {
        return minuti;
    }

    public void setMinuti(double minuti) {
        this.minuti = minuti;
    }

}

public class sim {

    private String telefono;
    private double credito;
    List<telefonata> telefonate = new ArrayList<telefonata>();

    public sim(String telefono, double credito) {
        setTelefono(telefono);
        setCredito(credito);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void aggiungiChiamata(String t, double m) {
        
        if (getCredito() >= 0.10) {
            telefonate.add(new telefonata(t, m));
            setCredito(getCredito() - 0.10);
            System.out.println("Chiamata aggiunta, credito aggiornato: " + String.valueOf(getCredito()));
        } else {
            System.err.println("Credito insufficiente.");
        }

    }

    public void minutiTotali() {
        double m = 0.0;
        for (int i = 0; i < telefonate.size(); i++) {
            m += telefonate.get(i).getMinuti();
        }
        System.out.println("I minuti totali di conversazione, sono: " + String.valueOf(m));

    }

    public void contaTelefonate(String t) {
        double m = 0.0;
        int n = 0;
        for (int i = 0; i < telefonate.size(); i++) {
            if (telefonate.get(i).getTelefono().equals(t)) {
                m += telefonate.get(i).getMinuti();
                n++;
            }

        }
        System.out.println("Il numero è stato chiamato " + String.valueOf(n) + " volte, per un totale di " + String.valueOf(m) + " minuti.");
    }
    
    public void resoconto(){
    
        //Dati sim
        System.out.println("Numero: " + getTelefono() + ", credito: " + String.valueOf(getCredito()) + " euro.");
        
        //Registro chiamate
        System.out.println("Registro chiamate: ");
        for (int i = 0; i < telefonate.size(); i++) {
            
            System.out.println( String.valueOf(i+1) + "-" + telefonate.get(i).getTelefono() + ", " + String.valueOf(telefonate.get(i).getMinuti()) + " minuti.");
            
        }
    }
   
}
