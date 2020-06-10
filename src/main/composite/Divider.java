package main.composite;

public class Divider extends BinaryExpression
{
    public Divider(Expression left, Expression right)
    {
        super(left, right);
    }
    
    @Override
    public double getValue()
    {
        return left.getValue() / right.getValue();
    }
}
