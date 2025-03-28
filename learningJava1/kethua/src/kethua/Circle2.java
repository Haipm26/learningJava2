/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public abstract class Circle2 implements Geometric1 {
    protected double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    public String toString(){
        return "Radius : " + String.format("%.2f", radius) + "\n" + "Perimeter : " + String.format("%.2f", getPerimeter()) + "\nArea : " + String.format("%.2f", getArea());
    }
}
