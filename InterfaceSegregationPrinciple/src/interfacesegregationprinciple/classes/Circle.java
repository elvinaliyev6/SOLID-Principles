/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregationprinciple.classes;

import interfacesegregationprinciple.interfaces.Area;
import interfacesegregationprinciple.interfaces.Radius;

/**
 *
 * @author Elvin Aliyev
 */
public class Circle implements Radius,Area{
    int radius;

    public Circle(int radius){
        this.radius=radius;
    }
    
    @Override
    public int getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return 3.14* radius * radius;
    }
}
