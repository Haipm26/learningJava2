/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        
//        int n = sc.nextInt();
//        int []a = new int [n];
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
//        Arrays.sort(a);
//        for (int i = 0; i < n; i++){
//            if (map.containsKey(a[i])){
//                System.out.print(a[i] + " " + map.get(a[i]));
//                map.remove(a[i]);
//            }
//        }



//        HashMap<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(2, 3);
//        map.put(3, 4);
//        map.put(4, 5);
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


//        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//        map.put(1, 3);
//        map.put(4, 5);
//        map.put(2, 2);
//        map.put(4, 5);
//        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(5, 4);
        map.put(4, 3);
        map.put(1, 2);
        map.put(2, 3);
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            arr.add(entry);
        }
//        for (Map.Entry<Integer, Integer> x : arr){
//            System.out.println(x.getKey() + " " + x.getValue());
//        }
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).getKey() + arr.get(i).getValue());
        }
        
    }
}
