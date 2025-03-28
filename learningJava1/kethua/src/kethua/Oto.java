/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Oto extends Xe {
    private int maLuc;
    private int gia;

    public Oto( String id, String name, String hang, String mau, int maLuc, int gia) {
        super(id, name, hang, mau);
        this.maLuc = maLuc;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }
    
    public String toString(){
        return super.toString() + " " + maLuc + " " + gia;
    }
}
