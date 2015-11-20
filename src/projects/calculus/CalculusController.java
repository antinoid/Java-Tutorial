package projects.calculus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Controller - Klasse des Taschenrechers
public class CalculusController implements ActionListener {

    // view und model des controllers
    private CalculusView view;
    private CalculusModel model;

    // Konstruktor
    public CalculusController(CalculusView view, CalculusModel model) {
        this.view = view;
        this.model = model;
        // Listener für Button an view übergeben
        view.addButtonListener(this);
    }

    /*
     * Da wir die Schnittstelle ActionListener implementieren, müssen wir die
     * Methode actionPerfomed auch implementieren
     * Hier regelt der Controller was passiert, wenn der Button gegrückt wird
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Textfield input auslesen
        String equation = view.getExpression();
        // mit try - catch abfangen
        try {
            // input aus View an Model übergeben
            String solution = model.solveExpression(equation);
            // Ergebnis an View übergeben
            view.setSolution(solution);
        } catch (Exception ex) {
            view.displayError();
            ex.printStackTrace();
        }
    }
}
