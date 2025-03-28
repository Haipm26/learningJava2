/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Xe {
    private String id;
    private String name;
    private String hang;
    private String mau;

    public Xe(String id, String name, String hang, String mau) {
        this.id = id;
        this.name = name;
        this.hang = hang;
        this.mau = mau;
    }

    public String getHang() {
        return hang;
    }

    public String getId() {
        return id;
    }
    
    
    
    public String toString(){
        return id + " " + name + " " + hang + " " + mau;
    }
}
