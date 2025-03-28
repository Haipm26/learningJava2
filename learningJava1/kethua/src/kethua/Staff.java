/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Staff extends Nguoi {
    private String school;
    private double pay;

    public Staff( String name, String address,String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }
    
    public String toString(){
        return super.toString() + "\n" + "School : " + this.school + "\n" + "PAY : " + this.pay;
    }
}
