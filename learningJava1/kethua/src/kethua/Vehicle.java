/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Vehicle {
    private String id;
    private String name;
    private String hang;
    private String mau;
    private int gia;

    public Vehicle(String id, String name, String hang, String mau, int gia) {
        this.id = id;
        this.name = name;
        this.hang = hang;
        this.mau = mau;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public int getGia() {
        return gia;
    }
    
    public String toString(){
        return id + " " + name + " " + hang + " " + mau;
    }
}
