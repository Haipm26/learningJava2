/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Car extends Vehicle {
    private int maLuc;

    public Car( String id, String name, String hang, String mau, int maLuc,int gia) {
        super(id, name, hang, mau, gia);
        this.maLuc = maLuc;
    }
    
    public String toString(){
        return super.toString() + " " + this.maLuc + " " + super.getGia();
    }
}
