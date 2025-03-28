/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String toString(){
        return "Color : " + this.color + "\n" + "Filled : " + this.filled + "\n" + "Perimeter : " + getPerimeter() + "\n" + "Area : " + getArea() + "\n-----------------------"; 
    }
}
