package theorie.kapselung;


/*
 * Kapselung beschreibt die Trennung zwischen
 * Zustand und Verhalten eines Objekts
 * Zustand - Variablen/Eigenschaften
 * Verhalten - Methoden
 */
public class TestClass {
    
    public static void main(String[] args) {
        Auto auto = new Auto("Audi R8", 550);
        Fahrer stefan = new Fahrer(auto);
        
        System.out.println("auto Marke: " + auto.getMarke());
        /*
        stefan.gibGas();
        stefan.brems();
        stefan.brems();
        */
        
        
    }
}
