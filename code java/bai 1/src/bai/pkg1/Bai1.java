/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg1;

import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Bai1 {
    public static void main(String[] args) {
//        int a = 100;
//        float b = 3.14F;
//        System.out.println("gia tri cua b la: " + a);
//        System.out.printf("gia tri cua b la: %.2f\n", b);
          Scanner sc = new Scanner(System.in);
//          a;
//          a = sc.nextInt();
//          float a = sc.nextFloat();
//          System.out.println(a);
//            char kiTu = sc.nextLine().charAt(0);
//            System.out.println(kiTu);
            int a = 10;
            int b = 5;
            System.out.println(Math.min(a, b));
            System.out.println(Math.max(a, b));
            System.out.println(Math.abs(a));
            System.out.println(Math.pow(a, b)); 
            System.out.println(Math.sqrt(a));
            System.out.println(Math.PI);
            float c = 2.5F;
            System.out.println((int)Math.ceil(c));
            System.out.println((int)Math.floor(c));
            System.out.println((int)Math.round(c));
    }  
}
