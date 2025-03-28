/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest.pkg3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Contest3 {

    /**
     * @param args the command line arguments
     */
    // Bai 1 lam roi
    // Bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long sum = 0;
//        int n = sc.nextInt();
//        for (int i = 0; i <= n ; i++){
//            sum += i * i;
//        }
//        System.out.println(sum);
//    }
    
    // Bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum = 0;
//        for (int i = 1; i <= n; i++){
//            if (i % 3 == 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
    
    // Bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        double sum = 0;
//        for (int i = 1; i  <= n; i++){
//            sum += (1 / (double)i);
//        }
//        System.out.printf("%.2f", sum);
//    }
    
    // Bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        double sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum += (1 / 2 * (double)i);
//        }
//        System.out.printf("%.5f", sum);
//    }
    
    // Bai 6
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        long sum = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++ ){
//            if (n % i == 0){
//                sum += i;
    //
//                sum += n / i;
//            }
//        }
//        System.out.println(sum);
//    }
    
    // Bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int cnt = 0;
//        for (int i = 1; i <= n; i++){
//            if ( n % i == 0){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//        for (int i = 1; i <= n; i++){
//            if (n % i == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // Bai 8 cach 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            int k = (int)Math.sqrt(i);
//            if (k * k == i){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    
    // Bai 8 cach 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.Long();
//        for (int i = 0; i <= Math.sqrt(n); i++){
//            System.out.print(1l * i * i + " ");
//        }
//    }
    // Bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int tich = 1;
//        int n = sc.nextInt();
//        for (int i = 1; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                tich *= i;
//                tich *= n / i;
//            }
//        }
//        System.out.println(tich);
//    }
    
    // Bai 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int check = 0;
//        for (int i = 1; i <= n; i++){
//            int k = sc.nextInt();
//            if (k == 2022){
//                check = 1;
//                break;
//            }
//        }
//        if (check == 1){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // Bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum += (Math.pow(-1, i) * i);
//        }
//        System.out.println(sum);    
//    }
    
    // Bai 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        long sum =0; 
//        for (int i = 1 ; i <= n; i++){
//            sum += 2 * i;
//        }
//        System.out.println(sum);
//    }
    
    // Bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum = 0;
//        for (int i = 1; i <= n ; i++){
//            sum += (2 * i - 1);
//        }
//        System.out.println(sum);
//    }
    
    // Bai 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum = 0;
//        for (int i 1= 0; i <= n ; i++){
//            sum += Math.pow(i, 3);
//        }
//        System.out.println(sum);
//    }
    
    // Bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int gt = 1;
//        for (int i = 1; i <= n; i++){
//            gt *= i;
//        }
//        System.out.println(gt);
//    }
    
    // Bai 0 if
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");
//        for (int i = n; i >= 0; i--){
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");
//        for (int i = 0; i <= n; i++){
//            if (i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println(" ");
//        for (int i = 0; i <= n; i++){
//            if (i % 2 != 0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println(" ");
//        for (int i = 0; i <= n; i++){
//            if (i % 4 == 0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println(" ");
//        int a = (int)'a';
//        for (int i = 1; i <= n; i++){
//            System.out.print((char)a + " ");
//            a += 1;
//        }
//        System.out.println(" ");
//        int c = (int)'z' - n + 1;
//        for (int i = 1; i <= n; i++){
//            System.out.print((char)c + " ");
//            ++c;
//        }
//    }
    
    // Bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        int cnt = 0;
//        if (n == 0){
//            System.out.println("1");
//        }else{
//            while (n != 0){
//                ++cnt;
//                n /= 10;
//            }
//            System.out.println(cnt);
//        }
//    }
    
    // Bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        int sum = 0;
//        while (n != 0){
//            sum += (n % 10);
//            n /= 10;
//        }
//        System.out.println(sum);
//    }
    
    // Bai 0 while 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        while (i <= n){
//            System.out.print(i + " ");
//            ++i;
//        }
//        System.out.println(" ");
//        int a = n;
//        while (a >= 0){
//            System.out.print(a + " ");
//            --a;
//        }
//        System.out.println(" ");
//        int k = 0;
//        while (k <= n){
//            if (k % 2 == 0){
//                System.out.print(k + " ");
//            }
//            ++k;
//        }
//        System.out.println(" ");
//        int m = 0;
//        while (m <= n){
//            if (m % 2 == 1){
//                System.out.print(m + " ");
//            }
//            ++m;
//        }
//        System.out.println(" ");
//        int l = 0;
//        while (l <= n){
//            if (l % 4 == 0){
//                System.out.print(l + " ");
//            }
//            ++l;
//        }
//        System.out.println(" ");
//        int r = (int)'a';
//        int p = 1;
//        while (p <= n){
//            System.out.print((char)r + " ");
//            ++p;
//            ++r;
//        }
//        System.out.println(" ");
//        int c = (int)'z' - n + 1;
//        int v = 1;
//        while(v <= n){
//            System.out.print((char)c + " ");
//            ++c;
//            ++v;
//        }
//    }
    
       // Bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int xu = sc.nextInt();
//        int bia = xu / 28;
//        int vo = bia;
//        while (vo >= 3){
//            bia += vo / 3;
//            vo -= bia * 3;
//            vo += bia;
//        }
//        System.out.println(bia);
//    }
//    
    //  Bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        int cnt = 0;
//        while (n != 0){
//            long hdv = n % 10;
//            if (hdv == 2 || hdv == 3 || hdv == 5 || hdv == 7){
//                ++cnt;
//            }
//            n /= 10;
//        }
//        System.out.println(cnt);
//    }
    
    // Bai 20
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        if (n == 1){
//            System.out.println("-1");
//        }
//        else{
//            System.out.println(n / 2);
//            while (n >= 2){
//               if (n == 3){
//                   n -= 3;
//                   System.out.print(" 3");
//               }
//               else{
//                   n -= 2;
//                   System.out.print("2 ");
//               }
//            }
//        }
//    }
    
    // Bai 21
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (i == 1 || i == n || j == 1 || j == n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (i == 1 || i == n || j == 1 || j == n){
//                    System.out.print("*");
//                }else{
//                    System.out.print("#");
//                }
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (i == 1 || i == n || j == 1 || j == n){
//                    System.out.print(i);
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");    
//        }
//    } 
    
    // Bai 22
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (j <= i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        
//        for (int i = 1; i <= n; i++){
//            for (int j = 5; j >= 1; j--){
//                if (j >= i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        
//        for (int i = 1; i <= n; i++){
//            for (int j = 5; j >= 1; j--){
//                if (i >= j){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//        System.out.println(" ");
//        
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (j >= i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (j == 1 || i == n || i == j){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 23
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int kt = 1;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(kt + " ");
//                kt += 1;
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        
//        int st1 = 1;
//        for (int i = 1; i <= n; i++){
//            int st2 = st1;
//            for (int j = 1; j <= n; j++){
//                System.out.print(st2 + " ");
//                ++st2;
//            }
//            ++st1;
//            System.out.println(" ");
//        }
          
    // cach 2 khong can tao ra bien khoi tao  
    
//          for (int i = 1; i <= n; i++){
//                  for (int j = i; j < n + i; j++){
//                        System.out.print(j + " ");
//            }
//                  System.out.println(" ");
                          
    
//        System.out.println(" ");
//        
//        for (int i = 1; i <= n; i++){
//            for (int j = n; j >= 1; j--){
//                if (i >= j){
//                    System.out.print(i);
//                }else{
//                    System.out.print("~");
//                }
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        
//        int bg1 = 1;
//        for (int i = 1; i <= n; i++){
//            int kc = 4;
//            int tmp = bg1;
//            for (int j = 1; j <= n; j++){
//                if (j <= i){
//                    System.out.print(tmp + " ");
//                    tmp += kc;
//                    --kc;
//                }
//                else{
//                    System.out.print(" ");   
//                }
//            }
//            ++bg1;
//            System.out.println(" ");
//        }
//    }
        
    // Bai 24
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long a = sc.nextLong(); long b = sc.nextLong();
//        System.out.println(Math.min(a, b));
//    }
    
    // Bai 25   
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        double sum = 1;
//        for (int i = 1; i < n; i++){
//            int gt = 1;
//            for (int j = 1; j <= i; j++){
//                gt *= j;
//            }
//            sum += (1 / (double)gt);
//        }
//        System.out.printf("%.4f", sum);
//    }
    
    
    // cach 2 hay hon o(n)
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        double res = 1;
//        long gt = 1;
//        for (int i = 1; i <= n - 1; i++){
//            gt *= i;
//            res += (double)1 / gt;
//        }
//        System.out.println(res);
//    }
     
    
    // Bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = sc.nextInt();
//        for (int i = 0; i <= (n / b); i++){
//            if ((n % a) == (b * i) % a){
    
               // cho nay chi can if ((n - b * i) % a == 0)
    
//                System.out.println("YES");
//                return;
//            }
//        }
//        System.out.println("NO");
//    }
    
    // Bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        while (n >= 10){
//            long sum = 0;
//            long tmp = n;
//            while (tmp > 0){
//                sum += tmp % 10;
//                tmp /= 10;
//            }
//            long tong = sum;
//            n = tong;
//        }
//        System.out.println(n);
//    }
    
    // Bai 28
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        long sum = 0;
//        for (int i = 1; i <= n; i++){
//            long gt = 1;
//            for (int j = 1; j <= i; j++){
//                gt *= j;
//            }
//            sum += gt;
//        }
//        System.out.println(sum);
//    }
    
    // Bai 29
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        long sum = 0;
//        for (int i = 1; i <= n; i++){
//            int k = sc.nextInt();
//            if (k % 2 == 0){
//                sum += k;
//            }
//        }
//        System.out.println(sum);
//    }
    
    // Bai 30
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        while (t-- != 0){
    
            // co the thay bang for for (int i = 1; i <= t; i++)
    
//            int n = sc.nextInt();
//            if (n % 2 == 0){
//                System.out.println("EVEN");
//            }else{
//                System.out.println("ODD");
//            }
//        }
//    }
    
    // Bai 31
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        double sum = 1;
//        for (int i = 1; i <= n; i++){
//            long gt = 1;
//            for (int j = 1; j <= i; j++){
//                gt *= j;
//            }
//            sum += 1 / (double)gt;
//        }
//        System.out.printf("%.2f", sum);
//    }
    
    
    // Bai 32
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        char alpha = 'A';
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (j <= i){
//                    System.out.print((char)alpha + " ");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            ++ alpha;
//            System.out.println(" ");
//        }
//    }
    
    
    // cach 2 hay hon (khong can tao bien kt dung luon bien i de tang gia tri bien kt va khon can re nhanh if else)
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print((char)(64 + i) + " ");
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 33
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int mid = n;
//        for (int i = 0; i < n; i++){
//            for (int j = 1; j <= 2 * n - 1; j++){
//                if ((j >= mid - i) && (j <= mid + i)){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // cach 2 hay hon (in ra space truoc roi moi in *)
//    public static void main(String[] args) {
//            Scanner sc = new Scanner (System.in);
//            int n = sc.nextInt();
//            for (int i = 1; i <= n; i++){
//                for (int j = 1; j <= 2 * (n - i); j++){
//                    System.out.print(" ");
//                }
//                // xet theo so luong khong phai vi tri (moi dong co 2i - 1 dau sao)
//                for (int j = 1; j <= 2 * i - 1; j++){
//                    System.out.print("* ");
//                }
//                System.out.println(" ");
//            }              
//    }
    
    // Bai 34
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int mid = n;
//        int kt = 0;
//        for (int i = 0; i < n; i++){
//            int kt2 = kt;
//            for (int j = 1; j <= 2 * n - 1; j++){
//                if (j >= mid - i && j <= mid + i){
//                    if (j <= mid){
//                        ++kt2;
//                        System.out.print(kt2);
//                    }else{
//                        --kt2;
//                        System.out.print(kt2);
//                    }
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//            ++kt;
//        }
//    }
    
    // cach 2 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            int x = i;
//            for (int j = 1; j <= 2 * (n - i); j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++){
//                if (j < i){
//                    System.out.print(x + " ");
//                    ++x;
//                }else{
//                    System.out.print(x + " ");
//                    --x;
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 35
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int mid = n;
//        for (int i = n - 1; i >= 0; i--){
//            for (int j = 1; j <= 2 * n - 1; j++){
//                if (j >= mid - i && j <= mid + i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 36
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int mid = n;
//        for (int i = 0; i < n; i++){
//            for (int j = 1; j <= 2 * n - 1; j++){
//                if (j >= mid - i && j <= mid + i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//        for (int i = n - 2; i >= 0; i--){
//            for (int j = 1; j <= 2 * n - 2; j++){
//                if (j >= mid - i && j <= mid + i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 37
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int kt = 1;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (i == j || j == n + 1 - i){
//                    System.out.print(kt);
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//            ++kt;
//        }
//    }
    
    // Bai 38
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int kt = 0;
//        for (int i = 1; i <= n; i++){
//            if (i % 2 == 1){
//                kt = 0;
//            }else{
//                kt = 1;
//            }
//            for (int j = 1; j <= n; j++){
//                if (kt == 0){
//                    if (j % 2 == 1){
//                        System.out.print("0");
//                    }else{
//                        System.out.print("1");
//                    }
//                }else{
//                    if (j % 2 == 1){
//                        System.out.print("1");
//                    }else{
//                        System.out.print("0");
//                    }
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // cach 2 hay hon nhieu
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if ((i + j) % 2 == 0){
//                    System.out.print("0");
//                }else{
//                    System.out.print("1");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 39
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        char kt = 'A';
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            if (i % 2 == 1){
//                if (!(kt >= 'A' && kt <= 'Z')){
//                    kt -= 32;
//                }
//            }else{
//                kt += 32;
//            }
//            char kt2 = kt;
//            for (int j = 1; j <= n ; j++){
//                System.out.print(kt2);
//                ++kt2;
//            }
//            System.out.println(" ");
//            ++kt;
//        }
//    }
    
    // cach 2 hay hon
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            int x = 0;
//            if (i % 2 == 1){
//                x = 64 + i;
//            }else{
//                x = 96 + i;
//            }
//            for (int j = 1; j <= n; j++){
//                System.out.print((char)x);
//                ++x;
//            }
//            System.out.println(" ");
//        }
//    }
    
    // Bai 40
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= 10; j++){
//                int ans = i  * j    ;
//                System.out.println(i + " x " + j + " = " + ans);
//            }
//            System.out.println(" ");
//        }
//    }
    
  
}
