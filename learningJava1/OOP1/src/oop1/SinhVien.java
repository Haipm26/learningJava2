/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Pham Minh Hai
 */
public class SinhVien {
    
    // bai 2
//    private String name;
//    private String birth;
//    private float d1;
//    private float d2;
//    private float d3;
//    
//    SinhVien(String ten, String ngaySinh, float diem1, float diem2, float diem3){
//        name = ten;
//        birth = ngaySinh;
//        d1 = diem1;
//        d2 = diem2;
//        d3 = diem3;
//    }
//    
//    public void inRes(){
//        System.out.println(name + " " + birth + " " + (d1 + d2 + d3));
//    }
    
    // bai 3
//    private String name;
//    private String lop;
//    private String birth;
//    private float gpa;
//    
//    SinhVien(){
//        name = "";
//        lop = "";
//        birth = "";
//        gpa = 0;
//    }
//    
//    SinhVien(String ten, String lopp, String ns, float diem){
//        name = ten;
//        lop = lopp;
//        birth = ns;
//        gpa = diem;
//    }
//    
//    public void display(){
//        StringBuilder sb = new StringBuilder(birth);
//        if (sb.charAt(1) == '/') sb.insert(0, "0");
//        if (sb.charAt(4) == '/') sb.insert(3, "0");
//        // co the tach cai nay ra 1 ham khac roi goi trong ham main roi moi goi ham display
//        System.out.print("SV001" + " " + name + " " + lop + " " + sb + " ");
//        System.out.printf("%.1f", gpa);
//    }
    
    
    // bai 23
//    private String name;
//    private String lop;
//    private String birth;
//    private double gpa;
//    private int id;
//    private static int cnt = 0;
//    
//    SinhVien(String name, String lop, String birth, Double gpa){
//        this.name = name;
//        this.lop = lop;
//        this.birth = birth;
//        this.gpa = gpa;
//        ++cnt;
//        this.id = cnt;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public void setBirth(String birth) {
//        this.birth = birth;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
    
    
//    public void chuanHoa(){
//        StringBuilder sb = new StringBuilder(birth);
//        if (sb.charAt(1) == '/') sb.insert(0, "0");
//        if (sb.charAt(4) == '/') sb.insert(3, "0");
//        birth = sb.toString();
//    }
//    
//    public String toString(){
//        String tmp = String.format("%02d", this.id);
//        String tmp1 = String.format("%.2f", this.gpa);
//        return("SV0" + tmp + " " + name + " " + lop + " " + birth + " " + tmp1);
//    }
    
    
    // bai 4
//   private String name;
//   private String sex;
//   private String birth;
//   private String ns;
//   private String maThue;
//   private String nc;
//   
//   public SinhVien(String name, String sex, String birth, String ns, String maThue, String nc){
//       this.name = name;
//       this.sex = sex;
//       this.birth = birth;
//       this.ns = ns;
//       this.maThue = maThue;
//       this.nc = nc;
//       
//   }
//   
//   public String toString(){
//       return "00001" + " " + name + " " + birth + " " + ns + " " + maThue + " " + nc;
//   }
    
    // bai 5
//    private String name;
//    private String sex;
//    private String birth;
//    private String ns;
//    private String maThue;
//    private String nc;
//
//    public SinhVien(String name, String sex, String birth, String ns, String maThue, String nc) {
//        this.name = name;
//        this.sex = sex;
//        this.birth = birth;
//        this.ns = ns;
//        this.maThue = maThue;
//        this.nc = nc;
//    }
//    
//    
//    
//    public void chuanHoa1(){
//        String[] s = name.toLowerCase().split(" ");
//        String res = "";
//        for (int i = 0; i < s.length; i++){
//            res +=  Character.toUpperCase(s[i].charAt(0));
//            res += s[i].subSequence(1, s[i].length());
//            res += " ";
//        }
//        name = res.trim();
//    }
//    
//    public void chuanHoa2(String s){
//        StringBuilder sb = new StringBuilder(s);
//        if (sb.charAt(1) == '/'){
//            sb.insert(0, "0");
//        }
//        if (sb.charAt(4) == '/'){
//            sb.insert(3, "0");
//        }
//        s = sb.toString();
//    }
//    
//    public String toString(){
//        chuanHoa1();
//        chuanHoa2(birth);
//        chuanHoa2(nc);
//        return "00001" + " " + name + " " + sex + " " + birth + " " + ns + " " + maThue + " " + nc;
//    }
    
    

    // bai 6
//    private int w;
//    private int h;
//    private String color;
//    
//    public SinhVien(int w, int h, String color){
//        this.w = w;
//        this.h = h;
//        this.color = color;
//    }
//    
//    public String toString(){
//        return 2 * (w + h) + " " + (w * h) + "" + color;
//    }
    
    // bai 9
//    private String id;
//    private String name;
//    private int salary;
//    
//    SinhVien(String id, String name, int salary){
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//    
//    public void income(){
//        int res = 0;
//        if (id.subSequence(0, 2) == "HP"){
//            res += 900000;
//        }else if (id.subSequence(0, 2) == "HT"){
//            res += 2000000;
//        }else{
//            res += 500000;
//        }
//        salary = salary * Integer.parseInt(id.subSequence(2, 4).toString()) + res;
//    }
//    
//    public String toString(){
//        income();
//        return id + " " + name + " " + Integer.parseInt(id.subSequence(2, 4).toString()) + " " + salary;
//    }
    
    // bai 11
//    private static int id = 0;
//    private String name;
//    private int salary;
//    private int days;
//    private String job;
//    private int luongThang = 0;
//    private int thuong = 0;
//    private int phuCap = 0;
//    private int thuNhap = 0;
//    
//    public SinhVien(String name, int salary, int days, String job) {
//        this.name = name;
//        this.salary = salary;
//        this.days = days;
//        this.job = job;
//        ++id;
//    }
//    
//    public void income(){
//        if (job.compareTo("GD") == 0){
//            phuCap = 250000;
//        }else if(job.compareTo("PGD") == 0){
//            phuCap = 200000;
//        }else if (job.compareTo("TP") == 0){
//            phuCap = 180000;
//        }else if (job.compareTo("NV") == 0){
//            phuCap = 150000;
//        }
//        luongThang = days * salary;
//        if (days >= 25){
//            thuong = luongThang / 5;
//        }else if (days >= 22 && days < 25){
//            thuong = luongThang / 10;
//        }else{
//            thuong = 0;
//        }
//        thuNhap = luongThang + thuong + phuCap;
//    }
//    
//    public String toString(){
//        income();
//        return "NV" + String.format("%02d", id) + " " + name + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
//    }
    
    // bai 11 cach 2
//    private String id;
//    private String name;
//    private int luongCoBan;
//    private int ngay;
//    private String chucVu;
//
//    public SinhVien(String id, String name, int luongCoBan, int ngay, String chucVu) {
//        this.id = id;
//        this.name = name;
//        this.luongCoBan = luongCoBan;
//        this.ngay = ngay;
//        this.chucVu = chucVu;
//    }
//    
//    public int getLuong(){
//        return this.luongCoBan * this.ngay;
//    }
//    
//    public int getThuong(){
//        if (this.ngay >= 25){
//            return this.luongCoBan / 5;
//        }else if(this.ngay >= 22){
//            return this.luongCoBan / 10;
//        }else{
//            return 0;
//        } 
//    }
//    
//    public int getPhuCap(){
//        if (this.chucVu.compareTo("GD") == 0){
//            return 250000;
//        }else if (this.chucVu.compareTo("PGD") == 0){
//            return 200000;
//        }else if (this.chucVu.compareTo("TP") == 0){
//            return 180000;
//        }else{
//            return 150000;
//        }
//    }
//    
//    public String toString(){
//        return id + " " + name + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + (this.getLuong() + this.getThuong() + this.getPhuCap());
//    }
    
    // bai 12
//    private String id;
//    private String name;
//    private double diemToan;
//    private double diemHoa;
//    private double diemLy;
        
//    private double toan, ly, hoa;
    
//    private String kv;
//    private String check;
//    private double diemCong = 0;
//    private double diemTong = 0;
//    
//    public SinhVien(String id, String name, double diemToan, double diemHoa, double diemLy) {
//        this.id = id;
//        this.name = name;
//        this.diemToan = diemToan;
//        this.diemHoa = diemHoa;
//        this.diemLy = diemLy;
//    }
//    
//    public void update(){
//        if (id.charAt(2) == '1'){
//            kv = "1";
//            diemCong = 0.5;
//        }else if (id.charAt(2) == '2'){
//            kv = "2";
//            diemCong = 1;
//        }else{
//            kv = "3";
//            diemCong = 2.5;
//        }
//        diemTong = diemToan + diemHoa + diemLy + diemCong;
//        if (diemTong >= 24){
//            check = "TRUNG TUYEN";
//        }else{
//            check = "TRUOT";
//        }
//    }
//    
//    public String toString(){
//        update();
//        return id + " " + name + " " + kv + " " + String.format("%.1f", diemTong) + " " + check;
//    }
    
    // bai 12
    private String id;
    private String name;
    private double toan, ly, hoa;
    
    public SinhVien(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double getTong(){
        double tongDiem = this.toan + this.ly + this.hoa;
        if (id.charAt(2) == '1') tongDiem += 0.5;
        else if (id.charAt(2) == '2') tongDiem += 1;
        else tongDiem += 2.5;
        return tongDiem;
     
    }
    
    public String toString(){
        String result = "";
        if (this.getTong() >= 24) result += "TRUNG TUYEN";
        else result += "TRUOT";
        if (this.getTong() == (int)this.getTong()){
            return this.id + " " + this.name + " " + this.id.charAt(2) + " " + (int)this.getTong() + " " + result;
        }else{
            return this.id + " " + this.name + " " + this.id.charAt(2) + " " + this.getTong() + " " + result;
        }
    }
    
    // bai 13
//    private long ts;
//    private long ms;
//    
//    SinhVien(long ts, long ms){
//        this.ts = ts;
//        this.ms = ms;
//    }
//    
//    public void update(){
//        long tmp = Math.min(ts, ms);
//        if (tmp < 0){
//            tmp *= -1;
//        }
//        for (long i = tmp; i >= 2; i--){
//            if (ts % i == 0 && ms % i == 0){
//                while (ts % i == 0 && ms % i == 0){
//                    ts /= i;
//                    ms /= i;
//                }
//            }
//        }
//        if (ts < 0 && ms < 0){
//            ts *= -1;
//            ms *= -1;
//        }
//    }
//
//    public long getTs() {
//        return ts;
//    }
//
//    public long getMs() {
//        return ms;
//    }
//    
//    
//    
//    public String toString(){
//        update();
//        return ts + "/" + ms;
//    }
    
    // bai 15
//    private int []a;
//    
//    public SinhVien(int[] a) {
//        this.a = a;
//    }
//    
//    public int length(){
//        return a.length;
//    }
//    
//    public int at(int i){
//        return a[i];
//    }
//    
//    public SinhVien intersection(SinhVien b){
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < b.length(); i++){
//            for (int j = 0; j < a.length; j++){
//                if (a[j] == b.at(i)){
//                    arr.add(a[j]);
//                    break;
//                }
//            }
//        }
//        int []c = new int [arr.size()];
//        int i = 0;
//        for (Integer x : arr){
//            c[i] = x;
//            ++i;
//        }
//        SinhVien d = new SinhVien(c);
//        return d;
//    }
//   
//    public String toString(){
//        StringBuilder sb = new StringBuilder("");
//        for (int i = 0; i < a.length; i++){
//            sb.append(a[i]);
//            sb.append(" ");
//        }
//        return sb.toString().trim();
//    }
    
    // bai 16
//    private Set<Integer> set;
//    
//    SinhVien(int []a){
//        this.set = new HashSet<>();
//        for (int i = 0; i < a.length; i++){
//            this.set.add(a[i]);
//        }
//    }
//    
//    public SinhVien union(SinhVien b){
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int x : b.set){
//            if (!set.contains(x)){
//                arr.add(x);
//            }
//        }
//        for (int x : set){
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        int []a = new int [arr.size()];
//        int i = 0;
//        for (int x : arr){
//            a[i] = x;
//            ++i;
//        }
//        return new SinhVien(a);
//    }
//    
//    public String toString(){
//        ArrayList<Integer> list = new ArrayList<>(this.set);
//        Collections.sort(list);
//        StringBuilder sb = new StringBuilder("");
//        for (int x : list){
//            sb.append(x);
//            sb.append(" ");
//        }
//        return sb.toString().trim();
//    }
    
    
    
    // bai 17
//    private Set<String> set;
//
//    public SinhVien(String set) {
//        this.set = new HashSet<>();
//        String []arr = set.split(" ");
//        for (int i = 0; i < arr.length; i++){
//            this.set.add(arr[i]);
//        }
//    }
//    
//    public SinhVien union(SinhVien set2){
//        ArrayList<String> a = new ArrayList<>();
//        for (String x : set2.set){
//            if (!set.contains(x)){
//                a.add(x);
//            }
//        }
//        for (String x : set){
//            a.add(x);
//        }
//        String res = "";
//        for (String x : a){
//            res += x;
//            res += " ";
//        }
//        return new SinhVien(res);
//    }
//    
//    public SinhVien intersection (SinhVien set1){
//        ArrayList<String> a = new ArrayList<>();
//        for (String x : set1.set){
//            if (set.contains(x)){
//                a.add(x);
//            }
//        }
//        String s = "";
//        for (String x : a){
//            s += x;
//            s += " ";
//        }
//        return new SinhVien(s);
//    }
//    
//    public String toString(){
//        ArrayList<String> arr = new ArrayList<>(set);
//        Collections.sort(arr);
//        StringBuilder sb = new StringBuilder("");
//        for (String x : arr){
//            sb.append(x);
//            sb.append(" ");
//        }
//        return sb.toString().trim();
//    }
    
    
    
    // bai 18
//    private int n;
//    private int m;
//    private int [][]matrix;
//    
//    SinhVien(int n, int m){
//        this.n = n;
//        this.m = m;
//        matrix = new int[n][m];
//    }
//    
//    public void nextMatrix(Scanner sc){
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//    }
//    
//    public String mul(SinhVien b){
//        String s = "";
//        int [][]res = new int [n][b.m];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < b.m; j++){
//                for (int k = 0; k < m; k++){
//                    res[i][j] += matrix[i][k] * b.matrix[k][j];
//                }
//            }
//        }
//        for (int i = 0; i < n; i ++){
//            for (int j = 0; j < b.m; j++){
//                s += res[i][j];
//                s += " ";
//            }
//            s += "\n";
//        }
//        return s.trim();
//    }
    
    // bai 19
//    private int n;
//    private int m;
//    private int [][]matrix;
//    
//    SinhVien(int n, int m){
//        this.n = n;
//        this.m = m;
//        this.matrix = new int [n][m];
//    }
//    
//    SinhVien (int n, int m, int [][]matrix){
//        this.n = n;
//        this.m = m;
//        this.matrix = matrix;
//    }
//    
//    public void nextMatrix(Scanner sc){
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//    }
//    
//    public SinhVien trans(){
//        int matrixTrans[][] = new int [this.m][this.n];
//        for (int i = 0; i < m; i++){
//            for (int j = 0; j < n; j++){
//                matrixTrans[i][j] = matrix[j][i];
//            }
//        }
//        return new SinhVien(this.m, this.n, matrixTrans);
//    }
//    
//    public String mul(SinhVien b){
//        int [][]ans = new int [n][b.m];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < b.m; j++){
//                for (int k = 0; k < m; k++){
//                    ans[i][j] += matrix[i][k] * b.matrix[k][j];
//                }
//            }
//        }
//        String s = "";
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < b.m; j++){
//                s += ans[i][j];
//                s += " ";
//            }
//            s += "\n";
//        }
//        return s.trim();
//    }
    
    // bai 22
//    private int id = 0;
//    private String name;
//    private String lop;
//    private String ngaySinh;
//    private double gpa;
//    
//    public static int stt = 0;
//    
//    SinhVien(){
//        ++stt;
//        id = stt;
//        name = "";
//        lop = "";
//        ngaySinh = "";
//        gpa = 0;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public void setNgaySinh(String ngaySinh) {
//        this.ngaySinh = ngaySinh;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//    
//    
//    
//    public void chuanHoa(){
//        StringBuilder sb = new StringBuilder(ngaySinh);
//        if (sb.charAt(1) == '/'){
//            sb.insert(0, "0");
//        }
//        if (sb.charAt(4) == '/'){
//            sb.insert(3, "0");
//        }
//    ngaySinh = sb.toString();
//    }
//    
//    public String toString(){
//        chuanHoa();
//        return "SV0" + String.format("%02d", id) + " " + name + " " + ngaySinh + " " + String.format("%.2f", gpa);
//    }
    
    
    // bai 24
//    private int id;
//    private String name;
//    private String ngaySinh;
//    private String lop;
//    private double gpa = 0;
//    
//    public static int stt = 0;
//    
//    SinhVien(){
//        ++stt;
//        id = stt;
//        this.name = "";
//        this.ngaySinh = "";
//        this.lop = "";
//        this.gpa = 0;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNgaySinh(String ngaySinh) {
//        this.ngaySinh = ngaySinh;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//    
//    public double getGpa(){
//        return this.gpa;
//    }
//    
//    public int getId(){
//        return this.id;
//    }
//    
//    public void chuanHoa(){
//        StringBuilder sb = new StringBuilder(ngaySinh);
//        if (sb.charAt(1) == '/'){
//            sb.insert(0, "0");
//        }
//        if (sb.charAt(4) == '/'){
//            sb.insert(3, "0");
//        }
//        ngaySinh = sb.toString().trim();
//        
//        String ten = "";
//        String []a = name.toLowerCase().split(" ");
//        for (int i = 0; i < a.length; i++){
//            ten += Character.toUpperCase(a[i].charAt(0));
//            ten += a[i].subSequence(1, a[i].length());
//            ten += " ";
//        }
//        name = ten.trim();
//    }
//    
//    public String toString(){
//        chuanHoa();
//        return "SV0" + String.format("%02d", id) + " " + name + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa); 
//    }
    
    // bai 30
//    private String name;
//    private String lop;
//    private String email;
//    private int id;
//    
//    public SinhVien(String id ,String name, String lop, String email) {
//        this.name = name;
//        this.lop = lop;
//        this.email = email;
//        this.id = Integer.parseInt(id.subSequence(2, 4).toString());
//    }
//
//    public int getId() {
//        return id;
//    }
//    
//    public String toString(){
//        return "SV" + String.format("%03d", id) + " " + name + " " + lop + " " + email;
//    }
    
    // bai 31
//    private String id;
//    private String name;
//    private String lop;
//    private String email;
//
//    public SinhVien(String id, String name, String lop, String email) {
//        this.id = id;
//        this.name = name;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//    
//    public void chuanHoa(){
//        String []res = name.toLowerCase().split(" ");
//        String s = "";
//        for (int i = 0; i < res.length; i++){
//            s += Character.toUpperCase(res[i].charAt(0));
//            s += res[i].subSequence(1, res[i].length()).toString();
//            s += " ";
//        }
//        name = s.trim();
//    }
//    
//    public String toString(){
//        chuanHoa();
//        return id + " " + name + " " + lop + " " + email;
//    }
    
    // bai 32
//    private String id;
//    private String name;
//    private String lop;
//    private String email;
//
//    public SinhVien(String id, String name, String lop, String email) {
//        this.id = id;
//        this.name = name;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    public String getId() {
//        return id.subSequence(0, 4).toString();
//    }
//    
//    public void chuanHoa(){
//        String s = "";
//        String []res = name.toLowerCase().split(" ");
//        for (int i = 0; i < res.length; i++){
//            s += Character.toUpperCase(res[i].charAt(0));
//            s += res[i].subSequence(1, res[i].length());
//            s += " ";
//        }
//        name = s.trim();
//    }
//    
//    public String toString(){
//        chuanHoa();
//        return id + " " + name + " " + lop + " " + email;
//    }
    
    // bai 33
//    private String id;
//    private String name;
//    private String lop;
//    private String email;
//
//    public SinhVien(String id, String name, String lop, String email) {
//        this.id = id;
//        this.name = name;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    public String getLop() {
//        return lop.subSequence(0, 4).toString();
//    }
//    
//    public String toString(){
//        return id + " " + name + " " + lop + " " + email;
//    }
//    
    
    // bai 34
//    private String name;
//    private String mon;
//    private int id;
//    
//    public static int stt = 0;
//
//    public SinhVien(String name, String mon) {
//        this.name = name;
//        this.mon = mon;
//        ++stt;
//        this.id = stt;
//    }
//
//    public String getName() {
//        String []s = name.split(" ");
//        return s[s.length - 1];
//    }
//    
//    public void chuanHoa(){
//        String res = "";
//        String []s = mon.split(" ");
//        for (int i = 0; i < s.length; i++){
//            res += Character.toUpperCase(s[i].charAt(0));
//        }
//        mon = res;
//    }
//    
//    public String toString(){
//        chuanHoa();
//        return "GV" + String.format("%02d", this.id) + " " + name + " " + mon;
//    }

    

    
    
    
}




