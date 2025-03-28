/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2;

/**
 *
 * @author Pham Minh Hai
 */
public class SinhVien {
    private int id;
    private String name;
    private String lop;
    private MonHoc[] mon;
    private int soMon;

    public SinhVien(int id, String name, String lop, MonHoc[] mon, int soMon) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.mon = mon;
        this.soMon = soMon; 
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public MonHoc[] getMon() {
        return mon;
    }

    public void setMon(MonHoc[] mon) {
        this.mon = mon;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }
    
    public double gpa (){
        int soTc = 0;
        double tongDiem = 0;
        for (int i = 0; i < soMon; i++){
            tongDiem += (mon[i].getDiem() * mon[i].getTc());
            soTc += mon[i].getTc();
        }
        return tongDiem / soTc;
    }
    
    public String toString(){
        return "SV" + this.id + " " + this.name + " " + this.lop + " " + String.format("%.2f", gpa()) + "\n------------------------";
    }
}
