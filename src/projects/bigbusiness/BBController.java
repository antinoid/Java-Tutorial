package projects.bigbusiness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author d
 */
public class BBController implements ActionListener {

    private BBView view;
    private BBModel model;
    
    public BBController(BBView view, BBModel model) {
        this.view = view;
        this.model = model;
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.addNumber(view.getNumber());
        view.displayNumber(model.getNumber());
    }
}
