package main.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConstantTest
{
    
    @Test
    void testValue()
    {
        double value = 3.0;
        Expression e = new Constant(value);
        Assertions.assertEquals(e.getValue(), value, 0.0);
    }
    
    @Test
    void testAdder()
    {
        double valueA = 2.0;
        double valueB = 3.0;
        Expression left = new Constant(valueA);
        Expression right = new Constant(valueB);
        Expression e = new Adder(left, right);
        
        Assertions.assertEquals((valueA + valueB), e.getValue(), 0.0);
    }
    
    @Test
    void testSubtracter()
    {
        double valueA = 2.0;
        double valueB = 3.0;
        Expression left = new Constant(valueA);
        Expression right = new Constant(valueB);
        Expression e = new Subtracter(left, right);
        
        Assertions.assertEquals((valueA - valueB), e.getValue(), 0.0);
    }
    
    @Test
    void testDivider()
    {
        double valueA = 2.0;
        double valueB = 3.0;
        Expression left = new Constant(valueA);
        Expression right = new Constant(valueB);
        Expression e = new Divider(left, right);
        
        Assertions.assertEquals((valueA / valueB), e.getValue(), 0.0);
    }
    
    @Test
    void testMultiplier()
    {
        double valueA = 2.0;
        double valueB = 3.0;
        Expression left = new Constant(valueA);
        Expression right = new Constant(valueB);
        Expression e = new Multiplier(left, right);
        
        Assertions.assertEquals((valueA * valueB), e.getValue(), 0.0);
    }
    
    @Test
    void testComplexExpression()
    {
        /**
         * (3+5)*100
         * /
         * 2+64*/
        Expression e = (new Divider(
                new Multiplier(new Adder(new Constant(3.0), new Constant(5.0)), new Constant(100.0)),
                new Adder(new Constant(2.0), new Constant(64.0)))
        );
        
        Assertions.assertEquals(e.getValue(), 12.12121212, 0.00001);
        
    }
    
    
}