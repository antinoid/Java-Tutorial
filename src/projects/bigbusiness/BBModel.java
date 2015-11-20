package projects.bigbusiness;

/**
 *
 * @author d
 */
public class BBModel {

    private int sum = 0;
    
    public void addNumber(int number) {
        sum += number;
    }
    
    public int getNumber() {
        return sum;
    }
}
