package projects.bigbusiness;

/**
 *
 * @author d
 */
public class BBApplication {

    public static void main(String[] args) {
        BBView view = new BBView();
        BBModel model = new BBModel();
        BBController controller = new BBController(view, model);
    }
}
