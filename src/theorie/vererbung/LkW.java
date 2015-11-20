package theorie.vererbung;

/**
 *
 * @author kothieringer
 */
public class LkW extends Fahrzeug {

    // Da ein Konstruktor mit Parameter String in der abstrakten Oberklasse
    // vorgegeben ist, müssen wir diesen in den Kind-Klassen auch implementieren
    public LkW(String marke) {
        // mit super rufen wir den Eltern-Konstruktor auf
        super(marke);
    }

}
