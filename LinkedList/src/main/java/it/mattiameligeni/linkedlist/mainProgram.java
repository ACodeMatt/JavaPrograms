
package it.mattiameligeni.linkedlist;

/**
 *
 * @author Mattia
 */
public class mainProgram {
    public static void main(String[] args) {
        Lista Elenco = new Lista();
        
        Elenco.Aggiungi(24);
        Elenco.Aggiungi(45);
        Elenco.Aggiungi(69);
        Elenco.StampaLista();
        Elenco.Elimina(2);
        Elenco.StampaLista();
        
    }

   
   
    
    
}
