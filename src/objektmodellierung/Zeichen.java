package objektmodellierung;

/**
 *
 * @author d
 */
public class Zeichen {

    /* Eigenschaft (Zustand) der Klasse Zeichen
     * (Konzept)
     */
    private char sign;
    
    /* Mit dem Konstruktor erschaffen wir aus der Klasse Zeichen ein
     * konkretes Zeichen-Objekt
     * (Umsetzung)
     */
    public Zeichen(char sign) {
        this.sign = sign;
    }
    
    /* Eine Methode (Verhalten), um an den Wert der sign Variable zu gelangen
     * (Umsetzung)
     */    
    public char getSign() {
        return sign;
    }
}
