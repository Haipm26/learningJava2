/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author Pham Minh Hai
 */

    // bai 21

public class DSMH {
    private int id;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;
    
    DSMH(int id, String name, String donVi, int giaMua, int giaBan){
        this.id = id;
        this.ten = name;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public int getProfit(){
        return this.giaBan - this.giaMua;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String toString(){
        return "MH" + String.format("%04d", id) + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + (giaBan - giaMua);
    }
}
