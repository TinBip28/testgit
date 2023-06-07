package expression;

public class DivisionOperator implements Operator {
    @Override
    public double doOperator(Evaluable leftOperator, Evaluable rightEvaluate) {
        return leftOperator.evaluate() / rightEvaluate.evaluate();
    }
}
