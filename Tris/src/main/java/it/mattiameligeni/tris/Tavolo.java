/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.mattiameligeni.tris;

/**
 *
 * @author Mattia
 */
public class Tavolo {

    private boolean vittoria;
    private int turno;
    private char gioca;
    private char[][] tavolo = new char[3][3];

    public Tavolo() {
        this.turno = 0;
        this.gioca = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tavolo[i][j] = '*';
            }
        }
        this.vittoria = false;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public char getGioca() {
        return gioca;
    }

    public void setGioca(char gioca) {
        this.gioca = gioca;
    }

    public boolean isVittoria() {
        return vittoria;
    }

    public void setVittoria(boolean vittoria) {
        this.vittoria = vittoria;
    }

    public void gioca(int r, int c) {
        
        if (tavolo[r - 1][c - 1] == '*') {
            if (turno % 2 == 0) {

                tavolo[r - 1][c - 1] = 'X';
                setGioca('O');
            } else {
                tavolo[r - 1][c - 1] = 'O';
                setGioca('X');
            }
            setTurno(getTurno() + 1);
        } else {
            System.err.println("//Posizione già occupata.//");

        }
        
    }

    public void controllo() {

        for (int i = 0; i < 3; i++) {
            try {
                if (tavolo[i][i] == getGioca() && tavolo[i][i + 1] == getGioca() && tavolo[i][i + 2] == getGioca()) {
                    setVittoria(true);
                    System.out.print("Ha vinto: " + getGioca() + ", per tris orizzontale");
                    System.exit(0);
                }

                if (tavolo[i][i] == getGioca() && tavolo[i + 1][i] == getGioca() && tavolo[i + 2][i] == getGioca()) {
                    setVittoria(true);
                    System.out.print("Ha vinto: " + getGioca() + ", per tris verticale");
                    System.exit(0);
                }

                if (tavolo[i][i] == getGioca() && tavolo[i + 1][i + 1] == getGioca() && tavolo[i + 2][i + 2] == getGioca()) {
                    setVittoria(true);
                    System.out.print("Ha vinto: " + getGioca() + ", per tris obliquo");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.exit(0);
            }
            
        }

    }

    public void stampa() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(this.tavolo[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
