package kapselung;

/*
 * Kapselung beschreibt die Trennung zwischen 
 */
public class Fahrer {
    
    Auto auto;
    
    public Fahrer(Auto auto) {
        this.auto = auto;
    }
    
    
    public void gibGas() {
        //auto.speed += 10;
    }
    
    public void brems() {
        //auto.speed -= 10;
    }
}
