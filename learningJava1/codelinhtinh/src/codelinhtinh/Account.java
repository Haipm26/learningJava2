/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codelinhtinh;

/**
 *
 * @author Pham Minh Hai
 */
public class Account {

    private String ID;
    private String customerID;
    private String stk;
    private String pinCode;
    private long odd;

    public Account(String ID, String customerID, String stk, String pinCode, long odd) {
        this.ID = ID;
        this.customerID = customerID;
        this.stk = stk;
        this.pinCode = pinCode;
        this.odd = odd;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setOdd(long odd) {
        this.odd = odd;
    }

    public String getID() {
        return ID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getStk() {
        return stk;
    }

    public String getPinCode() {
        return pinCode;
    }

    public long getOdd() {
        return odd;
    }

    public String toString() {
        return "ID : " + this.ID + "\n" + "CusID : " + this.customerID + "\n" + "Number : " + this.stk + "\n" + "PIN : " + this.pinCode + "\n" + "Balance : " + this.odd;
    }

}
