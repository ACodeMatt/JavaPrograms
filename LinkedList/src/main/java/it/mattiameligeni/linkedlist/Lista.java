
package it.mattiameligeni.linkedlist;

/**
 *
 * @author Mattia
 */
public final class Lista {
    private Nodo primoNodo;
    private int dim;

    public Lista() {
        setPrimoNodo(null);
        setDim(0);
    }

    public Nodo getPrimoNodo() {
        return primoNodo;
    }

    public void setPrimoNodo(Nodo primoNodo) {
        this.primoNodo = primoNodo;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }
    
    public void Aggiungi(int Valore){
            
        if(getPrimoNodo() == null)
            
            setPrimoNodo(new Nodo(Valore));
            
        else
          {
             Nodo Iterazione=getPrimoNodo();
             
             while(Iterazione.getSuccessivo() != null)
               Iterazione=Iterazione.getSuccessivo();
              
             Iterazione.setSuccessivo(new Nodo(Valore));
          }
        setDim(getDim()+1);
            
    }
    
    public void Elimina(int Posizione){
        
        Nodo Iterazione = getPrimoNodo();
       
        int i=0;
        
        if(Posizione == 0)
            setPrimoNodo(getPrimoNodo().getSuccessivo());
        else
          {
              while(Iterazione.getSuccessivo() != null && i < Posizione-1)
                {
            
                   Iterazione = Iterazione.getSuccessivo();
                   i++;
                }
              if(Iterazione.getSuccessivo() != null)
                Iterazione.setSuccessivo(Iterazione.getSuccessivo().getSuccessivo());
              else
                Iterazione.setSuccessivo(null);
          }
        
        setDim(getDim()-1);
    }
    
    public void StampaLista(){
      
       Nodo Iterazione = getPrimoNodo(); 
       while(Iterazione != null)
         {
           System.out.println("Valore del nodo -> " + Iterazione.getX());
           Iterazione = Iterazione.getSuccessivo();
         }    
        
    }
    
}
