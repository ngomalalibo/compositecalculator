package main.composite;

public class Adder extends BinaryExpression
{
    public Adder(Expression left, Expression right)
    {
        super(left, right);
    }
    
    @Override
    public double getValue()
    {
        return left.getValue() + right.getValue();
    }
}
