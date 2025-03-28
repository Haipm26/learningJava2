/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg19;

/**
 *
 * @author Pham Minh Hai
 */
public class rectangle extends GeometricObject{

    private int length;
    private int width;

    public rectangle(int length, int width, String color, String filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    
    
    
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }
    
}
