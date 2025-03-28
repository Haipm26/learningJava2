/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Rectangle1 extends Geometric {
    private double width;
    private double length;

    public Rectangle1(double width, double length) {
        this.length = Math.max(width, length);
        this.width = Math.min(width, length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
    
    public String toString(){
        return "-----------------------\nWidth : " + String.format("%.2f", width) + "\n" + "Length : " + String.format("%.2f", length) + "\n" + super.toString();
    }
}
