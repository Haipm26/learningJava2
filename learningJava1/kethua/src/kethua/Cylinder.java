/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Cylinder extends Circle {
    private double h;

    public Cylinder(String color, double r, double h) {
        super(color, r);
        this.h = h;
    }
    
    public double volume(){
        return super.area() * this.h;
    }
    
    public String toString(){
        return super.toString() + "Height : " + this.h + "\n" + "Radius : " + this.r + "\n" + "Volume : " + volume() + "\n-------------------";
    }
}
