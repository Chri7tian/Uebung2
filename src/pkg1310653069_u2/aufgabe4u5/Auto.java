package pkg1310653069_u2.aufgabe4u5;

public class Auto extends Fahrzeug implements Comparable<Auto> {

    private boolean klimaanlage;
    private short airbags;
    private color farbe;
    
    public enum color {SILVER, RED, BLACK, BLUE, WHITE};

    //Konstruktor
    public Auto(short reifen, color farbe, short ps, short tueren, short airbags) {
        super(reifen, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
        this.farbe = farbe;
    }
    
    //Konstruktor, wenn keine Farbe
    public Auto(short reifen, short ps, short tueren, short airbags) {
        super(reifen, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
        this.farbe = farbe.SILVER;
    }
    
    void klimaanlageAn() {
        if (klimaanlage) {
            System.err.println("Klimaanlage läuft bereits");
        } else {
            klimaanlage = true;
        }
    }

    void klimaanlageAus() {
        if (klimaanlage) {
            klimaanlage = false;
        } else {
            System.err.println("Klimaanlage bereits aus");
        }
    }

    //Beginn getter und setter
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
    
    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+this.getPs()+" und fährt mit "+this.getGeschwindigkeit()+" km/h";
    }

    @Override
    public int compareTo(Auto o) {
        if (this.getPs() == o.getPs()) {
            return 0;
        }
        else if (this.getPs() > o.getPs()) {
            return 1;
        }
        else {
            return -1;
        }

    }

    



}
