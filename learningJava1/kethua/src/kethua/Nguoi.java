/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author Pham Minh Hai
 */
public class Nguoi {
    private String name;
    private String address;

    public Nguoi(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "-----------------\n" + "FULL Name : " + this.name + "\n" + "ADDRESS : " + this.address;
    }
}
