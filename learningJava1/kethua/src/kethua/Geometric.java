/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public abstract class Geometric {
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String toString(){
        return "Perimeter : " + String.format("%.2f", getPerimeter())
                + "\nArea : " + String.format("%.2f", getArea()) + "\n-----------------------" ;
    }
}
