package pkg1310653069_u2;

public class Kind {
    
    String vorname, nachname;
    int alter;

    public Kind(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    void status() {
        System.out.println("Es handelt sich um ein Kind: "
                +this.vorname+" "+this.nachname+" "+this.alter); 
    }
}