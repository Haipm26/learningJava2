/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(5);
//        arr.add(4);
//        arr.add(1);
//        for (int i = 0; i < arr.size(); i++){
//            System.out.println(arr.get(i));
//        }
//        for (int x : arr){
//            System.out.println(x);
//        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
//        arr.set(2, 100);
//        arr.remove(2);
//        // xoa phan tu dau tien
//        arr.remove((Object)1);
//        for (int x : arr){
//            System.out.print(x + " ");
//        }
//        System.out.println(arr.indexOf(2));
//        System.out.println(arr.indexOf(100));
//        Object[] a = arr.toArray();
//        for (int i = 0; i < n; i++){
//            System.out.println(a[i]);
//        }
//        arr.sort(new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//              
//          });
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }      
        });
          for (int x : arr){
              System.out.print(x + " ");
          }
    }
    
}
