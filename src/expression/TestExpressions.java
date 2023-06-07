package expression;

public class TestExpressions {
    public static void main(String[] args) {
        Evaluable one = new Operand(1);
        Evaluable two = new Operand(2);
        Evaluable three = new Operand(3);
        Evaluable four = new Operand(4);
        Evaluable add = new Expression(one, two, new AdditionOperator());
        Evaluable multi = new Expression(add,three,new MultiplicationOperator());
        Evaluable subtract = new Expression(multi,four,new SubtractionOperator());
        System.out.println(subtract.evaluate());
    }
}
