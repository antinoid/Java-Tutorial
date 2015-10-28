package objektmodellierung;

/**
 *
 * @author d
 */
public class Zeichenfeld {

    // Eigenschaften
    
    // Breite
    private int width;
    // Höhe
    private int height;
    // Zweidimensionaler Array, der die Zeichen enthält
    private Zeichen[][] zeichen;
    
    public Zeichenfeld() {
        this.width = 5;
        this.height = 5;
        this.zeichen = new Zeichen[width][height];
    }
    
    public Zeichenfeld(int width, int height) {
        this.width = width;
        this.height = height;
        this.zeichen = new Zeichen[width][height];
    }
    
    /**
     * Füllt das Zeichenfeld
     * Standard char ist '#'
     */
    public void fill() {
        fill('#');
    }
    
    /**
     * Füllt das Zeichenfeld
     * @param c char mit dem das Zeichenfeld gefüllt wird
     */
    public void fill(char c) {
        System.out.println("Fülle Zeichenfeld mit " + c);
        
        // Schleife für die Reihen
        for(int y = 0; y < height; y++) {
            
            // Schleife für die einzelnen Elemente einer Reihe
            for(int x = 0; x < width; x++) {
                
                zeichen[x][y] = new Zeichen(c);
            }
        }
    }
    
    /**
     * gibt das Zeichenfeld aus
     */
    public void print() {
        
        // Schleife für die Reihen
        for(int y = 0; y < height; y++) {
            
            // Schleife für die einzelnen Elemente einer Reihe
            for(int x = 0; x < width; x++) {
                
                char c = zeichen[x][y].getSign();
                // !! Hier print() statt println verwenden
                System.out.print(c);
            }
            
            // neue Zeile sobald eine neue Reihe beginnt
            System.out.println();
        }
    }
}