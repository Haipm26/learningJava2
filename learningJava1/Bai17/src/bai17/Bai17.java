/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new  Scanner (System.in);
        Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(x);
    }
    
}
