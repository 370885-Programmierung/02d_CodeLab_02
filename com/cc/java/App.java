package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        // EmpfangeDaten
    String [] [] mitarbeiterArray = {{"Henry","Ford","CEO","1890"},{"Bill","Gates","CIO","1989"},{"Elon","Musk","CD","2013"}};
        
        // Erzeuge Speicher für Instanzen
    Mitarbeiter [] mitarbeiter;
    mitarbeiter = new Mitarbeiter [mitarbeiterArray.length];
    
    for (int i = 0; i < mitarbeiterArray.length; i++) {
        // Erzeuge Instanzen
        mitarbeiter [i] = new Mitarbeiter(null, null, null, i);

        // Übernehme Werte in die Instanzen
        mitarbeiter[i].setFirstName(mitarbeiterArray[i][0]);
        mitarbeiter[i].setFamilyName(mitarbeiterArray[i][1]);
        mitarbeiter[i].setRole(mitarbeiterArray[i][2]);
        mitarbeiter[i].setYearOfEntry(Integer.parseInt(mitarbeiterArray[i][3]));

                // Abruf Werte
                output(mitarbeiter[i].getInfo());
            }
       } 

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }
}


