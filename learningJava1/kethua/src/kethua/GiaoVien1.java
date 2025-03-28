/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class GiaoVien1 extends Person3 {
    private String khoa;
    private int luong;

    public GiaoVien1(String id, String name, String birth, String diaChi, String khoa, int luong) {
        super(id, name, birth, diaChi);
        this.khoa = khoa;
        this.luong = luong;
    }
    
    public int getLuong() {
        return luong;
    }
    
    public String toString(){
        return super.toString() + " " + khoa + " " + luong;
    }
    
}
