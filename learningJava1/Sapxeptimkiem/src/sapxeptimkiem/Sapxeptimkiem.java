/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sapxeptimkiem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Pham Minh Hai
 */
public class Sapxeptimkiem {

//    public static int cntEven(int n){
//        int cnt = 0;
//        if (n == 0) return 1;
//        while (n >= 1){
//            if (n % 10 % 2 == 0){
//                ++cnt;
//            }
//            n /= 10;
//            
//        }
//        return cnt;
//    }
//    
//    public static int cntOdd(int n){
//        int cnt = 0;
//        while (n >= 1){
//            if ((n % 10) % 2 == 1){
//                ++cnt;
//            }
//            n /= 10;
//        }
//        return cnt;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Integer> a = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            int tmp = sc.nextInt();
//            arr.add(tmp);
//            a.add(tmp);
//        }
//        Collections.sort(arr, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (cntEven(o1) < cntEven(o2)){
//                    return -1;
//                }else if (cntEven(o1) == cntEven(o2)){
//                    return o1 - o2;
//                }else{
//                    return 1;
//                }
//            }
//        });
//        for (int i = 0; i < n; i++){
//            System.out.print(arr.get(i) + " ");
//        }
//        System.out.println(" ");
////        ArrayList<Integer> a = new ArrayList<>();
////        for (int i = 0; i < n; i++){
////            if (arr.get(i) % 2 == 1){
////                a.add(arr.get(i));
////                arr.remove(i);
////            }
////        }
////        Collections.sort(a, new Comparator<Integer>(){
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                if (cntOdd(o1) < cntOdd(o2)){
////                    return -1;
////                }else{
////                    return 1;
////                }
////            }
////        });
////        for (int x : arr){
////            System.out.print(x + " ");
////        }
////        for (int x : a){
////            System.out.print(x + " ");
////        }
//          Collections.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return cntOdd(o1) - cntOdd(o2);
//            }
//              
//          });
//          for (int x : a){
//              System.out.print(x + " ");
//          }
//    }
    
    
    // bai 2 chua lam duoc
    
//    
//    public static int hieuX(int n, int x){
//        return Math.abs(n - x);
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        int x = sc.nextInt();
//        
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (hieuX(o1, x) < hieuX(o2, x)){
//                    return -1;
//                }else if (hieuX(o1, x) > hieuX(o2, x)){
//                    return 1;
//                }else{
//                    return o1 - o2;
//                }
//            }
//            
//        });
//        for (int b : a){
//            System.out.print(b + " ");
//        }
//    }
// 
    
    // bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//        }
//        int cnt = 0;
//        for (int x : set){
//            ++cnt;
//        }
//        System.out.print(cnt);
//    }
//    
    
    // bai 1.2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        for (int x : a){
//            System.out.print(x + " ");
//        }
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println("");
//        for (int x : a){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Math.abs(o1) - Math.abs(o2);
//            }
//            
//        });
//        for (int x : a){
//            System.out.print(x + " ");
//        }
//    }
    
    
    // bai 3
//    public static int tongCS(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {   
//                if (tongCS(o1) != tongCS(o2)){
//                    return tongCS(o1) - tongCS(o2);
//                }else{
//                    return o1 - o2;
//                }
//            }
//            
//        });
//        for (int x : a){
//            System.out.print(x + " ");
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
//        Arrays.sort(a);
//        int min = 9999;
//        for (int i = 1; i < n; i++){
//            min = Math.min(min, a[i] - a[i - 1]);
//        }
//        System.out.print(min);
//    }
    
    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            if (map.containsKey(a[i])){
//                int tanSuat = map.get(a[i]);
//                ++tanSuat;
//                map.put(a[i], tanSuat);
//            }else{
//                map.put(a[i], 1);
//            }
//        } 
//        int value = 0, tanSuat = 0;
//        for (int i = 0; i < n; i++){
//            if (map.containsKey(a[i])){
//                if (map.get(a[i]) > tanSuat){
//                    tanSuat = map.get(a[i]);
//                    value = a[i];
//                    map.remove(a[i]);
//                }else if (map.get(a[i]) == tanSuat){
//                    if (a[i] < value){
//                        value = a[i];
//                        tanSuat = map.get(a[i]);
//                        map.remove(a[i]);
//                    }
//                }
//            }
//        }
//        System.out.print(value + " " + tanSuat);
//    }
    
    // bai 5 cach 2 dung sort
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        int cnt = 1, ans = 1, res = a[0];
//        for (int i = 1; i < n; i++){
//            if (a[i] == a[i - 1]){
//                ++cnt;
//            }else{
//                if (cnt > ans){
//                    ans = cnt;
//                    res = a[i - 1];
//                }
//                cnt = 1;
//            }
//        }
//        if (cnt > ans){
//            ans = cnt;
//            res = a[n - 1];
//        }
//        System.out.print(res + " " + ans);
//    }
    
    
    // bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []b = new int [n + 1];
//        int []c = new int [m + 1];
//        for (int i = 1; i <= n; i++){
//            b[i] = sc.nextInt();
//        }
//        for (int i = 1; i <= m; i++){
//            c[i] = sc.nextInt();
//        }
//        int i = 1, j = 1;
//        while (i <= n && j <= m){
//            if (b[i] <= c[j]){
//                System.out.print ("b" + "" + i + " ");
//                ++i;
//            }else{
//                System.out.print ("c" + "" + j + " ");
//                ++j;
//            }
//        }
//        while (i <= n){
//            System.out.print("b" + "" + i + " ");
//            ++i;
//        }
//        while (j <= m){
//            System.out.print("c" + "" + j + " ");
//            ++j;
//        }
//    }
    
    // bai 9
//    public static boolean binarySearch(int a[], int n, int x){
//        int l = 0, r = n - 1;
//        while (l <= r){
//            int m = (l + r) / 2;
//            if (m > x){
//                r = m - 1;
//            }
//            else if (m < x){
//                l = m + 1;
//            }else{
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int q = sc.nextInt();
//        while (q-- != 0){
//           int x = sc.nextInt();
//           System.out.println(binarySearch(a, n, x));
//        }
//    }
    
    // Bai 12 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//        }
//        int i = 0, j = 0;
//        int cnt = 0;
//        while (i < n && j < m){
//            if (a[i] > b[j]){
//                ++i; ++j;
//                ++cnt;
//            }else{
//                ++i;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer>(){
          
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        int weight = 99999999;
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            if (weight == 0){
//                break;
//            }
//            weight = Math.min(weight - 1, a[i]);
//            ++cnt;
//        }
//        System.out.print(cnt);
//    }
    
    // bai 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        int decline = 0;
//        int sumMilk = 0;
//        for (int i = 0; i < n; i++){
//           int milk = 0;
//           if (a[i] - decline < 0){
//               milk = 0;
//           }
//           else{
//               milk += a[i] - decline;
//           }
//           sumMilk += milk;
//           ++decline;
//        }
//        System.out.println(sumMilk);
//    }
    
    
    // bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 1;
//        Arrays.sort(a);
//        for (int i = 1; i < n; i++){
//            if (a[i] - a[i - 1] > k){
//                ++cnt;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 17 cach 1
//    public static int []cnt = new int [1000000];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            ++cnt[a[i]];
//        }
//        int dem = 0;
//        for (int i = 0; i <= k / 2; i++){
//            if (i != k - i){
//                dem += cnt[i] * cnt [k - i];
//            }
//            else{
//                dem += (cnt[i] - 1) * cnt[i] / 2;
//            }
//        }
//        System.out.print(dem);
//    }
    
    // cach 2
//    
//    public static int firstPos(int []a, int l, int r, int x){
//        int res = -1;
//        while (l <= r){
//            int m = (l + r) / 2;
//            if (a[m] > x){
//                r = m - 1;
//            }else if(a[m] < x){
//                l = m + 1;
//            }else{
//                res = m;
//                r = m - 1;
//            }
//        }
//        return res;
//    }
//    
//    public static int lastPos(int []a, int l, int r, int x){
//        int res = -1;
//        while (l <= r){
//            int m = (l + r) / 2;
//            if (a[m] > x){
//                r = m - 1;
//            }else if (a[m] < x){
//                l = m + 1;
//            }else{
//                res = m;
//                l = m + 1;
//            }
//        }
//        return res;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        } 
//        int cnt = 0;
//        Arrays.sort(a);
//        for (int i = 0; i < n; i++){
//            int tmp = k - a[i];
//            int t1 = firstPos(a, i + 1, n - 1, tmp);
//            int t2 = lastPos(a, i + 1, n - 1, tmp);
//            if (t1 != -1){
//                cnt += (t2 - t1 + 1);
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 18 
//    public static int pos(int []a, int l, int r, int x){
//        int res = -1;
//        while (l <= r){
//            int m = (l + r) / 2;
//            if (a[m] >= x){
//                r = m - 1;
//            }else{
//                res = m;
//                l = m + 1;
//            }
//            
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int []a = new int [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        Arrays.sort(a);
//        for (int i = 0; i < n; i++){
//            int remain = k - a[i];
//            int p = pos(a, i + 1, n - 1, remain);
//            if (p != -1){
//                cnt += (p - i - 1 + 1);
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 19 
//    public static int findPos(int a[], int n, int l, int r, int x){
//        int res = -1;
//        while (l <= r){
//            int m = (l + r) / 2;
//            if (a[m] > x){
//                res = m;
//                r = m - 1;
//            }else if (a[m] <= x){
//                l = m + 1;
//            }
//        }
//        return res;
//    } 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int k = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int cnt = 0;
//        Arrays.sort(a);
//        for (int i = 0; i < n; i++){
//            int re = k - a[i];
//            int p = findPos(a, n, i + 1, n - 1, re);
//            if (p != -1){
//                cnt += n - 1 - p + 1;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 20 cach for 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int cnt =0;
//        int max = -1, min = 9999999;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            min = Math.min(min, a[i]);
//            max = Math.max(max, a[i]);
//        }
//        Arrays.sort(a);
//        for (int i = 1; i < n; i++){
//            if (a[i] - a[i - 1] != 1){
//                ++cnt;
//            } 
//        }
//        System.out.println(cnt);
//    }
    
    // bai 20 cach toan
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        HashSet<Integer> set = new HashSet<>();
//        int max = -1, min = (int)1e9;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//            max = Math.max(max, a[i]);
//            min = Math.min(min, a[i]);
//        }
//        System.out.print(max - min + 1 - set.size());
//    }
    
    // bai 21
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        HashSet <Integer> set1 = new HashSet<>();
//        HashSet <Integer> set2 = new HashSet<>();
//        HashSet <Integer> set3 = new HashSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set1.add(a[i]);
//            set3.add(a[i]);
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            set2.add(b[i]);
//            set3.add(b[i]);
//        }
//        for (int i = 0; i < n; i++){
//            if (set2.contains(a[i])){
//                System.out.print(a[i] + " ");
//            }
//        }
//        System.out.println(" ");
//        for (int x : set3){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 22
//    public static void cntDigit(int []cnt, int n){
//        if (n == 0) ++cnt[0];
//        while (n > 0){
//            int tmp = n % 10;
//            cnt[tmp]++;
//            n /= 10;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int []cnt = new int [1000000];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            cntDigit(cnt, a[i]);
//        }
//        for (int i = 0; i < 1000000; i++){
//            if (cnt[i] != 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // bai 24 sai vi phan tu dau luon cong de bai chi bao sap xep
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int sum = 0;
//        Arrays.sort(a, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        int minus = 0;
//        for (int i = 0; i < n; i++){
//            if (minus <= k){
//                sum += a[i];
//                ++minus;
//            }else{
//                sum -= a[i];
//            }
//        }
//        System.out.print(sum);
//    }
    
    // bai 24 true
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        Integer []a = new Integer [n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int sum = a[0];
//        Arrays.sort(a, 1, n, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//            
//        });
//        for (int i = 1; i < n; i++){
//            if (k != 0){
//                sum += a[i];
//                --k;
//            }else{
//                sum -= a[i];
//            }
//        }
//        System.out.print(sum);
//    }
    
    // bai 25 mang 1 chieu ko lam duoc vi ko sort dc mang t sao cho van giu gia tri d tuong ung voi t
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []t = new int[n];
//        int []d = new int[n];
//        for (int i = 0; i < n; i++){
//            t[i] = sc.nextInt();
//            d[i] = sc.nextInt();
//        }
//        int curTime= 0;
//        for (int i = 0; i < n; i++){
//            if (t[i] > curTime){
//                curTime = t[i];
//            }
//            curTime += d[i];
//        }
//        System.out.println(curTime);
//    }
        
    // cach 2 mang 2 chieu 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Integer [][]a = new Integer [n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(a, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0];
            }
        });
        int curTime = 0;
        for (int i = 0; i < n; i++){
            if (a[i][0] > curTime){
                curTime = a[i][0];
            }
            curTime += a[i][1];
        }
        System.out.print(curTime);
    }
    
    
    
    
    
    // bai 30 copilot
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int l = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        double dMax = 0;
//        Arrays.sort(a);
//        for (int i = 1; i < n; i++){
//            dMax = (double)Math.max(a[i] - a[i - 1], dMax);
//        }
//        dMax = (double)Math.max(dMax / 2, Math.max(l - a[n - 1], a[0] - 0));
//        System.out.printf("%.10f", dMax);
//    }
    
    
    
    
    // bai 26
//    public static boolean binarySearch(int []a, int n, int x){
//        int l = 0, r = n - 1;
//        while (l <= r){
//            int m = (l + r) / 2;
//            if (m > x) r = m - 1;
//            else if (m < x) l = m + 1;
//            else return true;
//        }
//        return false;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        int x = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a);
//        for (int i = 0; i < n; i++){
//            if (a[i] > x){
//                if(binarySearch(a, n, a[i] - x)){
    // binarySearch(a, i + 1, n, a[i] -x)
    // co the dung ham luon
//                    System.out.print("1");
//                    return;
//                }
//            }
//        }
//        System.out.print("-1");
//        
//    }
}
