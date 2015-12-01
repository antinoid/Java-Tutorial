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

    private float time = 0;
    private Timer timer;
    
    public Panel() {
        initTimer();
    }
    
    public void maleAufPanel(Graphics g) {
        
        int red = (int)time;
        int green = (int)(time*6);
        int blue = (int)(time*22);
        
        for (int y = 0; y < getHeight(); y++) {
            
            for (int x = 0; x < getWidth(); x++) {
                red += x;
                green /= x+1;
                Color color = new Color(red%254, green%255, blue%255);
                drawPixel(g, x, y, color);
            }
        }
        
        g.dispose();
    }    
    
    private void initTimer() {
        timer = new Timer(200, this);
        timer.start();
    }
    
    private void drawPixel(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        g.drawLine(x, y, x, y);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        maleAufPanel(g);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        time += 0.2;
        //System.out.println("time: " + time + " sec");
        repaint();
    }
}
