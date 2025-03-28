/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Circle {
    private String color;
    protected double r;
    protected double pi = 3.14;

    public Circle(String color, double r) {
        this.color = color;
        this.r = r;
    }

    public String getColor() {
        return color;
    }
    
    public double area(){
        return pi * r * r;
    }
    
    public String toString(){
        return "Color : " + this.color + "\n";
    }
}
