package pkg1310653069_u2.aufgabe4u5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf {
    
    public static void main(String[] args) {
        //Auto mit Farbe (Aufgabe 5)
        Auto bmw = new Auto((short)4, Auto.color.BLACK, (short)220, (short)5, (short)4);
        System.out.println(bmw.toString());
        System.out.println(bmw.getFarbe());
        //Auto ohne Farbe (Aufgabe 5)
        Auto bmw2 = new Auto((short)4, (short)220, (short)5, (short)4);
        System.out.println(bmw2.toString());
        System.out.println(bmw2.getFarbe());
        Auto audi = new Auto((short)4, Auto.color.BLACK, (short)180, (short)5, (short)8);
        System.out.println(audi.toString());
        Auto audi2 = new Auto((short)4, Auto.color.BLUE, (short)260, (short)5, (short)4);
        Auto audi3 = new Auto((short)4, Auto.color.RED, (short)100, (short)5, (short)2);
        Auto audi4 = new Auto((short)4, Auto.color.WHITE, (short)150, (short)5, (short)6);
        Wasserfahrzeug titanic = new Wasserfahrzeug((short)0, "blau", (short)51000, (short)0, 10.54, (short)3, (short)100000);
        System.out.println(titanic.toString()); 
        
        //für Aufgabe 4
        List<Auto> liste = new ArrayList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);
        for (Auto a : liste) {
            System.out.println(a);
        }  
    }
}
