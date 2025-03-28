/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringnangcao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.LinkedHashMap;
/**
 *
 * @author Pham Minh Hai
 */
public class StringNangCao {
    
    //bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        String name = "";
//        StringTokenizer st = new StringTokenizer(s1, " ");
//        while (st.hasMoreTokens()){
//            String token = st.nextToken();
//            name += Character.toUpperCase(token.charAt(0));
//            for (int i = 1; i < token.length(); i++){
//                name += Character.toLowerCase(token.charAt(i));
//            }
//            name += " ";
//        }
//        StringBuilder sb = new StringBuilder(s2);
//        if (sb.charAt(1) == '/'){
//            sb.insert(0, "0");
//        }
//        if (sb.charAt(4) == '/'){
//            sb.insert(3, "0");
//        }
//        System.out.println(name.trim());
//        System.out.print(sb.toString());
//    }
    
    // bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int cntDigit = 0, cntAlpha = 0, cntSpecial = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                ++cntDigit;
//            }else if (Character.isAlphabetic(s.charAt(i))){
//                ++cntAlpha;
//            }else{
//                ++cntSpecial;
//            }
//        }
//        System.out.print(cntDigit + " " + cntAlpha + " " + cntSpecial); 
//    }
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String s1 = s.toLowerCase();
//        String s2 = s.toUpperCase();
//        System.out.println(s1);
//        System.out.print(s2);
//    }
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int []cnt = new int [265];
//        for (int i = 0; i < s.length(); i++){
//            ++cnt[s.charAt(i)];
//        }
//        for (int i = 0; i < 265; i++){
//            if (cnt[i] != 0){
//                System.out.println((char)i + " " + cnt[i]);
//            }
//        }
//        System.out.println("");
//        for (int i = 0; i < s.length(); i++){
//            if (cnt[s.charAt(i)] != 0){
//                System.out.println(s.charAt(i) + " " + cnt[s.charAt(i)]);
//                cnt[s.charAt(i)] = 0;
//            }
//        }
//    }
    
    // bai 4 sai ko bt tai sao
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int []cnt = new int [257];
//        for (int i = 0; i < s.length(); i++){
//            cnt[s.charAt(i)]++;
//        }
//        int max = 0, min = (int)1e9;
//        char charMax = '0', charMin = '0';
//        for (int i = 0; i < 257; i++){
//            if (cnt[i] != 0){
//                if (cnt[i] >= max){
//                    max = cnt[i];
//                    charMax = (char)i;
//                }
//                if(cnt[i] <= min){
//                    min = cnt[i];
//                    charMin = (char)i;
//                }
//            }
//        }
//        System.out.println(charMax + " " + max);
//        System.out.print(charMin + " " + min);
//    }

    // cach dung
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int[] cnt = new int[257];
//        
//        for (int i = 0; i < s.length(); i++) {
//            cnt[s.charAt(i)]++;
//        }
//        
//        int max = 0, min = (int) 1e9;
//        char charMax = ' ', charMin = ' ';
//        
//        for (int i = 0; i < 257; i++) {
//            if (cnt[i] != 0) {
//                if (cnt[i] > max || (cnt[i] == max && (char)i > charMax)) {
//                    max = cnt[i];
//                    charMax = (char)i;
//                }
//                if (cnt[i] < min || (cnt[i] == min && (char)i > charMin)) {
//                    min = cnt[i];
//                    charMin = (char)i;
//                }
//            }
//        }
//        
//        System.out.println(charMax + " " + max);
//        System.out.print(charMin + " " + min);
//    }






    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        HashSet<Character> set1 = new HashSet<>();
//        HashSet<Character> set2 = new HashSet<>();
//        boolean[] check = new boolean [256];
//        Arrays.fill(check, false);
//        for (int i = 0; i < s1.length(); i++){
//            set1.add(s1.charAt(i));
//            check[s1.charAt(i)] = true;
//        }
//        for (int i = 0; i < s2.length(); i++){
//            set2.add(s2.charAt(i));
//            check[s2.charAt(i)] = true;
//        }
//        char []arr = s1.toCharArray();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++){
//            if (set2.contains(s1.charAt(i)) && check[s1.charAt(i)] == true){
//                System.out.print(s1.charAt(i));
//                check[s1.charAt(i)] = false;
//            }
//        }
//        System.out.println("");
//        char []a = new char [256];
//        int i = 0;
//        for (char x : set1){
//            a[i] = x;
//            ++i;
//            check[x] = true;
//        }
//        for (char x : set2){
//            a[i] = x;
//            ++i;
//            check[x] = true;
//        }
//        Arrays.sort(a);
//        for (int j = 0; j < a.length; j++){
//            if (set1.contains(a[j]) && check[a[j]] == true){
//                System.out.print(a[j]);
//                check[a[j]] = false;
//            }else if (set2.contains(a[j]) && check[a[j]] == true){
//                System.out.print(a[j]);
//                check[a[j]] = false;
//            }
//        }
//    }
    
    
    // bai 6
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        HashMap <Character, Integer> map = new HashMap<>();
//        boolean []check = new boolean [256];
//        Arrays.fill(check, false);
//        for (int i = 0; i < s1.length(); i++){
//             map.put(s1.charAt(i), 1);
//             check[s1.charAt(i)] = true;
//        }
//        for (int i = 0; i < s2.length(); i++){
//            if (check[s2.charAt(i)] == true){
//                map.put(s2.charAt(i), 2);
//            }
//            else{
//                map.put(s2.charAt(i), 1);
//            }
//        }
//        char []a = s1.toCharArray();
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++){
//            if (map.get(a[i]) == 1 && check[a[i]] == true){
//                System.out.print(a[i]);
//                check[a[i]] = false;
//            }
//        }
//        System.out.println("");
//        char []b = s2.toCharArray();
//        Arrays.sort(b);
//        for (int i = 0; i < b.length; i++){
//            if (map.get(b[i]) == 1){
//                System.out.print(b[i]);
//                map.remove(b[i]);
//            }
//        }
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        if (sb.compareTo(sb.reverse()) == 0){
//            System.out.print("YES");
//        }else{
//            System.out.print("NO");
//        }
//    }
    
    // bai 8
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String pan = "abcdefghijklmnopqrstuvwxyz";
//        String s = sc.nextLine();
//        if (s.compareToIgnoreCase(pan) == 0){
//            System.out.print("YES");
//        }else{
//            System.out.print("NO");
//        }
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner (System.in);
//        String s = sc.nextLine();
//        String[] arr = s.split(" ");
//        System.out.print(arr.length);
//    }
    
    // bai 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String []a = s.split(" ");
//        HashSet<String> set = new HashSet<>();
//        String []b = s.split(" ");
//        for (int i = 0; i < a.length; i++){
//            set.add(a[i]);
//        }
//        Arrays.sort(b);
//        for (int i = 0; i < b.length - 1; i++){
//            if (b[i].compareTo(b[i + 1]) != 0){
//                System.out.print(b[i] + " ");
//            }
//        }
//        if (b[b.length - 1] != b[b.length - 2]){
//            System.out.print(b[b.length - 1]);
//        }
//        System.out.println("");
//        for (int i = 0; i < a.length; i++){
//            if (set.contains(a[i])){
//                System.out.print(a[i] + " ");
//                set.remove(a[i]);
//            }
//        }
//    }
    
    // bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String []a = s.split(" ");
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++){
//            System.out.print(a[i] + " ");
//        }
//        System.out.println("");
//        Arrays.sort(a, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() != o2.length()){
//                    return o1.length() - o2.length();
//                }else{
//                    return o1.compareTo(o2);
//                }
//            }
//            
//        });
//        for (String x : a){
//            System.out.print(x + " ");
//        }
//    }
    
    // bai 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String []a = s.split(" ");
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < a.length; i++){
//            StringBuilder sb = new StringBuilder(a[i]);
//            if (a[i].compareTo(sb.reverse().toString()) == 0){
//                arr.add(a[i]);
//            }
//        }
//        Collections.sort(arr, new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                    return o1.length() - o2.length();
//            }
//            
//        });
//        for (int i = 0; i < arr.size(); i++){
//            System.out.print(arr.get(i) + " ");
//        }
//    }
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        HashMap<String, Integer> map = new HashMap<>();
//        String []a = s.split(" ");
//        String []b = s.split(" ");
//        for (int i = 0; i < a.length; i++){
//             if (map.containsKey(a[i])){
//                 map.put(a[i], map.get(a[i]) + 1);
//             }else{
//                 map.put(a[i], 1);
//             }
//        }
//        Arrays.sort(b);
//        System.out.println(b[0] + " " + map.get(b[0]));
//        for (int i = 1; i < b.length; i++){
//            if (b[i].compareTo(b[i - 1]) !=0){
//                System.out.println(b[i] + " " + map.get(b[i]));
//            }
//        }
//        System.out.println("");
//        for (int i = 0; i < a.length; i++){
//            if (map.containsKey(a[i])){
//                System.out.println(a[i] + " " + map.get(a[i]));
//                map.remove(a[i]);
//            }
//        }
//    }
    
    // bai 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        HashMap<String, Integer> map = new HashMap<>();
//        String []a = s.split(" ");
//        for (int i = 0; i < a.length; i++){
//            if (map.containsKey(a[i])){
//                map.put(a[i], map.get(a[i]) + 1);
//            }else{
//                map.put(a[i], 1);
//            }
//        }
//        Arrays.sort(a);
//        int max = 0, min = (int)1e9;
//        String resMax = "", resMin = "";
//        for (int i = 0; i < a.length; i++){
//            if (map.get(a[i]) >= max){
//                max = map.get(a[i]);
//                resMax = "";
//                resMax += a[i];
//            }else if (map.get(a[i]) <= min){
//                min = map.get(a[i]);
//                resMin = "";
//                resMin += a[i];
//            }
//        }
//        System.out.println(resMax + " " + max);
//        System.out.print(resMin + " " + min);
//    }
    
    // bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        char check = s2.charAt(0);
//        for (int i = 0; i < s1.length(); i++){
//            if (s1.charAt(i) == check){
//                if (s1.subSequence(i, i + s2.length()).toString().compareTo(s2) == 0){
//                    System.out.println("YES");
//                    return;
//                }
//            }
//        }
//        System.out.println("NO");
//    }
    
    
    // bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s1 = sc.nextLine().toLowerCase();
//        String s2 = sc.nextLine();
//        String birth = "";
//        String []arr = s1.split(" ");
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(Character.toUpperCase(arr[i].charAt(0)));
//            for (int j = 1; j < arr[i].length(); j++){
//                System.out.print(arr[i].charAt(j));
//            }
//            if (i != arr.length - 1){
//                System.out.print(" ");
//            }
//        }
//        String []a = s2.split("/");
//        birth += String.format("%02d", Integer.parseInt(a[0])) + "/";
//        birth += String.format("%02d", Integer.parseInt(a[1])) + "/" + a[2]; 
//        System.out.println("");
//        System.out.print(birth);
//    }
    
    // bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine().toLowerCase();
//        String []a = s.split(" ");
//        for (int i = 0; i < a.length; i++){
//            System.out.print(Character.toUpperCase(a[i].charAt(0)));
//            for (int j = 1; j < a[i].length(); j++){
//                System.out.print(a[i].charAt(j));
//            }
//            if (i == 1){
//                System.out.print(",");
//            }
//            if (i != a.length - 1){
//                System.out.print(" ");
//            }
//        }
//        System.out.println("");
//        String []arr = s.split(" ");
//        String name = arr[arr.length - 1].toUpperCase() + ", " ;
//        for (int i = 0; i < arr.length - 1; i++){
//            name += Character.toUpperCase(arr[i].charAt(0));
//            for (int j = 1; j < arr[i].length(); j++){
//                name += arr[i].charAt(j);
//            }
//            if (i != arr.length - 2){
//                name += " ";
//            }
//        }
//        System.out.print(name);
//    }
    
    // bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- > 0){
//            String s = sc.nextLine().toLowerCase();
//            String mail = "";
//            String pass = "";
//            String []a = s.split(" ");
//            mail += a[a.length - 2];
//            for (int i = 0; i < a.length - 2; i++){
//                mail += a[i].charAt(0);
//            }
//            mail += "@xyz.edu.vn";
//            String []b = a[a.length - 1].split("/");
//            for (int i = 0; i < b.length; i++){
//                if (b[i].charAt(0) == '0'){
//                    pass += b[i].charAt(1);
//                }else{
//                    pass += b[i];
//                }
//            }
//            System.out.println(mail);
//            System.out.print(pass);
//        }
//    }
    
    // bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        HashMap<String, Integer> map = new HashMap<>();
//        sc.nextLine();
//        while (t-- != 0){
//            String s = sc.nextLine().toLowerCase();
//            String []a = s.split(" ");
//            String mail = "";
//            String pass = "";
//            mail += a[a.length - 2];
//            for (int i = 0; i < a.length - 2; i++){
//                mail += a[i].charAt(0);
//            }
//            
//            if (map.containsKey(mail)){
//                int tanSuat = map.get(mail) + 1;
//                map.put(mail, tanSuat);
//                mail += Integer.toString(tanSuat);
//                mail += "@xyz.edu.vn";
//                System.out.println(mail);
//            }else{
//                map.put(mail, 1);
//                mail += "@xyz.edu.vn";
//                System.out.println(mail);
//            }
//            
//            String []b = a[a.length - 1].split("/");
//            for(int i = 0; i < b.length; i++){
//                if (b[i].charAt(0) == '0'){
//                    pass += b[i].charAt(1);
//                }else{
//                    pass += b[i];
//                }
//            }
//            System.out.println(pass);
//        }
//    }
    
    // bai 20- sai
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        StringBuilder python = new StringBuilder("python");
//        char check = 'p';
//        for (int i = 0; i < s.length(); i++){
//            if (s.charAt(i) == check){
//                StringBuilder sb = new StringBuilder(s.subSequence(i, i + python.length() + 1).toString());
//                for (int j = 0; j < sb.length(); j++){
//                    int tmp = sb.charAt(j);
//                    String tmp1 = Character.toString(tmp);
//                    sb.deleteCharAt(j);
//                    if (sb.compareTo(python) == 0){
//                        System.out.print("YES");
//                        return;
//                    }else{
//                        sb.insert(j, tmp1);
//                    }
//                }
//            } 
//        }
//        System.out.print("NO");
//    }

    // bai 21
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int m = sc.nextInt();
//        int s = sc.nextInt();
//        String max = "";
//        int tmp = s;
//        int m2 = m;
//        while (m-- != 0){
//            if (tmp >= 9){
//                max += "9";
//                tmp -= 9;
//            }else{
//                max += Integer.toString(tmp);
//                tmp = 0;
//            }
//        }
//        if (tmp != 0){
//            System.out.print("NOT FOUND");
//            return;
//        }
//        StringBuilder sb = new StringBuilder("");
//        s -= 1;
//        while (m2 -- != 0){
//            if (s >= 9){
//                sb.insert(0, "9");
//                s -= 9;
//            }else{
//                if (m2 == 0){
//                    int sum = s + 1;
//                    sb.insert(0, Integer.toString(sum));
//                }else{
//                    sb.insert(0, Integer.toString(s));
//                    s = 0;
//                }
//            }
//        
//        }
//        System.out.println(sb);
//        System.out.println(max);
//    }
    
    
    // bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String res = "";
//        String tmp = Character.toString(s.charAt(0));
//        for (int i = 1; i < s.length(); i++){
//            if (s.charAt(i) == s.charAt(i - 1)){
//                tmp += s.charAt(i);
//            }else{
//                if (tmp.length() > res.length()){
//                    res = tmp;
//                }else if(tmp.length() == res.length()){
//                    if (tmp.compareTo(res) > 0){
//                        res = tmp;
//                    }
//                }
//                tmp = Character.toString(s.charAt(i));
//            }
//        }
//        if (tmp.length() > res.length() || (tmp.length() == res.length() && tmp.compareTo(res) > 0)){
//            res = tmp;
//        }
//     
//        System.out.print(res);
//    }
    
    
    // bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String res = "";
//        String tmp = Character.toString(s.charAt(0));
//        
//        for (int i = 1; i < s.length(); i++){
//            if (s.charAt(i) != s.charAt(i - 1)){
//                tmp += s.charAt(i);
//            }else{
//                if (tmp.length() > res.length()){
//                    res = tmp;
//                }else if (tmp.length() == res.length()){
//                    if (tmp.compareTo(res) > 0){
//                        res = tmp;
//                    }
//                }
//                tmp = Character.toString(s.charAt(i));
//            }
//        }
//        if (tmp.length() > res.length() || (tmp.length() == res.length() && tmp.compareTo(res) > 0)){
//            res = tmp;
//        }
//        System.out.print(res);
//    }
    
    // bai 28
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int res = 0;
//        String tmp = "";
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                tmp += s.charAt(i);
//            }else{
//                if (!tmp.isEmpty() && Integer.parseInt(tmp) > res){
//                    res = Integer.parseInt(tmp);
//                }
//                tmp = "";
//            }
//        }
//        System.out.print(res);
//    }
    
    // bai 29
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        long sum = 0;
//        String tmp = "";
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                tmp += s.charAt(i);
//            }else{
//                if (!tmp.isEmpty()){
//                    sum += Long.parseLong(tmp);
//                }
//                tmp = "";
//            }
//        }
//        if (Character.isDigit(s.charAt(s.length() - 1))){
//            sum += Long.parseLong(tmp);
//        }
//        System.out.println(sum);
//    }
    
    //bai 30
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String tmp = "";
//        StringBuilder sb = new StringBuilder("");
//        for (int i = 0; i < s.length(); i++){
//            if (Character.isDigit(s.charAt(i))){
//                tmp += s.charAt(i);
//            }
//            else{
//                if (!tmp.isEmpty()){
//                    if (sb.isEmpty()){
//                        sb.append(tmp);
//                    }else{
//                        if (Integer.parseInt(sb.toString()) >= Integer.parseInt(tmp)){
//                            sb.append(tmp);
//                        }else{
//                            sb.insert(0, tmp); 
//                        }
//                        
//                    }
//                    
//                }
//                tmp = "";
//            }   
//        }
//        if (!tmp.isEmpty()){
//                    if (sb.isEmpty()){
//                        sb.append(tmp);
//                    }else{
//                        if (Integer.parseInt(sb.toString()) >= Integer.parseInt(tmp)){
//                            sb.append(tmp);
//                        }else{
//                            sb.insert(0, tmp); 
//                        }
//                    }
//                }
//        System.out.print(sb);
//   }
    
    // bai 31
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++){
//            sum += Integer.parseInt(Character.toString(s.charAt(i)));
//        }
//        System.out.print(sum);
//    }
    
    
    // bai 32
//    public static boolean []prime = new boolean [1000001];
//    public static void sang(){
//        Arrays.fill(prime, true);
//        prime[0] = false;
//        prime[1] = false;
//        for (int i = 2; i <= Math.sqrt(1000000); i++){
//            if (prime[i] == true){
//                for (int j = i * i; j <= 1000000; j += i){
//                    prime[j] = false;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        
//        int sum = 0;
//        sang();
//        for (int i = 0; i < s.length(); i++){
//            if (prime[Integer.parseInt(Character.toString(s.charAt(i)))] == false){
//                System.out.println("NO");
//                return;
//            }else{
//                sum += Integer.parseInt(Character.toString(s.charAt(i)));
//            }
//        }
//        if (prime[sum]){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 33
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        boolean check1 = false;
//        boolean check2 = false;
//        StringBuilder sb = new StringBuilder(s);
//        for (int i = 0; i < sb.length(); i++){
//            if (sb.charAt(i) == '6'){
//                check1 = true;
//            }
//        }
//        if (sb.compareTo(sb.reverse()) == 0){
//            check2 = true;
//        }
//        if (check1 == true && check2 == true){
//            System.out.println("YES");
//        } else{
//            System.out.println("NO");
//        }
//    }
    
    
    // bai 34
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        boolean check1 = true;
//        boolean check2 = true;
//        for (int i = 1; i < s.length(); i++){
//            int s1 = Integer.parseInt(Character.toString(s.charAt(i -1)));
//            int s2 = Integer.parseInt(Character.toString(s.charAt(i)));
//            if (s2 - s1 > 0){
//                check1 = false;
//            }
//        }
//        for (int i = 1; i < s.length(); i++){
//            int s1 = Integer.parseInt(Character.toString(s.charAt(i -1)));
//            int s2 = Integer.parseInt(Character.toString(s.charAt(i)));
//            if (s1 - s2 > 0){
//                check2 = false;
//            }
//        }
//        if (check1 || check2){
//            System.out.print("YES");
//        }else{
//            System.out.print("NO");
//        }
//    }
    
    // bai 35
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++){
//            sum += Integer.parseInt(Character.toString(s.charAt(i)));
//        }
//        if (sum % 3 == 0 && Integer.parseInt(Character.toString(s.charAt(s.length() - 1))) % 2 == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 36
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        if (s.length() < 2){
//            if (Integer.parseInt(Character.toString(s.charAt(0))) % 4 == 0){
//                System.out.println("YES");
//                return;
//            }else{
//                System.out.println("NO");
//                return;
//            }
//        }else{
//            String s1 = "";
//            s1 += s.charAt(s.length() - 2) + s.charAt(s.length() - 1);
//            if (Integer.parseInt(s1) % 4 == 0){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
//        }
//    }
    
    // bai 37
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int lastDigit = Integer.parseInt(Character.toString(s.charAt(s.length() - 1)));
//        if (lastDigit % 3 == 0 && lastDigit % 5 == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 38
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String lastDigit = "";
//        lastDigit += s.charAt(s.length() - 2) + s.charAt(s.length() - 1);
//        if (Integer.parseInt(lastDigit) % 25 == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 39
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (i % 2 == 0){
//                sum1 += Integer.parseInt(Character.toString(s.charAt(i)));
//            }else{
//                sum2 += Integer.parseInt(Character.toString(s.charAt(i)));
//            }
//        }
//        if (Math.abs(sum1 - sum2) % 11 == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // Bai 40 sai vi tran bo nho
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int sum = 1;
//        for (int i = 1; i < s.length(); i++){
//            if (s.charAt(i) == '1'){
//                sum *= 2;
//                sum += 1;
//            }else if (s.charAt(i) == '0'){
//                sum *= 2;
//                sum += 0;
//            }
//        }
//        if (sum % 5 == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 40 cach 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int haiMu = 1;
//        int res = 0;
//        for (int i = s.length() - 1; i >= 0; i--){
//            res += (s.chzarAt(i) - '0') * haiMu;
//            res %= 5;
//            haiMu *= 2;
//            haiMu %= 5;
//        }
//        if (res == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 40 cach 2
//    public static int mod5(int muSo){
//        if (muSo % 4 == 0) return 1;
//        if (muSo % 4 == 1) return 2;
//        if (muSo % 4 == 2) return 4;
//        else return 3;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        int res = 0, muSo = 0;
//        for (int i = s.length() - 1; i >= 0; i--){
//            res += (s.charAt(i) - '0') * mod5(muSo);
//            res %= 5;
//            ++muSo;
//        }
//        if (res == 0){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    
    // bai 41 cach 1 dung bigInteger
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        BigInteger n = new BigInteger("0");
//        int muHai = 1;
//        for (int i = s.length() - 1; i >= 0; i--){
//            BigInteger tmp = new BigInteger(Integer.toString((s.charAt(i) - '0') * muHai));
//            muHai *= 2;
//            n.add(tmp);
//        }
//        int k = sc.nextInt();
//        BigInteger two = new BigInteger("2");
//        BigInteger zero = new BigInteger("0");
//        while (k-- != 0){
//            if (!n.divide(two).equals(zero)){
//                System.out.println("NO");
//                return;
//            }else{
//                n = n.divide(two);
//            }
//        }
//        System.out.println("YES");
//    }
//    
    
    
    
    // bai 42
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String n = sc.nextLine();
//        String m = sc.nextLine();
//        BigInteger bigN = new BigInteger(n);
//        BigInteger bigM = new BigInteger(m);
//        BigInteger res = bigN.mod(bigM);
//        System.out.println(res);
//    }
    
    
    // bai 43
//    public static long gcd(long a, long b){
//        while (b > 0){
//            long t = a % b; a = b; b = t;
//        }
//        return a;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String n = sc.nextLine();
//        String m = sc.nextLine();
//        BigInteger BigN = new BigInteger(n);
//        BigInteger BigM = new BigInteger(m);
//        BigInteger tmp = BigN.mod(BigM);
//        long n1 = Long.parseLong(tmp.toString());
//        long m1 = Long.parseLong(m);
//        System.out.println(gcd(n1, m1));
//    }
    
//     bai 44 co the su dung thuat toan mod exp
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        BigInteger n = sc.nextBigInteger();
//        long m = sc.nextLong();
//        long res = 1;
//        BigInteger soChia = new BigInteger("1000000007");
//        for (int i = 0; i < m; i++){
//            BigInteger tmp = n.mod(soChia);
//            res *= Long.parseLong(tmp.toString());
//        }
//        System.out.println(res % 1000000007);
//    }
    
    // bai 45 cach 1 sai vi n co the la BigInteger cach nay co the su dung lam bai 44 
//    public static BigInteger MOD = BigInteger.TEN;
//    public static BigInteger BASE = new BigInteger("2008");
//    public static BigInteger modExp(BigInteger base, long exp, BigInteger mod){
//        BigInteger res = BigInteger.ONE;
//        while (exp > 0){
//            if ((exp & 1) == 1){
//                res = res.multiply(base).mod(mod);
//            }
//            base = base.multiply(base).mod(mod);
//            exp >>= 1;
//        }
//        return res;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        System.out.println(modExp(BASE, n, MOD));
//    }
    
    // bai 45
//    public static BigInteger MOD = new BigInteger("4");
//    
//    public static int mod4(BigInteger n){
//        BigInteger res0 = new BigInteger("0");
//        BigInteger res1 = new BigInteger("1");
//        BigInteger res2 = new BigInteger("2");
//        BigInteger res3 = new BigInteger("3");
//        if (n.equals(res0)) return 1;
////        if (n.toString().equals("0")) return 1; 
//        else if (n.mod(MOD).equals(res1)) return 8;
//        else if (n.mod(MOD).equals(res2)) return 4;
//        else if (n.mod(MOD).equals(res3)) return 2;
//        else return 6;
//    } 
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        BigInteger n = sc.nextBigInteger();
//        String s = sc.nextLine();
//        System.out.println(mod4(n));
//    }
    
    
    // bai 46
//    public static int MOD = 5;
//    
//    public static int modExp(int base, BigInteger exp, int mod){
//        int res = 1;
//        BigInteger one = BigInteger.ONE;
//        BigInteger zero = BigInteger.ZERO;
//        BigInteger two = BigInteger.TWO;
//        while (!exp.equals(zero)){
//            if (exp.mod(two).equals(one)){
//                res *= base % mod;
//            }
//            exp = exp.divide(two);
//            base *= base % mod;
//        }
//        return res;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        BigInteger n = sc.nextBigInteger();
//        int res = 0;
//        for (int i = 1; i <= 4; i++){
//            res += modExp(i, n, MOD);
//            res %= 5;
//        }
//        System.out.println(res);
//    }
    
    //bai 47 ko nen lam cach nay bi loi
    
//    public static BigInteger gcd(BigInteger a, BigInteger b){
//        BigInteger zero = BigInteger.ZERO;
//        
//        while (!b.equals(zero)){
//            BigInteger tmp = a.mod(b);
//            a = b;
//            b = tmp;
//        }
//        return a;
//    }
//    
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String a = sc.nextLine();
//        long x = sc.nextLong();
//        long y = sc.nextLong();
//        String ax = "";
//        String ay = "";
//        while (x-- != 0){
//            ax += a;
//        }
//        while (y-- != 0){
//            ay += a;
//        }
//        BigInteger xBig = new BigInteger(ax);
//        BigInteger yBig = new BigInteger(ay);
//        System.out.print(gcd(xBig, yBig));
//    }
    
    // bai 47
//    public static long gcd(long a, long b){
//        while (b != 0){
//            long tmp = a % b;
//            a = b;
//            b = tmp;
//        }
//        return a;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long a = sc.nextLong();
//        long x = sc.nextLong();
//        long y = sc.nextLong();
//        String res = "";
//        for (int i = 0; i < gcd(x, y); i++){
//            res += Long.toString(a);
//        }
//        System.out.println(res);
//    }
    
    // bai 48
//    public static int sum (String s){
//        int res = 0;
//        for (int i = 0; i < s.length(); i++){
//            res += (s.charAt(i) - '0');
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        boolean check = false;
//        while (s.length() > 1){
//            if (sum(s) == 9){
//                check = true;
//                break;
//            }
//            s = Integer.toString(sum(s));
//        }
//        if (check == true){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 49
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String s = sc.nextLine();
//        String res = "";
//        for (int i = 0; i < s.length() - 3; i++){
//            if (s.charAt(i) == '1'){
//                String tmp = "";
//                tmp += s.subSequence(i, i + 3);
//                if (tmp.compareTo("111") != 0){
//                    res += s.charAt(i);
//                }else{
//                    i += 2;
//                }
//            }else{
//                res += s.charAt(i);
//            }
//        }
//        if (s.charAt(s.length() - 3) == '1'){
//            String tmp = s.subSequence(s.length() - 3, s.length()).toString();
//            if (tmp.compareTo("111") != 0){
//                res += tmp;
//            }
//        }else{
//            res += s.subSequence(s.length() - 3, s.length());
//        }
//        System.out.println(res);
//    }
    
    // bai 50
    public static int gt(int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        long res = 1;
        for (int i = 0; i < s.length(); i++){
            res *= gt(s.charAt(i) - '0');
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (res != 1){
            int tmp = 0;
            for (int i = 2; i <= 9; i++){
                if ((gt(i) <= res) && (res % gt(i) == 0)){
                    arr.add(i);
                    tmp = i;
                    break;
                }
            }
            res /= gt(tmp);
        }
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        });
        for (int x : arr){
            System.out.print(x);
        }
    }
    
}


