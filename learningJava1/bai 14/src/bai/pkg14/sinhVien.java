/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg14;

/**
 *
 * @author Pham Minh Hai
 */
public class sinhVien {
    // attribute
    private String name;
    private String lop;
    private double gpa;
    // static
    private static int cntSv = 0;
    
    
    sinhVien(){
        ++this.cntSv;
    }
    
//    sinhVien(String ten, String wLop, double diem){
//        name = ten;
//        lop = wLop;
//        gpa = diem;
//    }
    
    // con cho this
    sinhVien(String name, String lop, double gpa){
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;
        ++this.cntSv;
    }
    
    
    // getter 
    public double getGpa(){
        return this.gpa;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCntSv(){
        return this.cntSv;
    }
    
    // get static
    public static int getCnt(){
        return cntSv;
    }
    
    // setter 
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    
    // toString
    public String toString(){
        return name + " " + lop + " " + gpa;
    }
    
    
    
    // method
    public void speak(){
        System.out.println("FVCK");
    }
    public void smile(){
        System.out.println("hehe");
    }
    public void info(){
        System.out.print(name + " " + lop + " " + gpa);
    }
}
