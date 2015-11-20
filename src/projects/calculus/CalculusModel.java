package projects.calculus;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;

public class CalculusModel {

    public String solveExpression(String equation) throws Exception {
        IMathParser parser = MathParserFactory.create();
        parser.setExpression(equation);
        return Double.toString(parser.getValue());
    }
}
