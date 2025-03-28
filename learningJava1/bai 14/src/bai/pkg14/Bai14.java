/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg14;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
//    public static String convert (String s){
//        String res = "";
//        for (int i = 0; i < s.length(); i++){
//            res += Character.toLowerCase(s.charAt(i));
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = "";
//        int n = sc.nextInt();
//        sc.nextLine();
//        String s = sc.nextLine();
//        System.out.print(n + " " + s);
//        System.out.println(s.length());
//        System.out.println(s.charAt(0));
//        for (char x : s.toCharArray()){
//            System.out.println(x + " ");
//        }
//        s = s.toUpperCase();
//        System.out.println(s);
//        String t = "Python nhu cac";
////        s = s.concat(t);
////        s = t.concat(s);
//        s = s + t + 100;
//        System.out.print(s);
//        String u = "java";
//        String v = "python";
//        System.out.print(u.compareTo(v));
//        // so sanh mac ke in hoa
//        System.out.print(u.compareToIgnoreCase(v));
//        System.out.print(u.equals(v));
//        System.out.print(s.substring(5));
//        System.out.print(s.subSequence(5, 7));
//        System.out.print(s.contains("java"));
//          String s = sc.nextLine();
//          System.out.print(convert(s));
//            String s = sc.nextLine();
//            String s = "toi yeu      java";
//            String []a = s.split(" ");
//            String []a = s.split("\\s+");
//            Arrays.sort(a);
//            s = s.replace(',', ' ');
//            s = s.replace('.', ' ');
//            s = s.replace('_', ' ');
//            s = s.replace(';', ' ');
//            String []a = s.split("\\s++");
//            for (int i = 0; i < a.length; i++){
//                System.out.println(a[i] + " ");
//            }
//            ArrayList<String> arr = new ArrayList<>();
//            StringTokenizer st = new StringTokenizer(s);
//            while(st.hasMoreTokens()){
//                arr.add(st.nextToken());
//                System.out.println(st.nextToken());
//            }
//            for (String x : arr){
//                System.out.println(x);
//            }
//            
//    }
    // bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(s, "/");
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            if (token.length() < 2){
//                System.out.print('0');
//            }
//            System.out.print(token);
//            if (token.length() < 4){
//                System.out.print("/");
//            }
//        }
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.print(sb.toString());
//        sb.delete(1, 3);
//        sb.deleteCharAt(0);
//        System.out.print(sb.toString());
//        System.out.print(Integer.parseInt(s));
//        int []cnt = new int [256];
//        for (char x : s.toCharArray()){
//            cnt[x]++;
//        }
//        for (int i = 0; i < 256; i++){
//            if (cnt[i] != 0){
//                System.out.println((char)i + " " + cnt[i]);
//            }
//        }
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char x : s.toCharArray()){
//            if (map.containsKey(x)){
//                map.put(x, map.get(x) + 1);
//            }else{
//                map.put(x, 1);
//            }
//        }
//        Set<Map.Entry<Character, Integer>> set = map.entrySet();
//        for (Map.Entry<Character, Integer> entrySet : set){
//            System.out.println(entrySet.getValue() + " " + entrySet.getKey());
//        }
        
//        BigInteger a = new BigInteger("2152345454543544343435");
//        BigInteger b = new BigInteger("1212121212121");
//        System.out.println(a.add(b));
//        System.out.println(a.subtract(b));
//        System.out.println(a.multiply(b));
//        System.out.println(a.divide(b));
//        String tmp = String.format("%04d", 17);
//        System.out.println(tmp);
//        System.out.print(s.trim());
//    }
//    public static void main(String[] args) {
//        sinhVien x = new sinhVien();
//        x.speak();
//        x.smile();
//    }
    
    
    // kiem tra chia het voi so to
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        BigInteger a = sc.nextBigInteger();
//        BigInteger b = sc.nextBigInteger();
//        BigInteger zero = new BigInteger("0");
//        if (a.mod(b).equals(zero)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
//    public static void main(String[] args) {
//        sinhVien x = new sinhVien();
//        sinhVien y = new sinhVien("HAI", "10", 9.0);
//        System.out.println(y.getCntSv());
//        System.out.println(sinhVien.getCnt());

//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sinhVien []a = new sinhVien[n];
//        Collections.sort(a, new Comparator<sinhVien(){
//            
//        });
//    }
    
}
