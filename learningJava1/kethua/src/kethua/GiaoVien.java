/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class GiaoVien extends Person2 {
    private String khoa;
    private long luong;

    public GiaoVien( String id, String name, String ngaySinh, String diaChi, String khoa, long luong,String lop) {
        super(id, name, ngaySinh, diaChi, lop);
        this.khoa = khoa;
        this.luong = luong;
    }
    
    public String toString(){
        return super.toString() + " " + khoa + " " + luong;
    }
}
