/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Pham Minh Hai
 */
public class SetMap {

    /**
     * @param args the command line arguments
     */
    // bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        HashSet<Integer> set = new HashSet<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//            map.put(a[i], 1);
//        }
//        Arrays.sort(a);
//        int cnt = 1;
//        for (int i = 1; i < n; i++){
//            if (a[i] != a[i - 1]){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//        int cnt1 = 0;
//        for (Integer x : set){
//            ++cnt1;
//        }
//        System.out.println(cnt1);
//        int cnt2 = 0;
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entrySet){
//            ++cnt2;
//        }
//        System.out.println(cnt2); 
//    }
    
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        int x = sc.nextInt();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//            map.put(a[i], 1);
//        }
//        Arrays.sort(a);
//        if (Arrays.binarySearch(a, x) >= 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        if (set.contains(x)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        if (map.containsKey(x)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    //  bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//        }
//        for (int x : set){
//            System.out.print(x + " ");
//        }
//    }
    
   // bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            int tmp = sc.nextInt();
//            if (map.containsKey(tmp) == false){
//                map.put(tmp, 1);
//            }else{
//                int tanSuat = map.get(tmp);
//                ++tanSuat;
//                map.put(tmp, tanSuat);
//            }
//        }
//        int q = sc.nextInt();
//        while (q-- != 0){
//            int check = sc.nextInt();
//            if (check == 1){
//                int x = sc.nextInt();
//                if (map.containsKey(x)){
//                    int tanSuat = map.get(x);
//                    tanSuat ++;
//                    map.put(x, tanSuat);
//                }else{
//                    map.put(x, 1);
//                }
//            }
//            else if (check == 2){
//                int x = sc.nextInt();
//                if (map.containsKey(x)){
//                    int tanSuat = map.get(x);
//                    --tanSuat;
//                    map.put(x, tanSuat);
//                }
//                if (map.get(x) == 0){
//                    map.remove(x);
//                }
//            }else{
//                int x = sc.nextInt();
//                if(map.containsKey(x)){
//                    System.out.println("Yes");
//                }else{
//                    System.out.println("NO");
//                }
//            }
//        }
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int[n];
//        int []b = new int[m];
//        TreeSet<Integer> set = new TreeSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            set.add(b[i]);
//        }
//        ArrayList <Integer> arr = new ArrayList<>();
//        for (int x : set){
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//            
//        });
//        for (int x : arr){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 10 set
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set1.add(a[i]);
//        }        
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            set2.add(b[i]);
//        }
//        for (int i = 0; i < n; i++){
//            if (set2.contains(a[i])){
//                System.out.print(a[i] + " ");
//            }
//        }
//    }
    
    // map
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            map.put(a[i], 1);
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            if (map.containsKey(b[i])){
//                map.put(b[i], 2);
//            }else{
//                map.put(b[i], 1);
//            }
//        }
//        for (int i = 0; i < n; i++){
//            if (map.get(a[i]) == 2){
//                System.out.print(a[i] + " ");
//            }
//        }
//    }
    
    // bai 12 set
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        HashSet <Integer> set1 = new HashSet <>();
//        HashSet <Integer> set2 = new HashSet <>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set1.add(a[i]);
//        } 
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            set2.add(b[i]);
//        }
//        for (int i = 0; i < n; i++){
//            if (!set2.contains(a[i]) && set1.contains(a[i])){
//                System.out.print(a[i] + " ");
//                set1.remove(a[i]);
//            }
//        }
//        for (int i = 0; i < m; i++){
//            if (!set1.contains(b[i]) && set2.contains(b[i])){
//                System.out.print(b[i] + " ");
//                set2.remove(b[i]);
//            }
//        }
//    }
    
    
    // map
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0 ; i < n; i++){
//            a[i] = sc.nextInt();
//            map.put(a[i], 1);
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            if (map.containsKey(b[i])){
//                map.put(b[i], 2);
//            }else{
//                map.put(b[i], 1);
//            }
//        }
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entrySet){
//            if (entry.getValue() == 1){
//                System.out.println(entry.getKey() + " ");
//            }
//        }
//    }
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int []a = new int [n];
//        int []b = new int [m];
//        HashSet<Integer> set1 = new HashSet <>();
//        HashSet<Integer> set2 = new HashSet <>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            set1.add(a[i]);
//        } 
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//            set2.add(b[i]);
//        } 
//        for (int i = 0; i < n; i++){
//            if (!set2.contains(a[i])){
//                System.out.print(a[i] + " ");
//            }
//        }
//    }
    
    // bai 14
    
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int [n];
//        HashSet <Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int q = sc.nextInt();
//        while (q-- != 0){
//            int l = sc.nextInt();
//            for (int i = n - 1; i >= l; i--){
//                set.add(a[i]);
//            }
//            System.out.println(set.size());
//        }
//                
//    }
    
    // bai 15
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []a = new int [n];
        int []b = new int [n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--){
            set.add(a[i]);
            b[i] = set.size();
        }
        int q = sc.nextInt();
        while (q-- != 0){
            int tmp = sc.nextInt();
            System.out.println(b[tmp]);
        }
    }
}
