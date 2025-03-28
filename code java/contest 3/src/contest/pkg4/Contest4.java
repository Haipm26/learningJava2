/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest.pkg4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Contest4 {
   
    
    // Bai 8
    public static boolean checksnt(long n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (checksnt(i)){
                System.out.print((long)i * i + " ");
            }
        }
    }
    
    
    
}
