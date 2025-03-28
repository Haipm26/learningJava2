/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class GiaoVien2 extends Person4 {
    private String khoa;
    private int luong;
    private String lop;

    public GiaoVien2(String id, String name, String ngaySinh, String diaChi, String khoa, int luong, String lop) {
        super(id, name, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }
    
    public String toString(){
        return super.toString() + " " + khoa + " " + luong + " " + lop;
    }
}
