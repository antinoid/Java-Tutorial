package kapselung;

public class Auto {

    private String marke;
    private int PS;
    private int speed = 0;
    
    public Auto(String marke, int PS) {
        this.marke = marke;
        this.PS = PS;
    }
    
    // Verhalten durch eine Methode
    public String getMarke() {
        return marke;
    }
    
    //public 
}
