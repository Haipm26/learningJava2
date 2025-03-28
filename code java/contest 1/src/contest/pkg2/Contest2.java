/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest.pkg2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Contest2 {

    /**
     * @param args the command line arguments
     */
    // Bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x;
//        x = sc.nextInt();
//        System.out.println((long)(Math.pow(x, 3) + 3 * Math.pow(x, 2) + x + 1));
//    }
    
    // Bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a, b, c;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        System.out.println((long)a * (b + c) + (long)b * (a + c));
//    }
    
    // Bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int c;
//        c = sc.nextInt();
//        System.out.printf("%.2f", (float)c * 9 / 5 + 32);
//    }
    
    //Bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int r;
//        r = sc.nextInt();
//        double pi = 3.14;
//        System.out.printf("%.4f %.4f", 2 * pi * r, pi * r * r);
//    }
    
    // Bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x1, y1, x2, y2;
//        x1 = sc.nextInt();
//        y1 = sc.nextInt();
//        x2 = sc.nextInt();
//        y2 = sc.nextInt();
//        System.out.printf("%.2f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
//    }
    
    // Bai 6 lam roi
    // Bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a / b * b + "\n" + (a + b - 1) / b * b);
//    }
    
    // Bai 8
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        if (b != 0){
//            System.out.println((double)a / b);
//        }else{
//            System.out.println("INVALID");
//        }
//    }
    
    // Bai 9 lam roi
    // Bai 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (b + c > a) && (c + a > b)){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");   
//        }
//    }
    
    // Bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a > 0 && b > 0 && c > 0){
//            if (a == b && b == c){
//                System.out.println("1");
//            }else if((a == b) || (b == c) || (c == a)){
//                System.out.println("2");
//            }else if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c || Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)) == a || Math.sqrt(Math.pow(c, 2) + Math.pow(a, 2)) == b){
//                System.out.println("3");
//            }else{
//                System.out.println("4");
//            }
//        }else{
//            System.out.println("INVALID");
//        }
//    }
    
    // Bai 12 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int date = sc.nextInt();
//        int year = sc.nextInt();
//        if ((date <= 12 && date >= 1)){
//            if (date == 1 && date == 3 && date == 5 && date == 7 && date == 8 && date == 10 && date == 12){
//                System.out.println("31");
//            }else if (date == 2){
//                if (year % 4 == 0){
//                    System.out.println("29");
//                }else{
//                    System.out.println("28");
//                }
//            }else{
//                System.out.println("30");
//            }
//        }else{
//            System.out.println("INVALID");
//        }
//    }
    
    // Bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int y = n / 365;
//        n %= 365;
//        int w= n / 7;
//        n %= 7;
//        System.out.println(y + " " + w + " " + n);
//    }
    
    //Bai 14 lam roi
    // Bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int price = 0;
//        while (n >= 2){
//            if (2 * a <= b){
//                n -= 2;
//                price += 2 * a;
//            }else{
//                n -= 2;
//                price += b;
//            }
//        }
//        if (n != 0){
//            n -= 1;
//            price += a;
//        }
//        System.out.println(price);
//    }
    // Bai 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), a = sc.nextInt(), b = sc.nextInt();
        if (a <= b / 2){
            System.out.println(n * a);
        }else{
            if (n % 2 == 0){
                System.out.println(n / 2 * b);
            }else{
                System.out.println((n - 1) / 2 * b + a);
            }
        }
    }
    
    
    // Bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = sc.nextLine().charAt(0);
//        if ('a' <= c && c <= 'z'){
//            if (c == 'z'){
//                System.out.println("a");
//            }else{
//                c += 1;
//                System.out.println(c);
//            }
//        }else{
//            if (c == 'Z'){
//                System.out.println("a");
//            }else{
//                c += 33;
//                System.out.println(c);
//            }
//        }
//    }
    
    // Bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c = sc.nextLine().charAt(0);
//        if ('0' <= c && c <= '9'){
//            System.out.println("DIGIT");
//        }else if ('a' <= c && c <= 'z'){
//            System.out.println("LOWER");
//        }else if ('A' <= c && c <= 'Z'){
//            System.out.println("UPPER");
//        }else{
//            System.out.println("Special");
//         }
//    }
    
    // Bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c;
//        c = sc.nextLine().charAt(0);
//        if ('a' <= c && c <= 'z'){
//            System.out.println((char)(c - 32));
//        }else if ('A' < c && c < 'Z'){
//            System.out.println((char)(c + 32));
//        }else{
//            System.out.println(c);
//        }
//    }
    
    // Bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, m;
//        m = sc.nextInt();
//        n = sc.nextInt();
//        int res = 0;
//        if (m % 2 == 0){
//            res = (m / 2) * n;
//        }else{
//            res = (m / 2) * n + n / 2;
//        }
//        System.out.println(res);
//    }
    
    // Bai 20
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long m = sc.nextInt();
//        long n = sc.nextInt();
//        long a = sc.nextInt();
//        double l, w;
//        w = Math.ceil((double)m / a);
//        l = Math.ceil((double)n / a);
//        System.out.println((long)(w * l));
//    }
    
     // Bai 21
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a, b, k;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        k = sc.nextInt();
//        int res = 0;
//        if (k % 2 == 0){
//            res = (a - b) * (k / 2);
//        }else{
//            res = (a - b) * (k / 2) + a;
//        }
//        System.out.println(res);
//    }
    
    // Bai 22
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long s = sc.nextLong();
//        long res = 0;
//        if (s % n == 0){
//            res = s / n;
//        }else{
//            res = s / n + 1;
//        }
//        System.out.println(res);
//    }
    
    // Bai 23
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int max = 0;
//        if (n % 2 == 0){
//            max = (n / 2 + m - 1) / m * m;
//        }else{
//            max = (n / 2 + 1 + m - 1) / m * m;
//        }   
//        System.out.println(max);
//    }
    
    // Bai 24
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int d1, d2, d3;
//        d1 = sc.nextInt();
//        d2 = sc.nextInt();
//        d3 = sc.nextInt();
//        int res = 0;
//        if (d1 <= d2){
//            res += d1;
//            res += d3;
//            if (d1 + d3 <= d2){
//                res += d1 + d3;
//            }else{
//                res += d2;
//            }
//        }else{
//            res += d2;
//            res += d3;
//            if (d1 >= d2 + d3){
//                res += d2 + d3;
//            }else{
//                res += d1;
//            }
//        }
//        System.out.println(res);
//    }
    
    // Bai 25
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        n = sc.nextInt();
//        int res = 0;
//        res += (n / 100);
//        n %= 100;
//        res += (n / 20);
//        n %= 20;
//        res += (n / 10);
//        n %= 10;
//        res += (n / 5);
//        n %= 5;
//        res += n;
//        System.out.println(res);
//    }
    
    // Bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long a, b, c, d;
//        a = sc.nextLong();
//        b = sc.nextLong();
//        c = sc.nextLong();
//        d = sc.nextLong();
//        System.out.println(Math.min(a, Math.min(b, Math.min(c, d))));
//        System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
//    }
    
    // Bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        double a = sc.nextDouble();
//        System.out.println(Math.round(a));
//    }
    
    // Bai 28
//        public static void main(String[] args) {
//            int n, u1, d;
//            Scanner sc = new Scanner(System.in);
//            n = sc.nextInt();
//            u1 = sc.nextInt();
//            d = sc.nextInt();
//            System.out.println((2 * u1 + (n - 1) * d) * n / 2);
//        }
    
    // Bai 29
//    public static void main(String[] args) {
//        int a, b, c, d;
//        Scanner sc = new Scanner (System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        d = sc.nextInt();
//        if (b / a == c / b && c / b == d / c){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // Bai 30
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(((n - 1) * n) / 2);
//    }
    
    // PROBLEM E
//    public static void main(String[] args) {
//        int a, b, c;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        if (a == 0){
//            if (b == 0 && c == 0){
//                System.out.println("VO SO NGHIEM");
//            }else if (b == 0 && c != 0){
//                System.out.println("VO NGHIEM");
//            }else{
//                System.out.println(-c / a);
//            }
//        }else{
//            int delta = (int) (Math.pow(b, 2) - 4 * a * c);
//            if (delta < 0){
//                System.out.println("VO NGHIEM");
//            }else if(delta == 0){
//                System.out.println(-b / (2 * a));
//            }else{
//                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
//                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
//                System.out.printf("%.2f %.2f", x1, x2);
//            }
//        }
//    }
}




 