/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Square extends Rectangle{
    
    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }
    
    
    
    public String toString(){
        return "-----------------------\n" + "Side : " + super.getLength() + "\n" + "Color : " + super.getColor() + "\n" + "Filled : " + super.filled + "\n" + "Perimeter : " + super.getPerimeter() + "\n" + "Area : " + super.getArea() + "\n-----------------------";
    }
    
    
}
