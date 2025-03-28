/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
////        String s = sc.nextLine();
////        String s1 = sc.nextLine();
////        float d1 = sc.nextFloat();
////        float d2 = sc.nextFloat();
////        float d3 = sc.nextFloat();
////        SinhVien x = new SinhVien(s, s1, d1, d2, d3);
//
//        // co the lam the nay
//        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
//
//        x.inRes();
//    }
    
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
//        x.display();
//    }
    
    
    // bai 23
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<SinhVien> a = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            sc.nextLine();
//            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
//            a.add(x);
//        }
//        for (SinhVien x : a){
//            x.chuanHoa();
//            System.out.println(x);
//        }
//    }
    
    // bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        System.out.println(x);
//    }
    
    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        System.out.println(x);
//    }
    
    // bai 6
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int w = sc.nextInt();
//        int r = sc.nextInt();
//        if (w > 0 && r > 0){
//            String color = sc.nextLine();
//            SinhVien x = new SinhVien(w, r, color);
//            System.out.println(x);
//        }else{
//            System.out.println("INVALID");
//        }
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
//        System.out.println(x);
//    }
    
    
    // bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        String name = sc.nextLine();
//        int salary = sc.nextInt();
//        int days = sc.nextInt();
//        sc.nextLine();
//        String job = sc.nextLine();
//        SinhVien a = new SinhVien(name, salary, days, job);
//        arr.add(a);
//        
//        for (SinhVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 11 cach 2
//    public static void main(String[] args) {
//        Scanner sc = new  Scanner (System.in);
//        SinhVien x = new SinhVien("NV01", sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
//        System.out.println(x);
//    }
    
    //bai 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
//        System.out.println(x);
//    }
    
    // bai 12 cach 2
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        SinhVien x = new SinhVien (sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(x);
    }
    
    // bai 13 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        while (t-- != 0){
//            long ts1 = sc.nextInt();
//            long ms1 = sc.nextInt();
//            long ts2 = sc.nextInt();
//            long ms2 = sc.nextInt();
//            SinhVien a = new SinhVien(ts1, ms1);
//            SinhVien b = new SinhVien(ts2, ms2);
//            a.update();
//            b.update();
//            long ts3 = (long)Math.pow(a.getTs() * b.getMs() + b.getTs() * a.getMs(), 2);
//            long ms3 = (long)Math.pow(b.getMs() * a.getMs(), 2);
//            SinhVien c = new SinhVien(ts3, ms3);
//            c.update();
//            long ts4 = a.getTs() * b.getTs() * c.getTs();
//            long ms4 = a.getMs() * b.getMs() * c.getMs();
//            SinhVien d = new SinhVien(ts4, ms4);
//            d.update();
//            System.out.println(c + " " + d);
//        }
//    }
    
    // bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt(); int m = sc.nextInt(); int []a = new int [n]; int []b = new int [m];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();    
//        }
//        for (int i = 0; i < m; i++){
//            b[i] = sc.nextInt();
//        }
//        SinhVien s1 = new SinhVien(a);
//        SinhVien s2 = new SinhVien(b);
//        SinhVien s3 = s1.intersection(s2);
//        System.out.println(s3);
//    }
    
    // bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt(); int m = sc.nextInt(); int []a = new int [n]; int []b = new int [m];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int j = 0; j < m; j++){
//            b[j] = sc.nextInt();
//        }
//        SinhVien s1 = new SinhVien(a);
//        SinhVien s2 = new SinhVien(b);
//        SinhVien s3 = s1.union(s2);
//        System.out.println(s3);
//
//    }
    
    
    // bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        SinhVien s1 = new SinhVien(sc.nextLine());
//        SinhVien s2 = new SinhVien(sc.nextLine());
//        System.out.println(s1.union(s2));
//        System.out.println(s1.intersection(s2));
//    }
    
    // bai 18
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt(); int m = sc.nextInt(); int p = sc.nextInt();
//        SinhVien a = new SinhVien(n, m);
//        a.nextMatrix(sc);
//        SinhVien b = new SinhVien(m, p);
//        b.nextMatrix(sc);
//        System.out.print(a.mul(b));
//    }
    
    // bai 19
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt(); int m = sc.nextInt();
//        SinhVien a = new SinhVien(n, m);
//        a.nextMatrix(sc);
//        SinhVien b = a.trans();
//        System.out.println(a.mul(b));
//    }
    
    
    // bai 20
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<Time> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            Time x = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
//            arr.add(x);
//            
//        }
//        Collections.sort(arr, new Comparator<Time>(){
//            @Override
//            public int compare(Time o1, Time o2) {
//                if (o1.getGio() != o2.getGio()){
//                    return o1.getGio() - o2.getGio();
//                }else{
//                    if (o1.getPhut() != o2.getPhut()){
//                        return o1.getPhut() - o2.getPhut();
//                    }else{
//                        return o1.getGiay() - o2.getGiay();
//                    }
//                }
//            }
//            
//        });
//        for (Time x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 21
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<DSMH> arr = new ArrayList<>();
//        for (int i = 1; i <= n; i++){
//            sc.nextLine();
//            DSMH x = new DSMH(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<DSMH>(){
//            @Override
//            public int compare(DSMH o1, DSMH o2) {
//                if (o1.getProfit() != o2.getProfit()){
//                    return o2.getProfit() - o1.getProfit();
//                }else{
//                    return o1.getId() - o2.getId();
//                }
//            }
//            
//        });
//        for (DSMH x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 22
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i ++){
//            SinhVien x = new SinhVien();
//            sc.nextLine();
//            String name = sc.nextLine();
//            x.setName(name);
//            String lop = sc.nextLine();
//            x.setLop(lop);
//            String NgaySinh = sc.nextLine();
//            x.setNgaySinh(NgaySinh);
//            Double gpa = sc.nextDouble();
//            x.setGpa(gpa);
//            arr.add(x);
//        }
//        for (SinhVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 24
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            sc.nextLine();
//            SinhVien x = new SinhVien();
//            x.setName(sc.nextLine());
//            x.setLop(sc.nextLine());
//            x.setNgaySinh(sc.nextLine());
//            x.setGpa(sc.nextDouble());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                if (o1.getGpa() != o2.getGpa()){
//                    if (o1.getGpa() > o2.getGpa()){
//                        return -1;
//                    }else if (o1.getGpa() < o2.getGpa()){
//                        return 1;
//                    }
//                }else{
//                    return o1.getId() - o2.getId();
//                }
//                return -1;
//            }
//            
//        });
//        for (SinhVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 25
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<nhanVien> arr = new ArrayList<>();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            nhanVien x = new nhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        for (nhanVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    
    // bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<nhanVien> arr = new ArrayList<>();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            nhanVien x = new nhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<nhanVien>(){
//            @Override
//            public int compare(nhanVien o1, nhanVien o2) {
//                if (o1.getNam() != o2.getNam()){
//                    return o1.getNam() - o2.getNam();
//                }else{
//                    if (o1.getThang() != o2.getThang()){
//                        return o1.getThang() - o2.getThang();
//                    }else{
//                        return o1.getNgay() - o2.getNgay();
//                    }
//                }
//            }
//        });
//        for (nhanVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    
    // bai 27
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<account> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            account x = new account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<account>(){
//            @Override
//            public int compare(account o1, account o2) {
//                if (o1.getGio() != o2.getGio()){
//                    return o2.getGio() - o1.getGio();
//                }else{
//                    if (o1.getPhut() != o2.getPhut()){
//                        return o2.getPhut() - o1.getPhut();
//                    }else{
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                }
//            }
//            
//        });
//        for (account x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 28
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<nhanVien> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            nhanVien x = new nhanVien(sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<nhanVien>(){
//            @Override
//            public int compare(nhanVien o1, nhanVien o2) {
//                if (o2.getDiemTB() < o1.getDiemTB()){
//                    return -1;
//                }else if (o2.getDiemTB() > o1.getDiemTB()){
//                    return 1;
//                }else{
//                    return o1.getId() - o2.getId();
//                }
//            }
//            
//        });
//        for (nhanVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 29
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<nhanVien> arr = new ArrayList<nhanVien>();
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            nhanVien x = new nhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<nhanVien>(){
//            @Override
//            public int compare(nhanVien o1, nhanVien o2) {
//                if (o1.getLop() != o2.getLop()){
//                    return o1.getLop() - o2.getLop();
//                }else{
//                    return o1.getId() - o2.getId();
//                }
//            }
//            
//        });
//        for (nhanVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 30 ko biet while ghi gi cho dung
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        while(){
//            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return o1.getId() - o2.getId();
//            }
//            
//        });
//        for (SinhVien x : arr){
//            System.out.println(x);
//        }
//    }
    
    
    // bai 31
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            SinhVien x = new SinhVien (sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- != 0){
//            String check = sc.nextLine();
//            System.out.println("DANH SACH SINH VIEN LOP " + check + " " + ":");
//            for (SinhVien x : arr){
//                if (x.getLop().compareTo(check) == 0){
//                    System.out.println(x);
//                }
//            }
//        }
//    }
    
    // bai 32
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- != 0){
//            String check = sc.nextLine();
//            System.out.println("DANH SACH SINH VIEN KHOA " + check + " :");
//            for (SinhVien x : arr){
//                if (check.compareTo(x.getId()) == 0){
//                    System.out.println(x);
//                }
//            }
//        }
//    }
    
    // bai 33
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- != 0){
//            String check = sc.nextLine();
//            if (check.compareTo("CNTT") == 0){
//                System.out.println("DANH SACH SINH VIEN CONG NGHE THONG TIN :");
//            }else if(check.compareTo("DTVT") == 0){
//                System.out.println("DANH SACH SINH VIEN DIEN TU VIEN THONG :");
//            }else if(check.compareTo("KT") == 0){
//                System.out.println("DANH SACH SINH VIEN KE TOAN :");
//            }else{
//                System.out.println("DANH SACH SINH VIEN MARKETING");
//            }
//            for (SinhVien x : arr){
//                if (check.compareTo(x.getLop()) == 0){
//                    System.out.println(x);
//                }
//            }
//        }
//    }
    
    // BAI 34
//    public static void main(String[] args) {
//        Scanner sc = new  Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//            
//        });
//        for (SinhVien x : arr){
//            System.out.println(x);
//        }
//    }
}



