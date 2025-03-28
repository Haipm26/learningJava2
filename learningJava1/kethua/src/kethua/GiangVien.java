/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class GiangVien extends Person1 {
    private String khoa;
    private long luong;

    public GiangVien( String id, String name, String ngaySinh, String diaChi, String khoa, long luong) {
        super(id, name, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
    }
    
    public String toString(){
        return super.toString() + " " + khoa + " " + luong;
    }
}
