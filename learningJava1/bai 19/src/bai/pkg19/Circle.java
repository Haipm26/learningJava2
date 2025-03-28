/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg19;

/**
 *
 * @author Pham Minh Hai
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius, String color, String filled) {
        super(color, filled);
        this.radius = radius;
    }

    
            
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
    
}
