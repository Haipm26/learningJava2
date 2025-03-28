/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baijs;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class BaiJS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = gcd(a,b);
        System.out.println(c);
        System.out.println((a / c)+ " " +(b / c));
    }
    public static long gcd(long a, long b){
         if(b ==0 ) return a;
         return gcd (b, a%b);
    }
   
    
}
