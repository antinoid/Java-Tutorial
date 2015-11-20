package projects.calculus;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/* Die View unseres Taschenrechners
 * Graphische Oberfläche für den Benutzer
 * - Benutzereingaben an den Controller geben
 * - Methoden um Anweisungen des Controllers auszugeben
 */
public class CalculusView {

    // Das Fenster (Bilderrahmen)
    private JFrame frame;
    // Das Panel (Leinwand)
    private JPanel panel;
    
    // Ausgabenfeld der berechneten Werte
    private JTextField output;
    // Eingabefeld für Ausdruck der berechnet werden soll
    private JTextField input;
    // Button mit dem ein Event im Controller ausgelöst wird
    private JButton solveButton;
    
    // Konstruktor
    public CalculusView() {
        // Fenster erzeugen
        createFrame();
        
        // Panel - Objekt erzeugen
        panel = new JPanel();
        
        // Textfeld - Objekt erzeugen
        output = new JTextField(25);
        // output - Textfeld nicht editierbar
        output.setEditable(false);
        // Schreibweise von rechts
        output.setHorizontalAlignment(JTextField.RIGHT);
        
        input = new JTextField(25);
        input.setHorizontalAlignment(JTextField.RIGHT);
        
        solveButton = new JButton("solve");
        
        // GUI - Elemente zum panel hinzufügen
        panel.add(output);
        panel.add(input);
        panel.add(solveButton);
        
        // Panel zum frame hinzufügen
        frame.add(panel);
        // Frame erst sichtbar machen
        frame.setVisible(true);
    }
    
    // String der in input steht zurückgeben
    public String getExpression() {
        return input.getText();
    }
    
    // String in output schreiben
    public void setSolution(String s) {
        output.setText(s);
    }
    
    // Fehlermeldung ausgeben
    public void displayError() {
        output.setText("enter valid equation");
    }
    
    // Listener für Button übergeben
    public void addButtonListener(ActionListener listener) {
        solveButton.addActionListener(listener);
    }
    
    private void createFrame() {
        // neues Frame - Objekt mit Titel Calculus erzeugen
        frame = new JFrame("Calculus");
        // Breite 300, Höhe 300
        frame.setSize(300, 300);
        // Programm beenden wenn Fenster geschlossen wird
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Fenster mittig ausrichten
        frame.setLocationRelativeTo(null);
    }
}