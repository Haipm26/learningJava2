/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg19;

/**
 *
 * @author Pham Minh Hai
 */
public class Bird implements Runable, Flyable {

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
    
}
