package pkg1310653069_u2;

public class Main {

    public static void main(String[] args) {
        
        //für Aufgabe 2
        Mensch m = new Mensch("Christian", 21, "maennlich");
        System.out.println(m.printAll());
        
        //für Aufgabe 3
        Kind k = new Kind("Christian", "Feuchtner", 21);
        k.status();
        Student s = new Student("Christian", "Feuchtner", 21, 1310653069, "Web-Business & Technology");
        s.status();
        
    }
}