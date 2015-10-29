package kapselung;

/**
 *
 * @author kothieringer
 */
public class Auto {

    // Eigenschaften private deklarieren; andere Klassen haben dadurch keinen
    // direkten Lese-/Schreibzugriff
    // -> Zustand von Objekten
    private String marke;
    private int PS;
    private int speed = 0;
    
    // Konstruktor
    public Auto(String marke, int PS) {
        this.marke = marke;
        this.PS = PS;
    }
    
    // public Methode um an die private - Eigenschaft speed zu kommen
    // Andere Klassen können dadurch nur den Wert auslesen, nicht verändern
    // -> Verhalten eines Objekts
    public int getSpeed() {
        return speed;
    }
    
    public String getMarke() {
        return marke;
    }
    
    // Methoden um das Auto zu beschleunigen / bremsen
    // -> Verhalten
    public void beschleunige() {
        speed += 10;
    }
    
    public void brems() {
        if( speed <= 0 ) {
            speed = 0;
        } else {
            speed -= 10;
        }
    }
}
