package projects.bigbusiness;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author d
 */
public class BBView {

    private JFrame frame;
    private JPanel panel;
    
    private JTextField input;
    private JTextField output;
    private JButton button;
    
    public BBView() {
        createFrame();
        createPanel();
        
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public int getNumber() {
        int number = Integer.parseInt(input.getText());
        input.setText("");
        return number;
    }
    
    public void displayNumber(int number) {
        output.setText(Integer.toString(number));
    }
    
    public void addListener(ActionListener listener) {
        button.addActionListener(listener);
    }
    
    private void createFrame() {
        frame = new JFrame("BIG BUSINESS APPLICATION");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void createPanel() {
        panel = new JPanel();
        
        input = new JTextField(25);
        panel.add(input);
        
        output = new JTextField(25);
        output.setEditable(false);
        panel.add(output);
        
        button = new JButton("Button");
        panel.add(button);
    }
}
