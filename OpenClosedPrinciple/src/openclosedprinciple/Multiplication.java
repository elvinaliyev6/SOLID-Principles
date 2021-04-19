/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclosedprinciple;

/**
 *
 * @author Elvin Aliyev
 */
public class Multiplication implements CalculatorOperation{
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters

    public Multiplication(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    
    @Override
    public void perform() {
        result=right*left;
    }
}
