package expression;

public class MultiplicationOperator implements Operator {
    @Override
    public double doOperator(Evaluable leftOperator, Evaluable rightEvaluate) {
        return leftOperator.evaluate() * rightEvaluate.evaluate();
    }
}
