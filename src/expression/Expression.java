package expression;

public class Expression implements Evaluable {

    private Evaluable leftOperator;
    private Evaluable rightOperator;
    private Operator operator;

    public Expression(Evaluable leftOperator, Evaluable rightOperator, Operator operator) {
        this.leftOperator = leftOperator;
        this.rightOperator = rightOperator;
        this.operator = operator;
    }

    @Override
    public double evaluate() {
        return operator.doOperator(leftOperator, rightOperator);
    }
}
