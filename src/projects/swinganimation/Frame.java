package projects.swinganimation;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author da
 */
public class Frame extends JFrame {
        
    public Frame(Dimension dim, String title) {
        super(title);
        initUI(dim);
    }
    
    private void initUI(Dimension dim) {
        add(new Panel());
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Frame frame = new Frame(new Dimension(800, 600), "Swing Animation");
        frame.setVisible(true);
    }
}
