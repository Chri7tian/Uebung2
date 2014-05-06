package pkg1310653069_u2;

class Mensch extends Saeugetier {
    
    String printAll() {
        return this.name+"#"+this.alter+"#"+this.geschlecht;
    }
   
        public Mensch(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
}
