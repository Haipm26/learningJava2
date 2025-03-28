/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Tron extends Shape {

    private double r;

    public Tron(double r, String color, boolean filled) {
        super(color, filled);
        this.r = r;
    }
    
    
    
    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * 2 * r;
    }
    
    public String toString(){
        return "-----------------------\n" + "Radius : " + r + "\n" + super.toString();
    }
    
}
