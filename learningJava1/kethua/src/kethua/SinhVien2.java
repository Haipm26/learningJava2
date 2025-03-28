/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class SinhVien2 extends Person3 {
    
    private String lop;
    private double gpa;

    public SinhVien2(String id, String name, String birth, String diaChi, String lop, double gpa) {
        super(id, name, birth, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    
    
    
    public String toString(){
        return super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}
