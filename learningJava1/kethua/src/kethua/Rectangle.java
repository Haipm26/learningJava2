/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    
    public String toString(){
        return "-----------------------\n" + "Width : " + this.width + "\n" + "Length : " + this.length + "\n" + super.toString();
    }
    
}
