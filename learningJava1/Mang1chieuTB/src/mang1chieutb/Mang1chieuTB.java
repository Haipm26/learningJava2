/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang1chieutb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Pham Minh Hai
 */
public class Mang1chieuTB {

    /**
     * @param args the command line arguments
     */
    // Bai 1;
//    public static boolean checkSnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//   
//    public static boolean checkTN(int a[], int n){
//        int l = 0, r = n - 1;
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
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int max = 0, posMax = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] > max){
//                max = a[i];
//                posMax = i;
//            }
//        }
//        System.out.println(max + " " + posMax);
//        int min = (int)Math.pow(10, 9), posMin = 0;
//        for (int i =0 ; i < n; i++){
//            if (a[i] <= min){
//                min = a[i];
//                posMin = i;
//            }
//        }
//        System.out.println(min + " " + posMin);
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (checkSnt(a[i])){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//        int tich = 1;
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                if (a[i] * a[j] > tich){
//                    tich = a[i] * a[i];
//                }
//            }
//        }
//        System.out.println(tich);
//        if (checkTN(a, n)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        int tich2 = 1;
//        for (int i = 0; i < n; i++){
//            tich2 *= a[i];
//            tich2 %= 1000000007;
//        }
//        
//        System.out.println(tich2);
//    }
    
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n - 1; i++){
//            if (a[i + 1] < a[i]){
//                System.out.println("NO");
//                return;
//            }
//        }
//        System.out.println("YES");
//    }
    
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int check = -1;
//        for (int i = 0; i < n; i++){
//            if (a[i] > check){
//                System.out.print(a[i] + " ");
//                check = a[i];
//            }
//        }
//    }
    
    // bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int s25 = 0, s50 = 0, check = 0;
//        for (int i = 0; i < n; i++){
//            if (a[i] == 25){
//                ++s25;
//                check = 1;
//            }else if (a[i] == 50){
//                ++s50;
//                --s25;
//            }else{
//                if (s50 >= 1){
//                    --s50; --s25;
//                }else{
//                    s25 -= 3;
//                }
//            }
//            if (s25 >= 0){
//                check = 1;
//            }else{
//                System.out.println("NO");
//                break;
//            }
//            
//        }
//        if (check == 1){
//            System.out.println("YES");
//        }
//    }
    
    
    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            int min = 0, max = 0;
//            if (i == 0){
//                min = Math.abs(a[i] - a[i + 1]);
//                max = Math.abs(a[i] - a[n - 1]);
//            }else if (i == n - 1){
//                min = Math.abs(a[i] - a[i - 1]);
//                max = Math.abs(a[i] - a[0]);
//            }else{
//                int d1 = Math.abs(a[i] - a[i - 1]);
//                int d2 = Math.abs(a[i] - a[i + 1]);
//                int d3 = Math.abs(a[i] - a[0]);
//                int d4 = Math.abs(a[i] - a[n - 1]);
//                max = Math.max(d3, d4);
//                min = Math.min(d1, d2);
//            }
//            System.out.println(min + " " + max);
//        }
//    }
    
    // bai 6
//    public static boolean gcd(int a, int b){
//        int tmp = b;
//        while (b != 0){
//            int r = a % b;
//            a = b;
//            b = r;
//        }
//        return a == 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                if (gcd(a[i], a[j])){
//                    ++cnt;
//                }   
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if ((o1 % 2 == 0) && (o2 % 2 == 0)) return o1 - o2;
//                else if ((o1 % 2 == 1) && (o2 % 2 == 0)) return -1;
//                else if ((o1 % 2 == 0) && (o2 % 2 == 1)) return 1;
//                else return o2 - o1;
//            }
//        });
//        for (int x : a){
//            System.out.print(x + " ");
//        }
//        
//    }
    
    // BAI 8 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int j = 0; j < m; j++){
//            b[j] = sc.nextInt();
//        }
//        int i = 0, j = 0;
//        while (i < n && j < m){
//            if (a[i] < b[j]){
//                System.out.print(a[i] + " ");
//                ++i;
//            }else{
//                System.out.print(b[j] + " ");
//                ++j;
//            }
//        }
//        while (i < n){
//            System.out.print(a[i] + " ");
//            ++i;
//        }
//        while (j < m){
//            System.out.print(b[j] + " ");
//            ++j;
//        }
//        
//   
    
    // bai 9 cach binh thuong
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []cnt = new int[10000000];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        for (int i = 0; i < 10000000; i++){
//            if (cnt[i] != 0){
//                System.out.println(i + " " + cnt[i]);
//            }
//        }
//        System.out.println(" ");
//        for (int i = 0; i < n; i++){
//            if (cnt[a[i]] != 0){
//                System.out.println(a[i] + " " + cnt[a[i]]);
//                cnt[a[i]] = 0;
//            } 
//        }
//    }
    
    // bai 9 dung map
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        int []a = new int [n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])){
                int tanSuat = map.get(a[i]);
                ++tanSuat;
                map.put(a[i], tanSuat);
            }else{
                map.put(a[i], 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++){
            if (map.containsKey(a[i])){
                System.out.println(a[i] + " " + map.get(a[i]));
                map.remove(a[i]);
            }
        }
        
        
        
    }
    
    // bai 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        int []cnt = new int [1000000];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]] = 1;
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            if (cnt[b[i]] == 1){
//                cnt[b[i]] = 2;
//            }else{
//                cnt[b[i]] = 1;
//            }
//        }
//        for (int i = 0; i < 1000000; i++){
//            if (cnt[i] == 2){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println(" ");
//        for (int i = 0; i < 1000000; i ++){
//            if (cnt[i] != 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
//    
    
    // bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        int []cnt = new int [10000000];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]] = 1;
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            if (cnt[b[i]] == 1){
//                cnt[b[i]] = 2;
//            }else{
//                cnt[b[i]] = 1;
//            }
//        }
//        for (int i = 0; i < 10000000; i++){
//            if (cnt[i] != 0){
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println(" ");
//        for (int i = 0; i < 10000000; i++){
//            if (cnt[i] == 2){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // bai 12 chua lam duoc
    
       
    // bai 13 
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int[] a = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
//        int cnt = 0;
//        for (int i = 0; i < 10; i++){
//            if (n - a[i] >= 0){
//                n -= a[i];
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        int min = 9999999, cnt = 0;
//        for (int i = 1; i < n; i++){
//            if (a[i] - a[i - 1] == min){
//                ++cnt;
//            }else if(a[i] - a[i - 1] < min){
//                min = a[i] - a[i - 1];
//                cnt = 1;
//            }
//        }
//        System.out.print(min + " " + cnt);
//    }
    
    
    // bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i ++){
//            a[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                for (int k = j + 1; k < n; k++){
//                    int max = Math.max(a[i], Math.max(a[j], a[k]));
//                    int tongb2 = (int)Math.pow(a[i], 2) + (int)Math.pow(a[j], 2) + (int)Math.pow(a[k], 2) - (int)Math.pow(max, 2);
//                    if (tongb2 == Math.pow(max, 2)){
//                        System.out.print("YES");
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println("NO");
//    }
    
    
    // bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []cnt = new int [1000000];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cnt[a[i]]++;
//        }
//        int dem = 0;
//        for (int i = 0; i < 1000000; i++){
//            if (cnt[i] >= 2){
//                dem += (cnt[i] - 1) * cnt[i] / 2;
//            }
//        }
//        System.out.println(dem);
//    }
    
    // bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        } 
//        int idx = 0, cnt = 1;
//        int cntAns = 0;
//        int []ans = new int[idx + 1];
//        int index = 0;
//        int []answer = new int [index];
//        ans[0] = a[0]; ++idx;
//        int sum = a[0], sumAns = 0;
//        for (int i = 1; i < n; i++){
//            if (a[i] != a[i - 1]){
//                ++cnt;
//                ans[idx] = a[ i];
//                ++idx;
//                sum += a[i];
//            }else{
//                if (cnt > cntAns){
//                    cntAns = cnt;
//                    for (int j = 0; j < cnt; j++){
//                        answer[index] = ans[idx];
//                        ++index;
//                    }
//                    sumAns = sum;
//                }else if(cnt == cntAns){
//                    if (sum > sumAns){
//                        sumAns = sum;
//                        for (int j = 0; j < cnt; j++){
//                            answer[index] = ans[idx];
//                            ++index;
//                        }
//                        cntAns = cnt;
//                    }
//                }
//            }
//        }
//        System.out.println(cntAns);
//        for (int x : answer){
//            System.out.print(x + " ");
//        }
//    }
}
