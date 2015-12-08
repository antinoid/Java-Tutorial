package projects.swinganimation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author da
 */
public class Panel extends JPanel implements ActionListener {

    // Variable, um Zeit zu messen
    private float time = 0;
    // Swing-Timer
    private Timer timer;
    // Eigenschaften des Balls ( X- und Y- Koordinate und Radius)
    private int ballX, ballY;
    private int ballRadius;
    
    public Panel() {
        // Hilfsfunktion für den Timer
        initTimer();
        // Balleigenschaften Werte zuweisen
        ballX = 200;
        ballY = 200;
        ballRadius = 50;
    }
    
    // unsere eigene Methode, um aufs Panel zu zeichnen
    // Das Graphics - Objekt g kann man quasi als Pinsel vorstellen
    public void maleAufPanel(Graphics g) {
        
        // Pinsel in die Farbe rot eintauchen
        g.setColor(Color.red);
        // Einen Kreis mit dem Pinsel malen
        g.fillOval(ballX, ballY, ballRadius, ballRadius);
        
        g.dispose();
    }    
    
    private void initTimer() {
        // Timer Objekt erschaffen
        // tickt alle 200 Sekunden
        // Listener für den Timer ist this, da wir ActionListener implementieren
        timer = new Timer(200, this);
        // Timer starten
        timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        maleAufPanel(g);
    }
    
    // Wird bei jedem Tick des Timers aufgerufen
    @Override
    public void actionPerformed(ActionEvent e) {
        // gemessene Zeit erhöhen und ausgeben
        time += 0.2;
        System.out.println("time: " + time + " sec");
        // Balleigenschaften ändern
        ballY++;
        ballX++;
        // Panel neu zeichnen
        repaint();
    }
}
