package pkg1310653069_u2.aufgabe4u5;

public class Wasserfahrzeug extends Fahrzeug {

    private double tiefgang, ladung;
    private short schrauben;

    //Konstruktor
    public Wasserfahrzeug(short reifen, String farbe, short ps, short tueren, double tiefgang, short schrauben, double ladung) {
        super(reifen, ps, tueren);
        this.tiefgang = tiefgang;
        this.ladung = ladung;
        this.schrauben = schrauben;
    }
    
    void entladen() throws InterruptedException {
        Thread.sleep(5000);
        ladung = 0;
    }
    
    //Beginn getter und setter
    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat "+this.getPs()+" PS und einen Tiefgang von "+this.getTiefgang()+" m";
    }

}
