/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.mattiameligeni.matrici;

import java.util.Scanner;

/**
 *
 * @author Mattia
 */
public class mainProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserire righe e colonne della matrice");
        TMatrice m1 = new TMatrice(in.nextInt(), in.nextInt());
        m1.leggi();
        
        /*System.out.println("Inserisci il numero per cui moltiplicare la matrice: ");
        m1.moltiplica(in.nextInt());*/
        
        System.out.println("Inserire righe e colonne della seconda matrice");
        TMatrice m2 = new TMatrice(in.nextInt(), in.nextInt());
        m2.leggi();
        
        
        m1.moltiplica(m2);
        System.out.println("==============");
        System.out.println("Somma delle due matrici: ");
        m1.somma(m2);
        if(m1.getR()!= m1.getC()){
        
            System.err.println("Errore, matrice non quadrata impossibile sommare le diagonali.");
        
        }else{
        
            m1.sommaD();
            
        }
    }
}
