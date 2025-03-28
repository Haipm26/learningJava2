/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai6 {
    
    public static int gcd1(int a, int b){
        while (b != 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
    
    public static int gcd2(int a, int b){
        if (a == 0 || b == 0){
            return a + b;
        }else{ 
            while (a != b){
                int r = Math.abs(a - b);
                a = Math.min(a, b);
                b = r;
            }
            return a;
        }
    }
    
    public static int lcm(int a, int b){
        return a * b / gcd1(a, b);
    }
    
    // khong hay
    public static void tsnt1(int a){
        int div = 2;
        while (a != 1){
            if (a % div == 0){
                if (a == div){
                    System.out.print(div + " ");
                    return;
                } 
                System.out.print(div + " * ");
                a /= div;
            }else{
                ++div;
            }
        }
    }

    // hay
    public static void tsnt2(int a){
        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0){
                while (a % i == 0){
                    System.out.print(i + " ");
                    a /= i;
                }
            }
        }
        if (a > 1){
            System.out.print(a);
        }
    }
    
    // fibo
    public static boolean checkfibo(long n){
        if (n == 0 || n == 1){
            return true;
        }else{
            long f1 = 1;
            long f2 = 0;
            for (int i = 2; i <= 92; i++){
                long tmp = f2 + f1;
                if (tmp == n){
                    return true;
                }
                f2 = f1;
                f1 = tmp;
            }
        }
        return false;
    }
    
    
    // bac cua tsnt trong n!
    public static long phanTich(long n, long p){
        long cnt = 0;
        for (int i = (int)p; i <= n; i += p){
            int j = i;
            while (j % p == 0){
                ++cnt;
                j /= p;
            }
        }
        return cnt;
    }
    
    // legendre
    public static int phanTich2(int n, int p){
        int sum = 0;
        for (int i = p; i <= n; i *= p){
            sum += (n / i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(gcd1(a, b));
//        System.out.println(gcd2(a, b));
//        System.out.println(lcm(a, b));
//        System.out.println(checkfibo(a));
          System.out.println(phanTich2(a, b));
    }
    
    
    
}
