/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class ResizableCircle extends Circle2 implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }
    
    @Override
    public void resizable(int percent) {
        this.radius *= (double)percent / 100;
    }
    
    public String toString(){
        return "---------------------\n" + super.toString() + "\n---------------------";
    }
}
