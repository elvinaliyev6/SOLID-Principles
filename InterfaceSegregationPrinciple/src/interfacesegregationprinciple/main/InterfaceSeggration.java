/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesegregationprinciple.main;

import interfacesegregationprinciple.classes.Circle;
import interfacesegregationprinciple.classes.Square;
import interfacesegregationprinciple.classes.Rectangle;

/**
 *
 * @author Elvin Aliyev
 */
public class InterfaceSeggration {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        Square s = new Square(15);
        Circle c = new Circle(2);
        System.out.println("Rectangle area:"+r.getArea());
        System.out.println("Square area:"+s.getArea());
        System.out.println("Circle area:"+c.getArea());
    }
}
