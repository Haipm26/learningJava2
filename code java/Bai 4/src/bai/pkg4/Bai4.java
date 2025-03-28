/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        outer : for (int i = 0; i <= 3; i++){
//            System.out.println("ABC");
//            for(int j = 0; j <= 5; j++){
//                System.out.println(i + " " + j);
//                if (j == 3){
//                    break outer;
//                }
//            }
//            System.out.println("XYZ");
//        } 
//    }
    
    // return ket thuc
        
    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       for (int i = 0; i < 5; i++){
           for (int j = 0; j < 5; j++){
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }
}
