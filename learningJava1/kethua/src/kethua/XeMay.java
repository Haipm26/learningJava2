/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class XeMay extends Xe {
    private int vMax;
    private int gia;

    public XeMay( String id, String name, String hang, String mau, int vMax, int gia) {
        super(id, name, hang, mau);
        this.vMax = vMax;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }
    
    public String toString(){
        return super.toString() + " " + vMax + " " + gia;
    }
    
}
