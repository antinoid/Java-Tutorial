package theorie.vererbung;

/* Abstrakte Basis-Klasse für Auto und LkW
 * abstrakte Klassen können nicht instanziiert werden
 * new Fahrzeug() ist nicht möglich
 */
public abstract class Fahrzeug {

    String marke;
    int PS;
    int sitze;
    
    public Fahrzeug(String marke) {
        this.marke = marke;
    }
}