package basicMathematicalOperations;

import java.util.function.BinaryOperator;

public class BasicOperations {

    public static Integer basicMath(String op, int v1, int v2) {

        BinaryOperator<Integer> bOperator;

        switch (op) {
            case "+":
                bOperator = (x, y) -> x + y;
                break;

            case "-":
                bOperator = (x, y) -> x - y;
                break;

            case "*":
                bOperator = (x, y) -> x * y;
                break;

            case "/":
                bOperator = (x, y) -> x / y;
                break;

            default:
                return null;
        }
        
        return bOperator.apply(v1, v2);

    }

}
