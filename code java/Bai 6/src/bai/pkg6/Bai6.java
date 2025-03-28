/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg6;

import java.util.Scanner;



public class Bai6 {
    public static int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static int gcd2(int a, int b){
        if (a == 0 || b == 0){
            System.out.println(a + b);
        }else{
            while (a != b){
                if (a > b){
                    a = a - b;
                }else{
                    b = b - a;
                }
            }
        }
        return a;
    }    
    
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b); 
    }
    
    public static void pt(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 1){
            System.out.print(n);
        }
    }
    
    public static boolean checkFibo (long n){
        if (n == 0 || n == 1){
            return true;
        }else{
            long f2 = 0, f1 = 1;
            long f;
            for (int i = 2; i <= 92; i++){
                f = f2 + f1;
                if (f == n){
                    return true;
                }
                long tmp = f1;
                f1 = f;
                f2 = tmp;
            }
        }
        return false;
    }
    
    public static void checkFibo2(long n){
        if (n <= 1){
            System.out.print("1");
        }else{
            long f2 = 1, f1 = 1;
            long f;
            for (int i = 2; i <= 92; i++){
                f = f2 + f1;
                if (f >= n){
                    System.out.print(f);
                    return;
                }
                f2 =f1;
                f1 = f;
            }
        }              
    }
    
    public static int degree(int n, int p){
        int sum = 0;
        // duyet cac boi cua p <= n
        for (int i = p; i <= n; i += p){
            int j = i;
            while (j % p == 0){
                sum += 1;
                j /= p;
            }
        }
        return sum;
    }
    
    public static int legendre(int n, int p){
        int sum = 0;
        for (int i = p; i <= n; i *= p){
            sum += n / i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), p = sc.nextInt();
        System.out.println(degree(n, p));
        System.out.println(legendre(n, p));
    }
    
    
    
}
