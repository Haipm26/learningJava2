/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai11;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static boolean linearSearch(ArrayList<Integer> arr, int n, int x){
        for (int i = 0; i < n; i++){
            if (arr.get(i) == x){
                return true;
            }
        }
        return false;
    }
    
    public static boolean binarySearch(ArrayList <Integer> arr, int n, int x){
        int l = 0, r = n - 1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (arr.get(mid) == x){
                return true;
            }else if (arr.get(mid) < x){
                l = mid + 1;
            }else if (arr.get(mid) > x){
                r = mid - 1;
            }
        }
        return false;
    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            int tmp = sc.nextInt();
//            arr.add(tmp);
//        }
//        int x = sc.nextInt();
////        System.out.print(linearSearch(arr, n, x));
//        Collections.sort(arr, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//            
//        });
//        System.out.println(binarySearch(arr, n, x));
//    }
    
    //HashSet
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        HashSet<Integer> set = new HashSet<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            int tmp = sc.nextInt();
//            set.add(tmp);
//        }
//        for (int x : set){
//            System.out.print(x + " ");
//        }
//        System.out.println(" ");
////        set.remove(3);
////        for (int x : set){
////            System.out.print(x + " ");
////        }
//        if (set.contains(4)){
//            System.out.print("FOUND");
//        }else{
//            System.out.println("NOT FOUND");
//        }
//    }
    
    //LinkedHashSet
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        for (int i = 0; i < n; i++){
//            int tmp = sc.nextInt();
//            set.add(tmp);
//        }
//        for (int x : set){
//            System.out.print(x + " ");
//        }
//        System.out.println(" ");
//    }
    
    
    // TreeSet
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        for (int x : set){
            System.out.print(x + " ");
        }
    }
}
