/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregationprinciple.classes;

import interfacesegregationprinciple.interfaces.Area;
import interfacesegregationprinciple.interfaces.Length;

/**
 *
 * @author Elvin Aliyev
 */
public class Square implements Length,Area{
    int length;
    
    public Square(int length){
        this.length=length;
    }
    
    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
    
}
