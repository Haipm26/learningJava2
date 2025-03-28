/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Point {
    protected float x;
    protected float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "X : " + String.format("%.2f", this.x) + "\n" + "Y : " + String.format("%.2f", this.y);
    }
}
