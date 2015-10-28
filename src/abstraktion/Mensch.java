package abstraktion;

/*
 * Abstraktion beschreibt in der objektorientierten Programmierung
 * die Trennung zwischen Konzept und Umsetzung
 * Konzept - Gemeinsamkeiten
 * Umsetzung - Unterschiede
 * Eine Klasse beschreibt Gemeinsamkeiten der unterschiedlichen Objekte, zB:
 * Eigenschaften, Verhalten, wie wird das Objekt erzeugt?
 */
public class Mensch {

    // Eigenschaften der Klasse Mensch
    String name;
    int alter;
    
    public Mensch(String name) {
        this.name = name;
    }
   
    // Verhalten
    void gruss() {
        System.out.println("Hallo ich heisse " + name + " und bin " + alter + " Jahre alt");
    }
    
    public static void main(String[] args) {
        
        // erschaffen eines neuen Mensch-Objekts
        Mensch mensch1 = new Mensch("Stefan");
        mensch1.alter = 19;
        
        // erschaffen eines neuen Mensch-Objekts
        Mensch mensch2 = new Mensch("Eugen");
        mensch2.alter = 20;
        
        // Beide Objekte haben das Gleiche Verhalten
        mensch1.gruss();
        mensch2.gruss();
    }
}
