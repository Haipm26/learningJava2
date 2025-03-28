/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg5;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Bai5 {

//    public static int nhanDoi(int x){
//        return 2 * x;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int x = sc.nextInt();
//        x = nhanDoi(x);
//        System.out.println(x);
//    }
    
    // kiem tra so nguyen to
    public static boolean check(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
}
    
    // in ra uoc va dem uoc
    public static int count(int n){
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                ++cnt;
                   if (i != n / i){
                       ++cnt;
                }
            }
        }
        return cnt;
    }
    
    public static void in(int n){
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (i != n / i){
                    System.out.print(i + " " + n / i + " ");
                }else{
                    System.out.print(i + " ");
                }
            }
        }
    }
    
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                sum += i;
                if (i != n / i){
                    sum += n / i;
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        in(n);
        System.out.println(" ");
        System.out.print(sum(n));
    }
}
