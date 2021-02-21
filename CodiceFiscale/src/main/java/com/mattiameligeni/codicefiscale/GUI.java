package com.mattiameligeni.codicefiscale;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Nome = new javax.swing.JLabel();
        T_Nome = new javax.swing.JTextField();
        L_Cognome = new javax.swing.JLabel();
        T_Cognome = new javax.swing.JTextField();
        C_Sesso = new javax.swing.JComboBox<>();
        L_Sesso = new javax.swing.JLabel();
        C_Giorno = new javax.swing.JComboBox<>();
        L_DataDiNascita = new javax.swing.JLabel();
        L_Giorno = new javax.swing.JLabel();
        L_Mese = new javax.swing.JLabel();
        C_Mese = new javax.swing.JComboBox<>();
        L_Anno = new javax.swing.JLabel();
        C_Anno = new javax.swing.JComboBox<>();
        L_Comune = new javax.swing.JLabel();
        B_Calcola = new javax.swing.JButton();
        C_Comuni = new javax.swing.JComboBox<>();
        T_CodiceFiscale = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Nome.setText("Nome:");

        L_Cognome.setText("Cognome:");

        C_Sesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uomo", "Donna" }));

        L_Sesso.setText("Sesso:");

        C_Giorno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        L_DataDiNascita.setText("Data di Nascita");

        L_Giorno.setText("Giorno:");

        L_Mese.setText("Mese:");

        C_Mese.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre" }));

        L_Anno.setText("Anno:");

        C_Anno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        L_Comune.setText("Comune di Nascita:");

        B_Calcola.setText("Calcola Codice Fiscale");
        B_Calcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CalcolaActionPerformed(evt);
            }
        });

        C_Comuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_ComuniMouseClicked(evt);
            }
        });

        T_CodiceFiscale.setEditable(false);
        T_CodiceFiscale.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("© 2021, Mattia Meligeni.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T_CodiceFiscale)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_DataDiNascita)
                            .addComponent(L_Comune)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_Nome)
                                    .addComponent(T_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(L_Giorno)
                                            .addComponent(C_Giorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(C_Mese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(L_Mese))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(L_Anno)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(T_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(L_Cognome))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(L_Sesso)
                                                    .addComponent(C_Sesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C_Anno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(C_Comuni, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Calcola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Nome)
                    .addComponent(L_Cognome)
                    .addComponent(L_Sesso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Sesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_DataDiNascita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Giorno)
                    .addComponent(L_Mese)
                    .addComponent(L_Anno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_Giorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Mese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Anno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(L_Comune)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Comuni, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Calcola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(T_CodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_ComuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_ComuniMouseClicked

        try {
            CaricaComboComuni();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_C_ComuniMouseClicked

    private void B_CalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CalcolaActionPerformed

        //Lavoro sul cognome
        String cognome;
        cognome = T_Cognome.getText();
        cognome = cognome.toUpperCase();
        cognome = cognome.replaceAll("[AEIOU]", "");
        cognome = cognome.substring(0, 3);

        //Lavoro sul nome
        String nome = "";
        String nomeIniziale = T_Nome.getText();
        nomeIniziale = nomeIniziale.toUpperCase();
        nomeIniziale = nomeIniziale.replaceAll("[AEIOU]", "");
        if (nomeIniziale.length() >= 4) {
            nome = Character.toString(nomeIniziale.charAt(0));
            nome += Character.toString(nomeIniziale.charAt(2));
            nome += Character.toString(nomeIniziale.charAt(3));

        } else {
            nome = nomeIniziale.substring(0, 3);
        }

        //Lavoro sull'anno di nascita
        String anno = "";
        anno = (String) C_Anno.getSelectedItem();
        anno = anno.substring(2, 4);

        //Mese e giorno
        String mese = "";
        String giorno = "";
        int giornof;
        Map<String, String> mesi = new HashMap<String, String>();
        mesi.put("Gennaio", "A");
        mesi.put("Febbraio", "B");
        mesi.put("Marzo", "C");
        mesi.put("Aprile", "D");
        mesi.put("Maggio", "E");
        mesi.put("Giugno", "H");
        mesi.put("Luglio", "L");
        mesi.put("Agosto", "M");
        mesi.put("Settembre", "P");
        mesi.put("Ottobre", "R");
        mesi.put("Novembre", "S");
        mesi.put("Dicembre", "T");

        mese = mesi.get((String) C_Mese.getSelectedItem());

        String sesso = (String) C_Sesso.getSelectedItem();

        if (sesso.equals("Uomo")) {
            giorno = (String) C_Giorno.getSelectedItem();
        } else {

            giornof = Integer.parseInt((String) C_Giorno.getSelectedItem());
            giornof += 40;
            giorno = String.valueOf(giornof);

        }

        //Lavoro sul catasto
        String comune = (String) C_Comuni.getSelectedItem();
        String catasto = comune.substring(0, 4);

        String finale = cognome + nome + anno + mese + giorno + catasto;

        //Carattere di controllo
        int sommaPari = 0;
        for (int i = 1; i <= 13; i += 2) {
            switch (finale.charAt(i)) {
                case '0': {
                    sommaPari += 0;
                    break;
                }
                case '1': {
                    sommaPari += 1;
                    break;
                }
                case '2': {
                    sommaPari += 2;
                    break;
                }
                case '3': {
                    sommaPari += 3;
                    break;
                }
                case '4': {
                    sommaPari += 4;
                    break;
                }
                case '5': {
                    sommaPari += 5;
                    break;
                }
                case '6': {
                    sommaPari += 6;
                    break;
                }
                case '7': {
                    sommaPari += 7;
                    break;
                }
                case '8': {
                    sommaPari += 8;
                    break;
                }
                case '9': {
                    sommaPari += 9;
                    break;
                }
                case 'A': {
                    sommaPari += 0;
                    break;
                }
                case 'B': {
                    sommaPari += 1;
                    break;
                }
                case 'C': {
                    sommaPari += 2;
                    break;
                }
                case 'D': {
                    sommaPari += 3;
                    break;
                }
                case 'E': {
                    sommaPari += 4;
                    break;
                }
                case 'F': {
                    sommaPari += 5;
                    break;
                }
                case 'G': {
                    sommaPari += 6;
                    break;
                }
                case 'H': {
                    sommaPari += 7;
                    break;
                }
                case 'I': {
                    sommaPari += 8;
                    break;
                }
                case 'J': {
                    sommaPari += 9;
                    break;
                }
                case 'K': {
                    sommaPari += 10;
                    break;
                }
                case 'L': {
                    sommaPari += 11;
                    break;
                }
                case 'M': {
                    sommaPari += 12;
                    break;
                }
                case 'N': {
                    sommaPari += 13;
                    break;
                }
                case 'O': {
                    sommaPari += 14;
                    break;
                }
                case 'P': {
                    sommaPari += 15;
                    break;
                }
                case 'Q': {
                    sommaPari += 16;
                    break;
                }
                case 'R': {
                    sommaPari += 17;
                    break;
                }
                case 'S': {
                    sommaPari += 18;
                    break;
                }
                case 'T': {
                    sommaPari += 19;
                    break;
                }
                case 'U': {
                    sommaPari += 20;
                    break;
                }
                case 'V': {
                    sommaPari += 21;
                    break;
                }
                case 'W': {
                    sommaPari += 22;
                    break;
                }
                case 'X': {
                    sommaPari += 23;
                    break;
                }
                case 'Y': {
                    sommaPari += 24;
                    break;
                }
                case 'Z': {
                    sommaPari += 25;
                    break;
                }
            }
        }
        int sommaDispari = 0;
        for (int i = 0; i <= 14; i += 2) {
            switch (finale.charAt(i)) {
                case '0': {
                    sommaDispari += 1;
                    break;
                }
                case '1': {
                    sommaDispari += 0;
                    break;
                }
                case '2': {
                    sommaDispari += 5;
                    break;
                }
                case '3': {
                    sommaDispari += 7;
                    break;
                }
                case '4': {
                    sommaDispari += 9;
                    break;
                }
                case '5': {
                    sommaDispari += 13;
                    break;
                }
                case '6': {
                    sommaDispari += 15;
                    break;
                }
                case '7': {
                    sommaDispari += 17;
                    break;
                }
                case '8': {
                    sommaDispari += 19;
                    break;
                }
                case '9': {
                    sommaDispari += 21;
                    break;
                }
                case 'A': {
                    sommaDispari += 1;
                    break;
                }
                case 'B': {
                    sommaDispari += 0;
                    break;
                }
                case 'C': {
                    sommaDispari += 5;
                    break;
                }
                case 'D': {
                    sommaDispari += 7;
                    break;
                }
                case 'E': {
                    sommaDispari += 9;
                    break;
                }
                case 'F': {
                    sommaDispari += 13;
                    break;
                }
                case 'G': {
                    sommaDispari += 15;
                    break;
                }
                case 'H': {
                    sommaDispari += 17;
                    break;
                }
                case 'I': {
                    sommaDispari += 19;
                    break;
                }
                case 'J': {
                    sommaDispari += 21;
                    break;
                }
                case 'K': {
                    sommaDispari += 2;
                    break;
                }
                case 'L': {
                    sommaDispari += 4;
                    break;
                }
                case 'M': {
                    sommaDispari += 18;
                    break;
                }
                case 'N': {
                    sommaDispari += 20;
                    break;
                }
                case 'O': {
                    sommaDispari += 11;
                    break;
                }
                case 'P': {
                    sommaDispari += 3;
                    break;
                }
                case 'Q': {
                    sommaDispari += 6;
                    break;
                }
                case 'R': {
                    sommaDispari += 8;
                    break;
                }
                case 'S': {
                    sommaDispari += 12;
                    break;
                }
                case 'T': {
                    sommaDispari += 14;
                    break;
                }
                case 'U': {
                    sommaDispari += 16;
                    break;
                }
                case 'V': {
                    sommaDispari += 10;
                    break;
                }
                case 'W': {
                    sommaDispari += 22;
                    break;
                }
                case 'X': {
                    sommaDispari += 25;
                    break;
                }
                case 'Y': {
                    sommaDispari += 24;
                    break;
                }
                case 'Z': {
                    sommaDispari += 23;
                    break;
                }
            }
        }
        int interoControllo = (sommaPari + sommaDispari) % 26;
        String carattereControllo = "";
        switch (interoControllo) {
            case 0: {
                carattereControllo = "A";
                break;
            }
            case 1: {
                carattereControllo = "B";
                break;
            }
            case 2: {
                carattereControllo = "C";
                break;
            }
            case 3: {
                carattereControllo = "D";
                break;
            }
            case 4: {
                carattereControllo = "E";
                break;
            }
            case 5: {
                carattereControllo = "F";
                break;
            }
            case 6: {
                carattereControllo = "G";
                break;
            }
            case 7: {
                carattereControllo = "H";
                break;
            }
            case 8: {
                carattereControllo = "I";
                break;
            }
            case 9: {
                carattereControllo = "J";
                break;
            }
            case 10: {
                carattereControllo = "K";
                break;
            }
            case 11: {
                carattereControllo = "L";
                break;
            }
            case 12: {
                carattereControllo = "M";
                break;
            }
            case 13: {
                carattereControllo = "N";
                break;
            }
            case 14: {
                carattereControllo = "O";
                break;
            }
            case 15: {
                carattereControllo = "P";
                break;
            }
            case 16: {
                carattereControllo = "Q";
                break;
            }
            case 17: {
                carattereControllo = "R";
                break;
            }
            case 18: {
                carattereControllo = "S";
                break;
            }
            case 19: {
                carattereControllo = "T";
                break;
            }
            case 20: {
                carattereControllo = "U";
                break;
            }
            case 21: {
                carattereControllo = "V";
                break;
            }
            case 22: {
                carattereControllo = "W";
                break;
            }
            case 23: {
                carattereControllo = "X";
                break;
            }
            case 24: {
                carattereControllo = "Y";
                break;
            }
            case 25: {
                carattereControllo = "Z";
                break;
            }
        }
        finale += carattereControllo;

        T_CodiceFiscale.setText(finale);
    }//GEN-LAST:event_B_CalcolaActionPerformed

    private void CaricaComboComuni() throws IOException {

        String file = "C:\\Users\\Mattia\\Documents\\NetBeansProjects\\CodiceFiscale\\src\\main\\java\\com\\mattiameligeni\\codicefiscale\\codici_catastali.txt";
        try (FileInputStream fstream = new FileInputStream(file)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                C_Comuni.addItem(strLine);
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Calcola;
    private javax.swing.JComboBox<String> C_Anno;
    private javax.swing.JComboBox<String> C_Comuni;
    private javax.swing.JComboBox<String> C_Giorno;
    private javax.swing.JComboBox<String> C_Mese;
    private javax.swing.JComboBox<String> C_Sesso;
    private javax.swing.JLabel L_Anno;
    private javax.swing.JLabel L_Cognome;
    private javax.swing.JLabel L_Comune;
    private javax.swing.JLabel L_DataDiNascita;
    private javax.swing.JLabel L_Giorno;
    private javax.swing.JLabel L_Mese;
    private javax.swing.JLabel L_Nome;
    private javax.swing.JLabel L_Sesso;
    private javax.swing.JTextField T_CodiceFiscale;
    private javax.swing.JTextField T_Cognome;
    private javax.swing.JTextField T_Nome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
