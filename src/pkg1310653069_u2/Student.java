package pkg1310653069_u2;

public class Student extends Kind {
    
    int matrikelnummer;
    String studiengang;

    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    
    @Override
    void status() {
        System.out.println("Es handelt sich um einen Studenten: "
                +this.vorname+" "+this.nachname+" "+this.alter+" "
                +this.matrikelnummer+" "+this.studiengang);
    }
    
}