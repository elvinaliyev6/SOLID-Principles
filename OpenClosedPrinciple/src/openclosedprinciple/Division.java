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
public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters

    public Division(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    
    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }
}
