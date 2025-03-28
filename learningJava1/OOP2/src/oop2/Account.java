/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Account {
    
    // bai 1
//    private String maAccount;
//    private String customerID;
//    private String Username;
//    private String password;
//
//    
//    
//    public Account(String maAccount, String customerID, String Username, String password) {
//        this.maAccount = maAccount;
//        this.customerID = customerID;
//        this.Username = Username;
//        this.password = password;
//    }
//
//    public String getMaAccount() {
//        return maAccount;
//    }
//
//    public String getCustomerID() {
//        return customerID;
//    }
//
//    public String getUsername() {
//        return Username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
    
    // bai 2
//    private String ID;
//    private String customerID;
//    private String stk;
//    private String pinCode;
//    private long odd;
//
//    public Account(String ID, String customerID, String stk, String pinCode, long odd) {
//        this.ID = ID;
//        this.customerID = customerID;
//        this.stk = stk;
//        this.pinCode = pinCode;
//        this.odd = odd;
//    }
//
//    public void setID(String ID) {
//        this.ID = ID;
//    }
//
//    public void setCustomerID(String customerID) {
//        this.customerID = customerID;
//    }
//
//    public void setStk(String stk) {
//        this.stk = stk;
//    }
//
//    public void setPinCode(String pinCode) {
//        this.pinCode = pinCode;
//    }
//
//    public void setOdd(long odd) {
//        this.odd = odd;
//    }
//
//    public String getID() {
//        return ID;
//    }
//
//    public String getCustomerID() {
//        return customerID;
//    }
//
//    public String getStk() {
//        return stk;
//    }
//
//    public String getPinCode() {
//        return pinCode;
//    }
//
//    public long getOdd() {
//        return odd;
//    }
//
//    
//    
//    public String toString(){
//        return "ID : " + this.ID + "\n" + "CusID : " + this.customerID + "\n" + "Number : " + this.stk + "\n" + "PIN : " + this.pinCode + "\n" + "Balance : " + this.odd;   
//    }
    
//    private String ID;
//    private String customerID;
//    private String stk;
//    private String pinCode;
//    private int odd;
//
//    public Account(String ID, String customerID, String stk, String pinCode, int odd) {
//        this.ID = ID;
//        this.customerID = customerID;
//        this.stk = stk;
//        this.pinCode = pinCode;
//        this.odd = odd;
//    }
//
//    public String getID() {
//        return ID;
//    }
//
//    public String getCustomerID() {
//        return customerID;
//    }
//
//    public String getStk() {
//        return stk;
//    }
//
//    public String getPinCode() {
//        return pinCode;
//    }
//
//    public int getOdd() {
//        return odd;
//    }
//    
//    public void deposit(int n){
//        this.odd += n;
//    }
//    
//    public void withdraw(int n){
//        if (this.odd - 50000 >= n)    
//            this.odd -= n;
//    }
//    
//    public static int findPos(Account[]a, String s){
//        for (int i = 0; i < a.length; i++){
//            if (a[i].getStk().equals(s)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    public String toString(){
//        return "ID : " + this.ID + "\nCusID : " + this.customerID +
//        "\nNumber : " + this.stk + "\nPIN : " + this.pinCode
//        + "\nBalance : " + this.odd + "VND\n-------------------";
//    }
    
   // bai 8
    private int accountId;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.accountId = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return accountId;
    }

    public void setId(int id) {
        this.accountId = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public Account deposit(double amount){
        this.balance += amount;
        System.out.println("transaction successful");
        return new Account(accountId, customer, balance);
    }
    
    public Account withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
             System.out.println("transaction successful");
            return new Account(accountId, customer, balance);
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
            return new Account(accountId, customer, balance);
        } 
    }
    
    public String toString(){
        return "Customer ID : " + this.customer.getId() + "\n" 
                + "Full Name : " + this.customer.getName() + "\n"
                + "Gender : " + this.customer.getGender() + "\n"
                + "Account ID : " + this.accountId + "\n"
                + "Balance : " + String.format("%.2f", this.balance) + " $";
    }
}

