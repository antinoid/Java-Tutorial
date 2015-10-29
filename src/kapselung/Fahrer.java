package kapselung;

/**
 *
 * @author kothieringer
 */
public class Fahrer {

    Auto auto;
    
    public Fahrer(Auto auto) {
        this.auto = auto;
    }
    
    /* Hier manipulieren wir nicht direkt die speed Variable von Auto, sondern
     * sagen dem Auto es soll beschleunigen
     * Vgl: wäre speed public könnten wir direkt den Zustand des Autos ändern
     * Die Klasse Auto soll aber selbst über seinen Zustand bestimmen
     */
    public void gibGas() {
        
        // Beispiel wenn speed public wäre
        //auto.speed = -400;   
        
        // gut, da der Zustand des Autos über sein Verhalten (Schnittstellen)
        // gesteuert wird
        auto.beschleunige();
    }
    
    public void brems() {
        auto.brems();
    }
}
