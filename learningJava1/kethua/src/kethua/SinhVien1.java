/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class SinhVien1 extends Person2 {
    private double gpa;

    public SinhVien1(String id, String name, String ngaySinh, String diaChi, String lop, double gpa) {
        super(id, name, ngaySinh, diaChi, lop);
        this.gpa = gpa;
    }
    
    public String toString(){
        return super.toString() + " " + String.format("%.2f", gpa);
    }
}
