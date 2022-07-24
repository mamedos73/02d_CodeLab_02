package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Erik", "Krone", "Meneger", 2003);
        output("Name: " + mitarbeiter1.getInfo("#name"));
        output("Vorname: " + mitarbeiter1.getInfo("#familyName"));
        output("Funktion: " + mitarbeiter1.getInfo("#role"));
        output("Eintrittsjahr: " + mitarbeiter1.getInfo("#yearOfEntry"));

        output("---------------------");

        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Alex", "Malder", "Kaufmann", 2015);
        output("Name: " + mitarbeiter2.getInfo("#name"));
        output("Vorname: " + mitarbeiter2.getInfo("#familyName"));
        output("Funktion: " + mitarbeiter2.getInfo("#role"));
        output("Eintrittsjahr: " + mitarbeiter2.getInfo("#yearOfEntry"));

        output("---------------------");
 
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Lara", "Silber", "Geschäftsführer", 1995);
        output("Name: " + mitarbeiter3.getInfo("#name"));
        output("Vorname: " + mitarbeiter3.getInfo("#familyName"));
        output("Funktion: " + mitarbeiter3.getInfo("#role"));
        output("Eintrittsjahr: " + mitarbeiter3.getInfo("#yearOfEntry"));

        output("---------------------");
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

