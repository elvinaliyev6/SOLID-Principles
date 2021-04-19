/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregationprinciple.classes;

import interfacesegregationprinciple.interfaces.Area;
import interfacesegregationprinciple.interfaces.Length;
import interfacesegregationprinciple.interfaces.Width;

/**
 *
 * @author Elvin Aliyev
 */
public class Rectangle implements Length,Width,Area{
int length;
int width;

public Rectangle(int length,int width){
    this.length=length;
    this.width=width;
}

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    
    
    
}
