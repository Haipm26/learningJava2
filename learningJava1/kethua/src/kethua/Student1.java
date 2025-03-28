/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Student1 extends Nguoi {
    private String program;
    private int years;
    private double fee;

    public Student1(String name, String address,String program, int years, double fee) {
        super(name, address);
        this.program = program;
        this.years = years;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
    
    public String toString(){
        return super.toString() + "\n" + "Program : " + this.program + "\n" + "YEAR : " + this.years + "\n" + "FEE : " +this.fee;
    }
}
