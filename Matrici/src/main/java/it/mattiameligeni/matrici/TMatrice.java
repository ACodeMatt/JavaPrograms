package it.mattiameligeni.matrici;

import java.util.Scanner;

/**
 *
 * @author Mattia
 */
public class TMatrice {

    private int r;
    private int c;
    int[][] m;

    public TMatrice(int r, int c) {
        this.r = r;
        this.c = c;
        this.m = new int[r][c];
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int[][] getM() {
        return m;
    }

    public void stampa() {
        System.out.println("==============");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(this.m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============");

    }

    public void moltiplica(int n) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                this.m[i][j] = this.m[i][j] * n;
            }
        }
        stampa();

    }

    public void moltiplica(TMatrice m2) {
        int b[][] = m2.getM();

         
        if (getC() != m2.getR()) {
            System.out.println("Le matrici non possono essere moltiplicate");
        } else {
           
            int prod[][] = new int[getR()][m2.getC()];

             
            for (int i = 0; i < getR(); i++) {
                for (int j = 0; j < m2.getC(); j++) {
                    for (int k = 0; k < m2.getR(); k++) {
                        prod[i][j] = prod[i][j] + m[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Prodotto delle due matrici: ");
            for (int i = 0; i < getR(); i++) {
                for (int j = 0; j < m2.getC(); j++) {
                    System.out.print(prod[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    public void somma(TMatrice m2) {

        int b[][] = m2.getM();
        int c[][] = new int[getR()][getC()];

        for (int i = 0; i < getR(); i++) {
            for (int j = 0; j < getR(); j++) {
                c[i][j] = m[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void leggi() {

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print("Inserisci elementi nella riga: " + i + " e colonna: " + j + "\n");
                this.m[i][j] = in.nextInt();
            }
        }
        stampa();
    }

    public void sommaD() {
        int sp = 0;
        int ss = 0;
        int j = m.length - 1;
        for (int i = 0; i < m.length; i++, j--) {
            sp = sp + m[i][i];
            ss = ss + m[i][j];
        }
        System.out.println("Somma diagonale principale: " + sp);
        System.out.println("Somma diagonale secondaria: " + ss);

    }
}
