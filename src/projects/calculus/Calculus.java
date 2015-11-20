package projects.calculus;

// Taschenrechner im Model - View - Controller Design Pattern
public class Calculus {

    public static void main(String[] args) {
        // view - Objekt erzeugen
        CalculusView view = new CalculusView();
        // model - Object erzeugen
        CalculusModel model = new CalculusModel();
        // controller - Objekt erzeugen und view und model als Parameter übergeben
        CalculusController controller = new CalculusController(view, model);
    }
}