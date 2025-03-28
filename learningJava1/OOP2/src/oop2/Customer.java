/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2;

import java.util.logging.Logger;

/**
 *
 * @author Pham Minh Hai
 */
public class Customer {
    // bai 7
//    private int customerId;
//    private String name;
//    private int discount;
//
//    public Customer(int id, String name, int discount) {
//        this.customerId = id;
//        this.name = name;
//        this.discount = discount;
//    }
//
//    public int getId() {
//        return customerId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }
    
    // bai 8
    private int id;
    private String name;
    private char gender;

    public Customer(int Id, String name, char gender) {
        this.id = Id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return this.id + " " + this.name;
    }
}
