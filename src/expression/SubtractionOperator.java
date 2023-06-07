package expression;

public class SubtractionOperator implements Operator {
    @Override
    public double doOperator(Evaluable leftOperator, Evaluable rightEvaluate) {
        return leftOperator.evaluate() - rightEvaluate.evaluate();
    }
}
