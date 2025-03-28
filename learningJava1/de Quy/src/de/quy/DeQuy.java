/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de.quy;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class DeQuy {

    // bai 1
//    public static int S(int n){
//        if (n == 0){
//            return 0;
//        }
//        else{
//            return n + S(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(S(n));
//    }
    
    
    // bai 2
//    public static long S(int n){
//        if (n == 0){
//            return 0;
//        }else{
//            return (long)Math.pow(n, 2) + S(n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(S(n));
//    }
    
    // bai 3
//    public static long S (int n){
//        if (n == 1){
//            return 1;
//        }else{
//            return (long)Math.pow(n, 3) + S(n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(S(n));
//    }
    
    
    // Bai 4
//    public static int S(int n){
//        if (n == 1){
//            return -1;
//        }else{
//            return (int)Math.pow(-1, n) * n + S(n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(S(n));
//        
//    }
    
    // bai 5
//    public static long gt(int n){
//        if (n == 0){
//            return 1;
//        }else{
//            return n * gt(n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(gt(n));
//    }
    
    // bai 6
//    public static long fibo(int n){
//        if (n == 1){
//            return 0;
//        }else if(n == 2){
//            return 1;
//        }else{
//            return fibo(n - 2) + fibo(n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(fibo(n));
//    }
    
    // baii 7
//    public static int C(int k, int n){
//        if (k == n || k == 0){
//            return 1;
//        }else{
//            return C(k - 1, n - 1) + C(k, n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int k = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(C(k, n));
//    }
    
    // bai 8
//    public static int gcd(int a, int b){
//        if (b == 0){
//            return a;
//        }else{
//            return gcd(b, a % b);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(gcd(a, b));
//        System.out.println(a / gcd(a, b) * b);
//    }
    
    // bai 9
//    public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (b % 2 == 0){
//            System.out.println((int)Math.pow(Math.pow(a, b / 2) % 1000000007, 2) % 1000000007);
//        }else{
//            System.out.println((int)Math.pow(Math.pow(a, b / 2) % 1000000007, 2) % 1000000007 * a % 1000000007);
//        }
//    }
    
    
    // bai 9 dung de quy
//    public static int mod = 1000000007;
//    
//    public static long binPow(long a, long b){
//        if (b == 0) return 1;
//        long X = binPow(a, b / 2);
//        if (b % 2 == 0){
//            return (X % mod) * (X % mod) % mod;
//        }else{
//            return (X % mod) * (X % mod) * (a % mod) % mod;
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        System.out.println(binPow(a, b));
//    }
    
    // bai 10
//    public static double S (int n){
//        if (n == 1) return 1;
//        else{
//            return 1 / (double)n + S(n - 1);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.printf("%.3f", S(n));
//    }
    
    
    // bai 11
//    public static void convert(int n){
//        if (n < 2){
//            System.out.print(n);
//        }else{
//            convert(n / 2);
//            System.out.print(n % 2);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        convert(n);
//    }
    
//    // bai 12
//    public static void convert(long n){
//        if (n < 10){
//            System.out.print(n);
//        }else if (n >= 10 && n < 16){
//            if (n == 10) System.out.print("A");
//            if (n == 11) System.out.print("B");
//            if (n == 12) System.out.print("C");
//            if (n == 13) System.out.print("D");
//            if (n == 14) System.out.print("E");
//            if (n == 15) System.out.print("F");
//        }else{
//            convert(n / 16);
//            long tmp = n % 16;
//            if (tmp < 10) System.out.print(tmp % 16);
//            if (tmp == 10) System.out.print("A");
//            if (tmp == 11) System.out.print("B");
//            if (tmp == 12) System.out.print("C");
//            if (tmp == 13) System.out.print("D");
//            if (tmp == 14) System.out.print("E");
//            if (tmp == 15) System.out.print("F");
//        }
//    }
    
    // he 16 code hay hon
//    public static void he16(int n){
//        if (n == 0){
//            return;
//        }else{
//            he16(n / 16);
//            if (n % 16 < 10){
//                System.out.print(n % 16);
//            }else{
//                System.out.print((char)(n % 16 + 55));
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        he16(n);
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        convert(n);
//    }
    
    
    // bai 13
//    public static long sumDigit(long n){
//        if (n < 10){
//            return n;
//        }else{
//            return n % 10 + sumDigit(n / 10);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        System.out.println(sumDigit(n));
//    }
    
    // bai 14
//    public static int cntDigit(long n){
//        if (n < 10){
//            return 1;
//        }else{
//            return 1 + cntDigit(n / 10);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        System.out.println(cntDigit(n));
//    }
    
    // bai 15
//    public static void lastDigit(long n){
//        if (n < 10){
//            System.out.println(n);
//        }else{
//            lastDigit(n / 10);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        lastDigit(n);
//    }
    
    // bai 16
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        int max = 0;
//        int min = 10000;
//        while (n >= 1){
//            max = Math.max(max, (int)n % 10);
//            min = Math.min(min, (int)n % 10);
//            n /= 10;
//        }
//        System.out.println(max + " " + min);
//    }
    
    // de quy tim so lon nhat nho nhat
//        public static int max(int n){
//            if (n < 10){
//                return n;
//            }
//            return Math.max(n % 10, max(n / 10));
//        }
//        
//        public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(max(n));
//    }
    // bai 17
//    public static void lr(long n){
//        if (n < 10){
//            System.out.print(n + " ");
//        }else{
//            lr(n / 10);
//            System.out.print(n % 10 + " ");
//        }
//    }
//    
//    public static void rl(long n){
//        if (n < 10){
//            System.out.print(n + " ");
//        }else{
//            System.out.print(n % 10 + " ");
//            rl(n / 10);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        lr(n);
//        System.out.println(" ");
//        rl(n);
//    }
    
    // bai 18
//    public static long sumOdd(long n){
//        if (n < 10){
//            if (n % 2 != 0){
//                return n;
//            }else{
//                return 0;
//            }
//        }
//        if (n % 10 % 2 != 0){
//            return n % 10 + sumOdd(n / 10);
//        }else{
//            return sumOdd(n / 10);
//        }
//    }
//    
//    public static long sumEven(long n){
//        if (n < 10){
//            if (n % 2 == 0){
//                return n;
//            }else{
//                return 0;
//            }
//        }
//        if (n % 10 % 2 == 0){
//            return n % 10 + sumEven(n / 10);
//        }else{
//            return sumOdd(n / 10);
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        System.out.print(sumEven(n));
//        System.out.println(" ");
//        System.out.print(sumOdd(n));
//    }
    
    // bai 19
//    public static boolean checkEven(long n){
//        while (n >= 1){
//            if ((n % 10) % 2 != 0){
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        if (checkEven(n)) System.out.println("YES");
//        else System.out.println("NO");
//    }
    
     
        // bai 20 trong vid
    public static int solve(int n){
        if (n == 1) return 0;
        else{
            int x = 1000000007, y = 1000000007, z = 1000000007;
            if (n % 3 == 0){
                x = 1 + solve(n / 3);
            }
            if (n % 2 == 0){
                y = 1 + solve(n / 2);
            }
            if (n > 1){
                z = 1 + solve(n - 1);
            }
            return Math.min(x, Math.min(y, z)); 
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
    
    
}
    
