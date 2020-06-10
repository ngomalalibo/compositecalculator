package main.composite;

public class Constant implements Expression
{
    private double constant;
    
    public Constant(double constant)
    {
        this.constant = constant;
    }
    
    @Override
    public double getValue()
    {
        return this.constant;
    }
}
