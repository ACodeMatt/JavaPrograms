
package it.mattiameligeni.linkedlist;

/**
 *
 * @author Mattia
 */
public class Nodo {
    private int x;
    Nodo successivo;
    public Nodo() {
        setX(0);
        setSuccessivo(null);
    }

    public Nodo(int x) {
        setX(x);
        setSuccessivo(null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Nodo getSuccessivo() {
        return successivo;
    }

    public void setSuccessivo(Nodo successivo) {
        this.successivo = successivo;
    }
    
    
}
