/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author Pham Minh Hai
 */

    // bai 20

public class Time {
    private int gio = 0;
    private int phut = 0;
    private int giay = 0;
    
    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
}

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }
    
    public String toString(){
        return gio + " " + phut + " " + giay; 
    }
}
