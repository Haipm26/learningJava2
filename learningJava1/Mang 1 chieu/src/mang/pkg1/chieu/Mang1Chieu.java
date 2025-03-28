/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang.pkg1.chieu;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Mang1Chieu {
    
    
    // bai 8
    
//    public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       int n = sc.nextInt();
//       int []a = new int[n];
//       for (int i = 0; i < n; i++){
//           a[i] = sc.nextInt();
//       }
//
//       for (int i = 0; i < n; i++){
//           int check = 1;
//           for (int j = 0; j < i - 1; j++){
//               if (a[j] == a[i]){
//                   check = 0;
//                   break;
//               }
//           }
//           if (check == 1){
//               System.out.print(a[i] + " ");
//           }
//       }
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            int cnt = 1;
//            int check1 = 1;
//            for (int j = n - 1; j >= i; j--){
//                if (a[j] == a[i]){
//                    check1 = 0;
//                    break;
//                }
//            }
//            if (check1 == 1){
//                for (int j = 0; j < i - 1; j++){
//                    if (a[j] == a[i]){
//                        ++cnt;
//                    }
//                }
//                System.out.println(i + " " + cnt);
//            }
//        }
    //            for (int i = 0; i < n; i++){
    //                int cnt = 1;
    //                int check1 = 1;
    //                for (int j = 0; j < i - 1; j++){
    //                    if (a[j] == a[i]){
    //                        check1 = 0;
    //                        break;
    //                    }
    //                }
    //                if (check1 == 1){
    //                    for (int j = i + 1; j < n; j++){
    //                        if (a[j] == a[i]){
    //                            ++cnt;
    //                        }
    //                    }
    //                    System.out.println(a[i] + " " + cnt);
    //                }
    //            }
    //    }
    
    
    // bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int []cnt = new int[1000000];
//        int k = 0;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//            k = Math.max(k, a[i]);
//        }
//        for (int i = 0; i <= k; i++){
//            if (cnt[i] != 0){
//                System.out.println(i + " " + cnt[i]);
//            }
//        }
//    }
    
    // bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int sum1 = 0, sum2 = 0;
//        int cnt1 = 0, cnt2 = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] % 2 == 0){
//                sum1 += a[i];
//                ++cnt1;
//            }else{
//                sum2 += a[i];
//                ++cnt2;
//            }
//        }
//        System.out.println(cnt1);
//        System.out.println(cnt2);
//        System.out.println(sum1);
//        System.out.println(sum2);
//    }
    
    // bai 2
    
//    public static boolean checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int sum = 0, cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (checksnt(a[i])){
//                sum += a[i];
//                ++cnt;
//            }
//        }
//        System.out.printf("%.3f", (double)sum / cnt);
//    }
    
    // bai 3 xong tim min roi moi lam tiep cnt
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int min = 999999999;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            min = Math.min(min, a[i]);
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == min){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // cach 2 di den dau update den day
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int minValue = 1000, cnt = 0;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int x : a){
//            if (minValue == x){
//                ++cnt;
//            }else if ( x < minValue ){
//                cnt = 1;
//                minValue = x;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int x = sc.nextInt();
//        int cnt1 = 0, cnt2 = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] < x){
//                ++cnt1;
//            }else{
//                ++cnt2;
//            }
//        }
//        System.out.println(cnt1);
//        System.out.println(cnt2);
//    }
    
    // bai 5 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (i % 2 == 0 && a[i] % 2 == 0){
//                cnt = 1;
//                System.out.print(a[i] + " ");
//            }
//        }
//        if (cnt == 0){
//            System.out.println("NULL");
//        }
//    }
    
    // bai 6
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                if (a[i] + a[j] == k){
//                    ++cnt;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
    
    
    // cach 2 hay hon dung mang danh dau nen mat O(n / 2)
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []cnt = new int [1005];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        int k = sc.nextInt();
//        int res = 0;
//        for (int i = 0; i < k / 2; i++){
//            int y = k - a[i];
//            if (y != a[i]) res += (cnt[a[i]] * cnt[k - a[i]]);
//            else res += (a[i] * (a[i] - 1) / 2);    
//        }
//        System.out.println(res);
//    }
//    
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int d = 999;
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                d = Math.min(Math.abs(a[i] - a[j]), d);
//            }
//        }
//        System.out.println(d);
//    }
    
    //  bai 10
    
//    public static boolean checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            int sum1 = 0, sum2 = 0;
//            for (int j = 0; j < i; j++){
//                sum1 += a[j];
//            }
//            for (int j = i + 1; j < n; j++){
//                sum2 += a[j];
//            }
//            if (checksnt(sum1) && checksnt(sum2)){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // hay hon dung O(n)
    
//    public static boolean checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0) return false;
//        }
//        return n > 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n  = sc.nextInt();
//        int []a = new int [n];
//        int sum = 0;
//        for (int i = 0; i < n ;i ++){
//            a[i] = sc.nextInt();
//            sum += a[i];
//        }
//        int sumLeft = 0;
//        for (int i = 1; i < n - 1; i++){
//            sumLeft += a[i - 1];
//            int sumRight = sum - sumLeft - a[i];
//            if (checksnt(sumLeft) && checksnt(sumRight)){
//                System.out.print(i + " ");
//            }
//        }
//        
//    }
    
    // bai 11
//    
//    public static boolean checkfibo(long n){
//        if (n == 1 || n == 0) return true;
//        long f2 = 0, f1 = 1;
//        for (int i = 3; i < 92; i++){
//            long f = f1 + f2;
//            if (f == n){
//                return true;
//            }
//            f2 = f1;
//            f1 = f;
//        }
//        return false;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        long []a = new long[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextLong();
//        }
//        int k = 0;
//        for (int i = 0; i < n; i++){
//            if (checkfibo(a[i])){
//                System.out.print(a[i] + " ");
//                k = 1;
//            }
//        }
//        if (k == 0){
//            System.out.print("NONE");
//        }
//    }
    
    // bai 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int min = 9999999;
//        int max = 0;
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            min = Math.min(min, a[i]);
//            max = Math.max(max, a[i]);
//        }
//        for (int i = 0; i < n; i++){
//            if (a[i] == max){
//                System.out.print(i + " ");
//                break;
//            }
//        }
//        int tmp = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == min){
//                tmp = i;
//            }
//        }
//        System.out.print(tmp);
//    }
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        long sum1 = 0, multi = 1;
//        for (int i = 0; i < n; i++){
//            sum1 += a[i];
//            sum1 % 1e9 + 7;
//        }
//        System.out.println(sum1);
//        for (int i = 0; i < n; i++){
//            multi *= a[i];
//            multi % 1e9 + 7;
//        }
//        System.out.println(multi);
//    }
    
    // a[i] < 1e9 + 7 nen co the luoc bo (sum + a[i]) % (1e9 + 7)
    // vi sum la sum cua buoc truoc da duoc chia du nen ko can chia du o day nua
    
    
    // bbai 14'
    
//    public static int gcd(int a, int b){
//        while (b != 0){
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        return a;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int tmp = a[0];
//        for (int i = 1; i < n; i++){
//            tmp = gcd(tmp, a[i]);
//        }
//        System.out.print(tmp);
//    }
    
    // bai 15 cach 1 lam lan luot
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int max = 0;
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            max = Math.max(max, a[i]);
//        }
//        System.out.print(max + " ");
//        int max2 = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] < max){
//                max2 = Math.max(max2, a[i]);
//            }
//        }
//        System.out.print(max2);
//    }
    
    // cach 2 duyet den dau update den day
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int max1 = 0;
//        int max2 = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] > max1){
//                max2 = max1;
//                max1 = a[i];
//            
//            }else if (a[i] > max2){
//                max2 = a[i];
//            }     
//    }
//        System.out.print(max1 + " " + max2);
//}
    
    // bai 16
    
//    public static boolean checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static boolean checkstn(int n){
//        int tmp = n;
//        int sum = 0;
//        while (n >= 1){
//            sum = sum * 10 + n % 10;
//            n /= 10;
//        }
//        return sum == tmp;
//    }
//    
//    public static boolean checkscp(int n){
//        for (int i = 0; i <= Math.sqrt(n); i++){
//            if (i * i == n) return true;
//        }
//        return false;
//    }
//    
//    public static boolean checktnt(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        return checksnt(sum);
//                
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
//        for (int i = 0; i < n; i++){
//            if (checksnt(a[i])) ++cnt1;
//            if (checkstn(a[i])) ++cnt2;
//            if (checkscp(a[i])) ++cnt3;
//            if (checktnt(a[i])) ++cnt4;
//        }
//        System.out.println(cnt1);
//        System.out.println(cnt2);
//        System.out.println(cnt3);
//        System.out.println(cnt4);
//
//    }
    
    
    // bai 17
    
//    public static boolean doiXung(int a[], int n){
//        int l = 0;
//        int r = n - 1;
//        while (l <= r){
//            if (a[l] != a[r]){
//                return false;
//            }
//            ++l; --r;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        System.out.println(doiXung(a, n));
//    }
    
    
    // bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            if (i == 0){
//                if ((long)a[i] * a[i + 1] < 0) System.out.print(a[i] + " ");
//            }
//            else if (i == n - 1){
//                if ((long)a[i] * a[i - 1] < 0) System.out.print(a[i] + " ");
//            }
//            else{
//                if ((long)a[i] * a[i - 1] < 0 || (long)a[i] * a[i + 1] < 0){
//                    System.out.print(a[i] + " ");
//                } 
//            }
//        }
//    }
    
    // bai 19.1
//    public static void lat(int a[], int n){
//        int l = 0, r = n - 1;
//        while (l <= r){
//            int tmp = a[l];
//            a[l] = a[r];
//            a[r] = tmp;
//            ++l; --r;
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        lat(a, n);
//        for (int i = 0; i < n; i++){
//            System.out.print(a[i] + " ");
//        }
//    }
    
    // bai 20.1
//    public static void main(String[] args) {
//                Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 1; i < n - 1; i++){
//            if (a[i] > a[i - 1] && a[i] > a[i + 1]){
//                System.out.print(a[i] + " ");
//            }
//        }
//    }
    
    // bai 21.1
    
//    public static void insert(int a[], int n, int x, int k){
//        for (int i = n - 1; i >= k + 1; i--){
//            a[i] = a[i - 1];
//        }
//        a[k] = x;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n + 1];
//        a[n] = 0;
//        int x = sc.nextInt();
//        int k = sc.nextInt();
//        --k;
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        insert(a, n +1 , x, k);
//        for (int i = 0; i < n + 1; i++){
//            System.out.print(a[i] + " ");
//        }
//    }
    
    // bai 22 xoa
//    public static void del(int a[], int n, int x){
//        int tmp = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == x){
//                tmp = i;
//                break;
//            }
//        }
//        for (int i = tmp; i < n - 1; i++){
//            a[i] = a[i + 1];
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int x = sc.nextInt();
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }  
//        int check = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == x){
//                check = 1; 
//                break;
//            }
//        }
//        if (check == 0){
//            System.out.print("NONE");
//        }else{
//            del(a, n, x);
//            --n;
//            for (int i =0; i < n; i++){
//                System.out.print(a[i] + " ");
//            }
//        }
//    }
    
    // bai 22 cach khong can xoa thay vao do chi can khong can in
    
    // DAY LA CACH XOA TRC ROI MOI KTRA CO HAY KO (LUC SAU CHECK RAT UNCLEAN)
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        boolean isFound = false;
//        int []a = new int[n];
//        int x = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            if (a[i] == x && isFound == false){
//                isFound = true;
//            }else{
//                System.out.print(a[i] + " ");
//            }
//        }
    
    // KTRA CO TRC ROI MOI XOA
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int []a = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int isFound = -1;
//        for (int i = 0; i < n; i++){
//            if (a[i] == x){
//                isFound = i;
//                break;
//            }
//        }
//        if (isFound == -1){
//            System.out.println("NOT FOUND");
//        }
//        for (int i = 0; i < n; i++){
//            if (i == isFound){
//                continue;
//            }
//            else{
//                System.out.print(a[i] + " ");
//            }
//        }
//    }
//    
    
    
    // bai 23
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n + 1];
//        for (int i = 1 ; i <= n; i++){
//            a[i] = sc.nextInt();
//        }
//        int []f = new int [n + 1];
//        f[0] = 0;
//        for (int i = 1; i <= n; i++){
//            f[i] = f[i - 1] + a[i];
//        }
//        for (int i = 1; i <= n; i++){
//            System.out.print(f[i] + " ");
//        }
//    }
    
    // bai 24
//    public static void main(String[] args) {
//                Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int k = sc.nextInt();
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i <= n - k; i++){
//            int sum = 0;
//            for (int j = i; j <= i + k - 1; j++){
//                sum += a[j];
//            }
//            System.out.print(sum + " ");
//        }
//    }
    
    // cach 2 hay hon
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int k = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int sum =0;
//        for (int i = 0; i < k; i++){
//            sum += a[i];
//        }
//        System.out.print(sum + " ");
//        for (int i = k; i < n; i++){
//            sum += a[i];
//            sum -= a[i - k];
//            System.out.print(sum + " ");
//        }
//    }
    
    // bai 25 ko biet cau lenh
//      public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int chan = 0, le = 0;
//        int n = 0;
//        while (sc.hasNext()){
//            n = sc.nextInt();
//            if (n % 2 == 0){
//                ++chan;
//            }else{
//                ++le;
//            }
//        }
//        System.out.print(chan + " " + le);
//    }
    // bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int []cnt = new int[10000];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]] = 1;
//        }
//        int dem = 0;
//        for (int i = 0; i < 10000; i++){
//            if (cnt[i] == 1){
//                ++dem;
//            }
//        }
//        System.out.print(dem);
//    }
    
    // bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int []cnt = new int[10000];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        for (int i = 0; i<10000; i++){
//            if (cnt[i] != 0){
//                System.out.println(i + " " + cnt[i]);
//            }
//        }
//    }
    
    // bai 28
//    public static void main(String[] args) {
//                Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int []cnt = new int[10000];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        for (int i = 0; i < n; i++){
//            int check = 0;
//            for (int j = 0; j < i; j++){
//                if (a[j] == a[i]){
//                    check = 1;
//                }
//            }
//            if (check == 0){
//                System.out.println(a[i] + " " + cnt[a[i]]);
//            }
//        }
//    }
    
    // cach 2 hay hon ko dung for de check
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int []cnt = new int [1000001];
//        for (int i = 0; i < n; i++){
//            cnt[a[i]]++;
//        }
//        for (int i = 0; i < n; i++){
//            if (cnt[a[i]] != 0){
//                System.out.println(a[i] + " " + cnt[a[i]]);
//                cnt[a[i]] = 0;
//            }
//        }
//    }
    
    // bai 29
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int []cnt = new int[10000];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        int min = 0;
//        int value = 0;
//        for (int i = 0; i < 10000; i++){
//            if (cnt[i] != 0){
//                if (cnt[i] > min){
//                    min = cnt[i];
//                    value = i;
//                }
//            }
//        }
//        System.out.println(value + " " + min);
//    }
    
    // bai 30
//    public static void main(String[] args) {
//                Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int []cnt = new int[10000];
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        int max = 0, value = 0;
//        for (int i = 0; i < n; i++){
//            if (cnt[a[i]] > max){
//                max = cnt[a[i]];
//                value = a[i];
//            }
//        }
//        System.out.print(value + " " + max);
//    }
    
    // bai 31
//    public static void main(String[] args) {
//                Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int[n];
//        int []b = new int[m];
//        int p = sc.nextInt();
//        for (int i =0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < m; i++){
//            b[i] =sc.nextInt();
//        }
//        for (int i = 0; i < p; i++){
//            System.out.print(a[i] + " ");
//        }
//        for (int i = 0; i < m; i++){
//            System.out.print(b[i] + " ");
//        }
//        for (int i = p; i < n; i++){
//            System.out.print(a[i] + " ");
//        }
//        
//    }
    
    // bai 32
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = k; i < n; i++){
//            System.out.print(a[i] + " ");
//        }
//        for (int i = 0; i < k; i++){
//            System.out.print(a[i] + "");
//        }
//    }
    
    // bai 33
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int k = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        while (k-- != 0 // k % n -- != 0){
    // khi k > n thi sau n vong no quay lai vi tri cu
//            int tmp = a[n - 1];
//            for (int i = n - 1; i >= 1; i--){
//                a[i] = a[i - 1];
//            }
//            a[0] = tmp;
//        }
//        for (int i = 0; i < n; i++){
//            System.out.print(a[i] + " ");
//        }
//    }
    
    // bai 34
//    public static void del(int a[], int n, int k){
//        for (int i = k; i < n - 1; i++){
//            a[i] = a[i + 1];
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 1; i < n - 1; i++){
//            if (a[i] == a[i + 1] || a[i] == a[i - 1]){
//                del(a, n, i);
//                --n;
//                --i;
//            }
//        }
//        for (int i = 0; i < n; i++){
//            System.out.print(a[i] + " ");
//        }
//    }
    
    // bai 35
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [n - 1];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n - 1; i++){
//            b[i] = sc.nextInt();
//        }
//        int sum = a[0]; int j = 1;
//        for (int i = 0; i < n - 1; i++){
//            if (b[i] == 1){
//                sum += a[j];
//                ++j;
//            }else{
//                sum -= a[j];
//                ++j;
//            }
//        }
////        int sum = a[0];
////        for (int i = 1; i < n; i++){
////        if (b[i - 1] == 1) sum += a[i];
////        else sum -= a[i];
////        }
//    
//        System.out.print(sum);
//    }
    
    
    // bai 38 mang 1 chieu co ban trong vid 1.JAVA
//    public static int cuaSo(int a[], int n, int k){
//        int sum = 0;
//        for (int i = 0; i < k; i++){
//            sum += a[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        System.out.print(cuaSo(a, n, 2) + " ");
//        int sum1 = cuaSo(a, n, 2);
//        for (int i = 2; i < n; i++){
//            sum1 += a[i];
//            sum1 -= a[i - 2];
//            System.out.print(sum1 + " ");
//        }
//        System.out.println(" ");
//        int sum2 = cuaSo(a, n, 3);
//        System.out.print(sum2 + " ");
//        for (int i = 3; i < n; i++){
//            sum2 += a[i];
//            sum2 -= a[i - 3];
//            System.out.print(sum2 + " ");
//        }
//        System.out.println(" ");
//        int sum3 = cuaSo(a, n, 4);
//        System.out.print(sum3 + " ");
//        for (int i = 4; i < n; i++){
//            sum3 += a[i];
//            sum3 -= a[i - 4];
//            System.out.print(sum3 + " ");
//        }
//        
//    }
    
    
    // bai 39
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt1 = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == 1){
//               ++cnt1;
//            }else{
//                if (cnt1 > 0){
//                    System.out.print(cnt1 + " ");
//                }
//                cnt1 = 0;
//            }
//        }
    // cho nay de in ra cnt o cuoi thi chi can tao mang a[n + 1] va cho a[n] = 0
//        if (cnt1 > 0){
//            System.out.print(cnt1 + " ");
//        }
//        System.out.println(" ");
//        int cnt0 = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == 0){
//                ++cnt0;
//            }else{
//                if (cnt0 > 0){
//                    System.out.print(cnt0 + " ");
//                }
//                cnt0 = 0;
//            }
//        }
//        if (cnt0 > 0){
//            System.out.print(cnt0 + " ");
//        }
//    }
    
    
    // bai 40
//    public static void countDigit(int cnt[], int n){
//        if (n == 0) cnt[0]++;
//        n = Math.abs(n);
//        while (n != 0){
//            int tmp = n % 10;
//            cnt[tmp]++;
//            n /= 10;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int []cnt = new int [10];
//        for (int x : a){
//            countDigit(cnt, x);
//        }
//        for (int i = 0; i < 10; i++){
//            if (cnt[i] != 0){
//                System.out.println(i + " " + cnt[i]);
//            }
//        }
//    }
    
    // bai 42
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            int ok = -1;
//            for (int j = i + 1; j < n; j++){
//                if (a[j] > a[i]){
//                    ok = a[j];
//                    break;
//                }
//            }
//            System.out.print(ok + " ");
//        }
//    }
    
    
    // bai 43
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            int sum = a[i];
//            System.out.print(sum + " ");
//            for (int j = i + 1; j < n; j++){
//                sum += a[j];
//                System.out.print(sum + " " );
//            }
//        }
//    }
    
    // bai 44
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0 ; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            int Even = 0, Odd = 0;
//            if (a[i] % 2 == 0){
//                ++Even;
//            }else{
//                ++Odd;
//            }
//            for (int j = i + 1; j < n; j++){
//                if (a[j] % 2 == 0){
//                    ++Even;
//                }else{
//                    ++Odd;
//                }
//                if (Even == Odd){
//                    ++cnt;
//                }
//            }
//            
//        }
//        System.out.print(cnt);
//    }
    
    // cach 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            int even = 0, odd = 0;
//            for (int j = i; j < n; j++){
//                // duyet qua cac mang con co phan tu dau la a[i]
//                if (a[j] % 2 == 0) ++even;
//                else ++odd;
//                if (even == odd) ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 45
//    public static boolean checkSnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            int sum = 0;
//            for (int j = i; j < n; j++){
//                sum += a[j];
//                if (checkSnt(sum)){
//                    ++cnt;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 46 cach ko hay
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []d = new int [1000];
//        // cho nay co the chay 27 so thoi vi bai nay cho 1000 nen khi chay 2 vong for ko bi tle
//        // 27 vi cho d[a[i] % 28]++ vi minh chi can so du % 28 == 0 la duoc 
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            d[a[i]]++;
//        }
//        int cnt = 0;
//        for (int i = 0; i < 1000; i++){
//            for (int j = i + 1; j < 1000; j++){
//                if (i + j % 28 == 0){
//                    cnt += d[i] * d[j];
//                }
//            }
//        }
//        if (d[14] >= 2){
//            cnt += (d[14] - 1) * d[14] / 2;
//        }
//        System.out.println(cnt);
//    }
    
    // cach hay hon ko phai dung 2 vong for
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []d = new int [30];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            d[a[i] % 28] ++;
//        }
//        int cnt = 0;
//        for (int i = 0; i <= 14; i++){
//            int x = 28 - i;
//            if (x != i){
//                cnt += d[x] * d[i];
//            }else{
//                cnt += (d[x] - 1) * d[x] / 2;
//            }
//        }
//        System.out.print(cnt);
//        
//    }
    
    // bai 47
    // cach cap nhat luon ko doi den khi nao khac snt roi moi duyet
    
    public static boolean checkSnt(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    // sang ngto
    public static boolean []prime = new boolean [1000005];
    public static void sang(){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i <= Math.sqrt(1000000); i++){
            if (prime[i]){
                for (int j = i * i; j <= 1000000; j += i){
                    prime[j] = false;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int [n + 1];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        a[n] = 0;
        int cntAns = 0, sumAns = 0;
        int cnt = 0;
        int sum = 0;
        int first = -1, last = -1;
   
        for (int i = 0; i < n; i++){
            if (checkSnt(a[i])){
                ++cnt;
                sum += a[i];
            
            }
            if (checkSnt(a[i + 1]) == false){
                if (cnt > cntAns){
                    cntAns = cnt;
                    sumAns = sum;
                    last = i;
                    first = i + 1 - cnt;
                }else if(cnt == cntAns){
                    if (sum > sumAns){
                        sumAns = sum;
                        last = i;
                        first = i + 1 - cnt;
                    }
                }
                sum = 0;
                cnt = 0;
            }
        }
        if (cntAns == 0){
            System.out.println("NOT FOUND");
            return;
        }
        System.out.println(cntAns);
        for (int i = first; i <= last; i++){
            System.out.print(a[i] + " ");
        }
    }
    // cach doi den duyet dc thg ko phai snt trong file
}


