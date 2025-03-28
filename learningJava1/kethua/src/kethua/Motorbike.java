/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Motorbike extends Vehicle {
    private int vMax;

    public Motorbike( String id, String name, String hang, String mau, int vMax,int gia) {
        super(id, name, hang, mau, gia);
        this.vMax = vMax;
    }
    
    public String toString(){
        return super.toString() + " " + this.vMax + " " + super.getGia();
    }
}
