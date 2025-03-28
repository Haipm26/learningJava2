/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang2chieu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Pham Minh Hai
 */
public class Mang2Chieu {
    
    // bai 1
//    public static boolean []prime = new boolean [1000000005];
//    public static void sang(){
//        Arrays.fill(prime, true);
//        prime[0] = false;
//        prime[1] = false;
//        for (int i = 2; i <= Math.sqrt(1000000000); i++){
//            if (prime[i]){
//                for (int j = i * i; j <= 1000000000; j += i){
//                    prime[j] = false;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();
//       int [][]a = new int [n][m];
//       for (int i = 0; i < n; i++){
//           for (int j = 0; j < m; j++){
//               a[i][j] = sc.nextInt();
//           }
//       }
//       sang();
//       for (int i = 0; i < n; i++){
//           for (int j = 0; j < m; j++){
//               if (prime[a[i][j]]){
//                   System.out.print(a[i][j] + " ");
//               }
//           }
//           System.out.println(" ");
//       }
//    }
//    
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]a = new int [n][m];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            int sum = 0;
//            for (int j = 0; j < m; j++){
//                sum += a[i][j];
//            }
//            System.out.println(sum);
//        }
//        for (int i = 0; i < m; i++){
//            int sum = 0;
//            for (int j = 0; j < n; j++){
//                sum += a[j][i];
//            }
//            System.out.println(sum);
//        }
//    }
    
    // bai 4
//    public static boolean checkTN(int n){
//        int tmp = n;
//        int sum = 0;
//        while (n > 0){
//            sum = sum * 10 + n % 10;
//            n /= 10;
//        }
//        return sum == tmp;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j <= i; j++){
//                if (checkTN(a[i][j])){
//                    ++cnt;
//                }
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("");
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[j][i] + " ");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
//        for (int i = n - 1; i >= 0; i--){
//            for (int j = n - 1; j >= 0; j--){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        for (int i = n - 1; i >= 0; i--){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[j][i] + " ");
//            }
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//        for (int i = 0; i < n; i++){
//            for (int j = n - 1; j >= 0; j--){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    // bai 6 cah ko hay
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                if (i == j){
//                    int tmp = a[i][j];
//                    a[i][j] = a[i][n - 1 - j];
//                    a[i][n - 1 - j] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < n ; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    }
    
    // bai 6 cach ko hay
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            int tmp = a[i][i];
//            a[i][i] = a[i][n - 1 - i];
//            a[i][n - 1 - i] = tmp;
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[i][j] + " ");
//            
//            }
//            System.out.println("");
//        }
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int u = sc.nextInt();
//        int v = sc.nextInt();
//        --u; --v;
//        for (int i = 0; i < n; i++){
//            int tmp = a[u][i];
//            a[u][i] = a[v][i];
//            a[v][i] = tmp;
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    
    // bai 9
//    public static boolean []prime = new boolean[1000000];
//    public static void sang(){
//        Arrays.fill(prime, true);
//        prime[0] = false;
//        prime[1] = false;
//        for (int i = 0; i < Math.sqrt(1000000); i++){
//            if (prime[i]){
//                for (int j = i * i; j < 1000000; j += i){
//                    prime[j] = false;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        sang();
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (prime[a[i][i]]){
//                ++cnt;
//            }else if (prime[a[i][n - 1 - i]]){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        sang();
//        HashSet<Integer> set = new HashSet <>();
//        for (int i = 0; i < n; i++){
//            if (prime[a[i][i]]){
//                set.add(a[i][i]);
//            }else if(prime[a[i][n - 1 - i]]){
//                set.add(a[i][n - 1 - i]);
//            }
//        }
//        System.out.print(set.size());
//    }
    
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]a = new int [n + 1][m + 1];
//        int min = (int)1e9;
//        int max = 0;
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < m + 1; j++){
//                a[i][j] = sc.nextInt();
//                min = Math.min(min, a[i][j]);
//                max = Math.max(max, a[i][j]);
//            } 
//        }
//        System.out.println(min);
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < m + 1; j++){
//                if (min == a[i][j]){
//                    System.out.println(i + " " + j);
//                }
//            }
//        }
//        System.out.println(max);
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < m + 1; j++){
//                if (max == a[i][j]){
//                    System.out.println(i + " " + j);
//                }
//            }
//        }
//    }
    
    // bai 8
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int u = sc.nextInt();
//        int v = sc.nextInt();
//        --u; --v;
//        for (int i = 0; i < n; i++){
//            int tmp = a[i][u];
//            a[i][u] = a[i][v];
//            a[i][v] = tmp;
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[i][j] +" ");
//            }
//            System.out.println("");
//        }
//    }
    
    // bai 11 tim cach hay hon
//    public static int []cnt = new int [1000000001];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer [][]a = new Integer [n][n];
//        for (int i = 0 ; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                cnt[a[i][j]]++;
//            }
//            for (int j = 1; j <= (int)1e9; j++){
//                if (cnt[j] != 0){
//                    for (int k = 0; k < cnt[j]; k++){
//                        System.out.print(j + " ");
//                    }
//                    cnt[j] = 0;
//                }
//            }
//            System.out.println("");
//        }
//    }
    
    // bai 11 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer [][]a = new Integer [n][n];
//        for (int i = 0; i < n ; i++){
//            for (int j = 0 ;j < n ;j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        Arrays.sort(a, new Comparator<Integer[]>(){
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                Arrays.sort(o1);
//                Arrays.sort(o2);
//                return 1;
//            }
//            
//        });
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//         }
//    }
    
    // bai 11 cach hay nhat
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            Arrays.sort(a[i]);
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0 ; j < n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    // bai 12
    // tao ma tran chuyen vi co the tao mot mang b roi khi sc.nextInt() thi cho b[j][i] = a[i][j]
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer [][]a = new Integer [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = cnt; j < n; j++){
//                int tmp = a[j][i];
//                a[j][i] = a[i][j];
//                a[i][j] = tmp;
//                
//            }
//            ++cnt;
//        }
//        Arrays.sort(a, new Comparator<Integer[]>(){
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                Arrays.sort(o1);
//                Arrays.sort(o2);
//                return 1;
//            }
//            
//        });
//        int start = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = start; j < n; j++){
//                int tmp = a[j][i];
//                a[j][i] = a[i][j];
//                a[i][j] = tmp;
//                
//            }
//            ++start;
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[i][j] + " ");
//            } 
//            System.out.println("");
//        }
//    }
    
    // bai 12 cach hay nhat
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[j][i] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            Arrays.sort(a[i]);
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.print(a[j][i] + " ");
//            }
//            System.out.println("");
//        }
//    }

    
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int p = sc.nextInt();
//        int [][]a = new int[n][m];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//            
//        }
//        int [][]b = new int [m][p];
//        for (int i = 0; i < m; i++){
//            for (int j = 0; j < p; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//        int [][]c = new int [n][p];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < p; j++){
//                for (int k = 0; k < m; k++){
//                    c[i][j] += a[i][k] * b[k][j];
//                }
//            }
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < p; j++){
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    // bai 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n + 1][n + 1];
//        int loop = (n + 1) / 2;
//        int cnt = 1;
//        int hang = 1;
//        int end = n;
//        while (loop-- != 0){
//            int start = hang;
//            for (int i = start; i <= end; i++){
//                a[hang][i] = cnt;
//                ++cnt;
//            }
//            for (int i = start + 1; i <= end; i++){
//                a[i][end] = cnt;
//                ++cnt;
//            }
//            for (int i = end - 1; i >= start; i--){
//                a[end][i] = cnt;
//                ++cnt;
//            }
//            for (int i = end - 1; i >= start + 1; i--){
//               a[i][hang] = cnt;
//               ++cnt;
//            }
//            ++hang; --end;
//        }
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    
    // bai 15
//    public static long []fibo = new long [92];
//    
//    public static void addFibo(long []fibo){
//        fibo[1] = 0;
//        fibo[2] = 1;
//        long f1 = 1;
//        long f2 = 0;
//        for (int i = 3; i < 92; i++){
//            long f = f1 + f2;
//            fibo[i] = f;
//            long r = f1;
//            f1 = f;
//            f2 = r;
//        }
//    }
    
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        long [][]a = new long [n + 1][n + 1];
//        addFibo(fibo);
//        int vong = (n + 1) / 2;
//        int cnt = 1;
//        int start = 1;
//        int end = n;
//        while (vong-- != 0){
//            for (int i = start; i <= end; i++){
//                a[start][i] = fibo[cnt];
//                ++cnt;
//            }
//            for (int i = start + 1; i <= end; i++){
//                a[i][end] = fibo[cnt];
//                ++cnt;
//            }
//            for (int i = end - 1; i >= start; i--){
//                a[end][i] = fibo[cnt];
//                ++cnt;
//            }
//            for (int i = end - 1; i >= start + 1; i--){
//                a[i][start] = fibo[cnt];
//                ++cnt;
//            }
//            ++start; --end;
//        }
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
    
    
    // ham fibo co the lam the nay
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long []F = new long [92];
//        F[1] = 0;
//        F[2] = 1;
//        for (int i = 3; i < 92; i++){
//            F[i] = F[i - 1] + F[i - 2];
//        }
//        for (int i = 1; i < 92; i++){
//            System.out.print(F[i] + " ");
//        }
//    }
    
    // bai 16
//    public static int []di = {-1, 0, 0, 1};
//    public static int []dj = {0, -1, 1, 0};
//    public static int [][]a = new int [100][100];
//    public static int n = 0, m = 0;
//    public static void loang(int i, int j){
//        a[i][j] = 0;
//        for (int k = 0; k < 4; k++){
//            int i1 = i + di[k], j1 = j + dj[k];
//            if (0 <= i1 && i1 < n && 0 <= j1 && j1 < m && a[i1][j1] == 1){
//                loang(i1, j1);
//            } 
//        }
//    }
//    
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            for (int j = 0 ; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                if (a[i][j] == 1){
//                    ++cnt;
//                    loang(i, j);
//                }
//            }
//        }
//        System.out.println(cnt);
//
// }
    
    // bai 17
//    public static int [][]a = new int [100][100];
//    public static int n = 0, m = 0;
//    public static int []di = {-1, -1, 1, 1, -1, 0, 1, 0};
//    public static int []dj = {-1, 1, 1, -1, 0, 1, 0, -1};
//    public static void loang(int i, int j){
//        a[i][j] = 0;
//        for (int k = 0; k < 8; k++){
//            int i1 = i + di[k], j1 = j + dj[k];
//            if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] == 1){
//                loang(i1, j1);
//            }
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                if (a[i][j] == 1){
//                    ++cnt;
//                    loang(i, j);
//                }
//            }
//        }
//        System.out.print(cnt);
//        
//    }
    
    // bai 18
//    public static int []di = {-1, -1, -1, 0, 1 , 1, 1, 0};
//    public static int []dj = {-1, 0, 1, 1, 1, 0, -1, -1};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]a = new int [n][m];
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                boolean check = true;
//                for (int k = 0; k < 8; k++){
//                    int i1 = i + di[k], j1 = j + dj[k];
//                    if (i1 >= 0 && i1 < n && j1 < m && j1 >= 0 && a[i1][j1] >= a[i][j]){
//                        check = false;
//                        break;
//                    }
//                }
//                if (check == true){
//                    ++cnt;
//                }
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]a = new int [n + 1][m + 1];
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < m + 1; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int [][]F = new int [n + 1][m + 1];
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < m + 1; j++){
//                F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]) + a[i][j]; 
//            }
//        }
//        System.out.print(F[n][m]);
//    }
    
    // bai 20
//    public static int [][]a = new int [105][105];
//    public static int n = 0, m = 0, u =0, v = 0, s = 0, t = 0;
//    public static int []di = {-1, -1, -1, 0, 1, 1, 1, 0};
//    public static int []dj = {-1, 0, 1, 1, 1, 0, -1, -1};
//    public static boolean loang(int i, int j){
//        a[i][j]  = 0;
//        for (int k = 0; k < 8; k++){
//            int i1 = i + di[k], j1 = j + dj[k];
//            if (0 <= i1 && i1 <= n && 0 <= j1 && j1 <= m && a[i1][j1] == 1){
//                if (i1 == u && j1 == v){
//                    return true;
//                }
//                loang(i1, j1);
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        u = sc.nextInt();
//        v = sc.nextInt();
//        s = sc.nextInt();
//        t = sc.nextInt();
//        --u; --s; --v; --t;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        if (loang(s, t) == true){
//            System.out.print("YES");
//        }else{
//            System.out.print("NO");
//        }
//    }
    
    // bai 20\
//    public static int n, m;
//    public static int [][]a = new int [101][101];
//    public static int []di = {-1, 0, 1, 0};
//    public static int []dj = {0, 1, 0, -1};
//    public static void loang(int i, int j){
//        a[i][j] = 0;
//        for (int k = 0; k < 4; k++){
//            int i1 = i + di[k]; int j1 = j + dj[k];
//            if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] == 1){
//                loang(i1, j1);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int u1 = sc.nextInt();
//        int u2 = sc.nextInt();
//        --s1; --s2; --u1; --u2;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        loang(s1, s2);
//        if (a[u1][u2] == 0){
//            System.out.print("YES");
//        }else{
//            System.out.print("NO");
//        }
//    }
    
    // bai 21
//    public static int n = 0, s = 0, t = 0, u = 0, v = 0;
//    public static int []di = {-2, -2, -1, 1, 2, 2, -1, 1};
//    public static int []dj = {1, -1, 2, 2, -1, 1, -2, -2};
//    public static int [][]a = new int [105][105];
//    public static boolean loang(int i, int j){
//        if (i == u && j == v){
//            return true;
//        }
//        a[i][j] = 0;
//        for (int k = 0; k < 8; k++){
//            int i1 = i + di[k], j1 = j + dj[k];
//            if (0 <= i1 && i1 < n && j1 >= 0 && j1 < n && a[i1][j1] == 1){
//                if (loang(i1, j1)){
//                    return true;
//                }
//            }
//        }
//        a[i][j] = 1;
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        s = sc.nextInt();
//        t = sc.nextInt();
//        u = sc.nextInt();
//        v = sc.nextInt();
//        --s; --t; --u; --v;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        if (loang(s, t)){
//            System.out.print("TRUE");
//        }else{
//            System.out.print("FALSE");
//        }
//    }
    
    
    // BAI 22
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            } 
//        }
//        
//        System.out.println("");
//        for (int i = 0; i < n; i++){
//            if (i % 2 == 1){
//                for (int j = n - 1; j >= 0; j--){
//                    System.out.print(a[i][j] + " ");
//                }
//                System.out.println("");
//            }else{
//                for (int j = 0; j < n; j++){
//                    System.out.print(a[i][j] + " ");
//                }
//                System.out.println("");
//            }
//        }
//    }
    
    // bai 23
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                if (i == 0 || i == n - 1 || j == 0 || j == n - 1){
//                    System.out.print(a[i][j] + " ");
//                } 
//            }
//        }
//    }
    
    // bai 24
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int []cnt = new int [101];
//        for (int i = 0; i < n; i++){
//            cnt[a[0][i]] = 1;
//        }
//        for (int i = 1; i < n; i++){
//            for (int j = 0; j < n; j++){
//                if (cnt[a[i][j]] == i){
//                    cnt[a[i][j]] = i + 1;
//                }
//            }
//        }
//        for (int i = 0; i < 100; i++){
//            if (cnt[i] == n){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    //bai 25
//    public static int n = 0, m = 0;
//    public static int [][]a = new int [501][501];
//    public static int[] di = {-1, 0, 1, 0};
//    public static int[] dj = {0, 1, 0, -1};
//    public static int loang(int i, int j){
//        a[i][j] = 0;
//        int count = 1;
//        for (int k = 0; k < 4; k++){
//            int i1 = i + di[k]; int j1 = j + dj[k];
//            if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] == 1){
//                count += loang(i, j);
//            }
//        }
//        return count;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int ans = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                if (a[i][j] == 1){
//                    ans = Math.max(loang(i, j), ans);
//                } 
//            }
//        }
//        System.out.print(ans);
//    }
    
    // bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n + 2][n + 2];
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < n + 1; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int [][]f = new int [n + 2][n + 2];
//        for (int i = 1; i < n + 1; i++){
//            for (int j = 1; j < n + 1; j++){
//                f[i][j] = Math.max(f[i - 1][j - 1], Math.max(f[i - 1][j], f[i - 1][j + 1])) + a[i][j]; 
//            }
//        }
//        int max = 0;
//        for (int i = 1; i < n + 1; i++){
//            if (f[n][i] > max){
//                max = f[n][i];
//            }
//        }
//        System.out.print(max);
//    }
    
    // bai 27 sai vi co so am neu xet max thi co the lay cac so khong trong ma tran vi no = 0
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n + 2][n + 2];
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int [][]f = new int [n + 2][n + 2];
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                f[j][i] = Math.max(f[j - 1][i - 1], Math.max(f[j][i - 1], f[j + 1][i - 1])) + a[j][i];
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++){
//            max = Math.max(max, f[i][n]);
//        }
//        System.out.print(max);
//    }
    // bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n + 2][n + 2];
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int [][]F = new int [n + 2][n + 2];
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                F[i][j] = -(int)1e9;
//            }
//        }
//        for (int i = 1; i <= n; i++){
//            F[i][1] = a[i][1];
//        }
//        for (int i = 2; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                F[j][i] = Math.max(F[j - 1][i - 1], Math.max(F[j][i - 1], F[j + 1][i - 1])) + a[j][i];
//            }
//        }
//        int max = -(int)1e9;
//        for (int i = 1; i <= n; i++){
//            max = Math.max(max, F[i][n]);
//        }
//        System.out.print(max);
//    }
    
    // bai 28
//    public static int []di = {-1, -1, -1, 0, 1, 1, 1, 0};
//    public static int []dj = {-1, 0, 1, 1, 1, 0, -1, -1};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int sumMax = 0;
//        for (int i = 1; i < n - 1; i++){
//            for (int j = 1; j < n - 1; j++){
//                int sum = a[i][j];
//                for (int k = 0; k < 8; k++){
//                    int i1 = i + di[k];
//                    int j1 = j + dj[k];
//                    sum += a[i1][j1];
//                }
//                sumMax = Math.max(sumMax, sum);
//            }
//        }
//        System.out.print(sumMax);
//    }
    
    // bai 28 cach 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int [][]a = new int [n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int max = -(int)1e9;
//        for (int i = 0; i < n - 2; i++){
//            for (int j = 0; j < n - 2; j++){
//                int sum = 0;
//                for (int u = i; u <= i + 2; u++){
//                    for (int v = j; v <= j + 2; v++){
//                        sum += a[u][v];
//                    }
//                }
//                max = Math.max(max, sum);
//            }
//            
//        }
//        System.out.print(max);
//    }
    
    // bai 29
//    public static int n, s, t;
//    public static int [][]a = new int [21][21];
//    public static int []di = {-1, -1, 1, 1};
//    public static int []dj = {-1, 1, 1, -1};
//    public static int loang(int i, int j){
//        a[i][j] = 1;
//        int count = 1;
//        for (int k = 1; k < 4; k++){
//            int i1 = i + di[k];
//            int j1 = j + dj[k];
//            if (i1 < n && i1 >= 0 && j1 < n && j1 >= 0 && a[i1][j1] == 0){
//                count += loang(i1, j1);
//            } 
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        s = sc.nextInt();
//        t = sc.nextInt();
//        --s; --t;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print(loang(s, t));
//    }
    
    // bai 30
//    public static int n, s, t;
//    public static int[][]a = new int [21][21];
//    public static int []di = {-1, 0, 1, 0};
//    public static int []dj = {0, 1, 0, -1};
//    public static int loang(int i, int j){
//        int cnt = 1;
//        a[i][j] = 1;
//        for (int k = 0; k < 4; k++){
//            int i1 = i + di[k];
//            int j1 = j + dj[k];
//            if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < n && a[i1][j1] == 0){
//                cnt += loang(i1, j1);
//            }
//        }
//        return cnt;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        s = sc.nextInt();
//        t = sc.nextInt();
//        --s; --t;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.print(loang(s, t));
//    }
    
    // bai 30
//    public static int n = 0, cnt = 0;
//    public static int [][]a = new int [21][21];
//    public static int []di = {-1, 0, 1, 0};
//    public static int []dj = {0, 1, 0, -1};
//    public static void loang(int i, int j){
//        a[i][j] = 1;
//        ++cnt;
//        for (int k = 0; k < 4; k++){
//            int i1 = i + di[k]; int j1 = j + dj[k];
//            if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < n && a[i1][j1] == 0){
//                loang(i1, j1);
//            } 
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        n = sc.nextInt();
//        int s = sc.nextInt();
//        int t = sc.nextInt();
//        --s; --t;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        loang(s, t);
//        System.out.println(cnt);
//    }
}