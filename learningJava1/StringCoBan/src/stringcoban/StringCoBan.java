/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcoban;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Pham Minh Hai
 */
public class StringCoBan {

    /**
     * @param args the command line arguments
     */
    // bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        if(s.length() % 2 == 0){
//            System.out.println("NOT FOUND");
//        }else{
//            int mid = s.length() % 2 + 1;
//            System.out.println(s.charAt(mid));
//        }
//    }
    
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        for (int i = s.length() - 1; i >= 0; i--){
//            System.out.print(s.charAt(i));
//        }
//        System.out.println("");
//        s = s.toLowerCase();
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);
//    }
    
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                char c = s.charAt(i);
//                sum += c - '0';
//            }
//        }
//        System.out.print(sum);
//    }
    
    // bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        boolean check = true;
//        for (int i = 1; i < s.length(); i++){
//            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1){
//                check = false;
//                break;
//            }
//        }
//        if (check == false){
//            System.out.print("NO");
//            
//        }else{
//            System.out.print("YES");
//        }
//    }
    
    // bai 5 cach 1
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int cnt = 0;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = s.length() - 1; i >= 0; i--){
//            ++cnt;
//            if (cnt == 3){
//                set.add(i -1);
//                cnt = 0;
//            }
//        }
//        for (int i = 0; i < s.length(); i++){
//            System.out.print(s.charAt(i));
//            if (set.contains(i)){
//                System.out.print(",");
//            }
//        }
//    }
    
    // bai 5 cahc 2 string builder
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder("");
//        int cnt = 0;
//        for (int i = s.length() - 1; i >= 0; i--){
//            sb.append(s.charAt(i));
//            ++cnt;
//            if (cnt % 3 == 0 && i != 0){
//                sb.append(",");
//            }
//        }
//        System.out.print(sb.reverse().toString());
//    }
    
    // bai 6

//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        ArrayList<Character> arr = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++){
//            arr.add(s.charAt(i));
//        }
//        Collections.sort(arr, new Comparator<Character>(){
//            @Override
//            public int compare(Character o1, Character o2) {
//                return o1 - o2;
//            }
//            
//        });
//        for (char x : arr){
//            if (x != '0'){
//                System.out.print(x);
//            }
//        }
//    }
    
    // bai 6 cach 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        char []a = s.toCharArray();
//        Arrays.sort(a);
//        int idx = 0;
//        while (idx < a.length - 1 && a[idx] == '0'){
//            ++idx;
//        }
//        for (int i = idx; i < a.length; i++){
//            System.out.print(a[i]);
//        }
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                System.out.print(s.charAt(i));
//            }
//        }
//        System.out.println("");
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isAlphabetic(s.charAt(i))){
//                System.out.print(s.charAt(i));
//            }
//        }
//    }
    
    // bai 8
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        ArrayList<Character> arr = new ArrayList<>();
//        arr.add('2');
//        arr.add('8');
//        arr.add('t');
//        arr.add('e');
//        arr.add('c');
//        arr.add('h');
//        HashSet<Character> set = new HashSet<>();
//        for (int i = 0; i < s.length(); i++){
//            if (arr.contains(s.charAt(i)) == false){
//                System.out.print(s.charAt(i));
//            }
//            set.add(s.charAt(i));
//        }
//        if (set.size() == arr.size()){
//            System.out.println("EMPTY");
//        }
//    }
    
    // bai 8 cach 2 xoa
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < sb.length(); i++){
//            char c =  sb.charAt(i);
//            if (c == '2' || c == '8' || c == 't' || c == 'e' || c == 'c' || c == 'h'){
//                sb.deleteCharAt(i);
//                --i;
//            }
//        }
//        if (sb.length() == 0){
//            System.out.print("EMPTY");
//        }else{
//            System.out.print(sb.toString());
//        }
//    }
//    
    
    // bai 8 cach 3 them
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String res = "";
//        for (int i = 0; i < s.length(); i++){
//            char c =  s.charAt(i);
//            if (!(c == '2' || c == '8' || c == 't' || c == 'e' || c == 'c' || c == 'h')){
//                res += c;
//            }
//        }
//        if (res.length() == 0){
//            System.out.print("EMPTY");
//        }else{
//            System.out.print(res);
//        }
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int k = sc.nextInt();
//        for (int i = 0; i < s.length(); i++){
//            if (i == k){
//                System.out.print("28tech");
//            }
//            System.out.print(s.charAt(i));
//        }
//    }
    
    //bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int k = sc.nextInt();
//        StringBuilder sb = new StringBuilder(s);
//        sb.insert(k, "28tech");
//        System.out.print(sb.toString());
//    }
    
    // bai 10
//    public static void main(String[] args) {
//        Scanner sc= new Scanner (System.in);
//        String s = sc.nextLine();
//        ArrayList<Character> arr = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++){
//            if (arr.contains(s.charAt(i)) == true){
//                System.out.print(s.charAt(i));
//                break;
//            }
//            arr.add(s.charAt(i));
//        }
//    }
    
    // bai 11 cach 1
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
    
    // bai 11 cach 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String[]arr = s.split("/");
//        String ans = String.format("%02d", Integer.parseInt(arr[0])) + "/";
//        ans += String.format("%02d", Integer.parseInt(arr[1])) + "/" + arr[2];
//        System.out.print(ans);
//    }
    
    // bai 11 cach 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        if (sb.charAt(1) == '/'){
//            sb.insert(0, "0");
//        }
//        if (sb.charAt(4) == '/'){
//            sb.insert(3, "0");
//        }
//        System.out.print(sb.toString());
//    }
    
    // bai 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int cnt = 0;
//        StringTokenizer st = new StringTokenizer(s, " ");
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            boolean check = true;
//            for (int i = 0; i < token.length(); i++){
//                if (Character.isUpperCase(token.charAt(i)) == false){
//                    check = false;
//                    break;
//                }
//            }
//            if (check){
//                ++cnt;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 12 cach 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String []arr = s.split(" ");
//        int cnt = 0;
//        for (String x : arr){
//            if (x.compareTo(x.toUpperCase()) == 0){
//                ++cnt;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        s = s.replace('.', ' ');
//        s = s.replace(',', ' ');
//        s = s.replace('!', ' ');
//        s = s.replace('?', ' ');
//        StringTokenizer st = new StringTokenizer(s, " ");
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            System.out.print(token + " ");
//        }
//    }
    
    // bai 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String tech = "28tech";
//        String []a = s.split(" ");
//        int cnt = 0;
//        for (int i = 0; i < a.length; i++){
//            if (a[i].compareToIgnoreCase(tech) == 0){
//                ++cnt;
//            }
//        }
//        System.out.print(cnt);
//    }
    
    // bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(s, " ");
//        int cnt = 0;
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            ++cnt;
//            if (cnt % 2 == 0){
//                for (int i = token.length() - 1; i >= 0; i--){
//                    System.out.print(token.charAt(i));
//                }
//            }else{
//                System.out.print(token);
//            }
//            if (cnt != s.length()){
//                System.out.print(" ");
//            }
//        }
//    }
    
    // bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        ArrayList<Character> arr = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++){
//            arr.add(s.charAt(i));
//        }
//        Collections.sort(arr, new Comparator<Character>(){
//            @Override
//            public int compare(Character o1, Character o2) {
//                return o1 - o2;
//            }
//            
//        });
//        for (char x : arr){
//            System.out.print(x);
//        }
//        System.out.println("");
//        Collections.sort(arr, new Comparator<Character>(){
//            @Override
//            public int compare(Character o1, Character o2) {
//                return o2 - o1;
//            }
//            
//        });
//        for (char x : arr){
//            System.out.print(x);
//        }
//    }
    
    
    // bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(s, " ");
//        ArrayList<String> arr = new ArrayList<>();
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            arr.add(token);
//        }
//        Collections.sort(arr, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        for (String x : arr){
//            System.out.print(x + " ");
//        }
//        System.out.println("");
//                
//        Collections.sort(arr, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//            
//        });
//        for (String x : arr){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String []arr = s.split(" ");
//        Arrays.sort(arr);
//        for (String x : arr){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        ArrayList<String>arr = new ArrayList<>();
//        StringTokenizer st = new StringTokenizer(s, " ");
//        while (st.hasMoreTokens()){
//            arr.add(st.nextToken());
//        }
//        Collections.sort(arr, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()){
//                    return 1;
//                }else if (o1.length() < o2.length()){
//                    return -1;
//                }else{
//                    return o1.compareTo(o2);
//                }
//            }
//            
//        });
//        for (String x : arr){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine().toLowerCase();
//        HashSet<String> set = new HashSet<>();
//        String tech = "28tech";
//        StringTokenizer st = new StringTokenizer(s, " ");
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            set.add(token);
//        }
//        System.out.print(set.size());
//    }
    
    // bai 20
//    public static boolean checkTn(String s){
//        int l = 0, r = s.length() - 1;
//        while (l <= r){
//            if (s.charAt(l) != s.charAt(r)){
//                return false;
//            }
//            ++l; --r;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringTokenizer st = new StringTokenizer(s, " ");
//        ArrayList<String> arr = new ArrayList<>();
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            if (checkTn(token)){
//                arr.add(token);
//            }
//        }
//        Collections.sort(arr, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//            
//        });
//        for (String x : arr){
//            System.out.print(x + " ");
//        }
//    }
}
