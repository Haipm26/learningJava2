/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop1;

/**
 *
 * @author Pham Minh Hai
 */
public class nhanVien {
    
    // bai 25
    
//    private String name;
//    private String sex;
//    private String birth;
//    private String diaChi;
//    private String maSo;
//    private String ngayKi;
//    private int id;
//    
//    public static int stt = 0;
//
//    public nhanVien(String name, String sex, String birth, String diaChi, String maSo, String ngayKi) {
//        ++stt;
//        id = stt;
//        this.name = name;
//        this.sex = sex;
//        this.birth = birth;
//        this.diaChi = diaChi;
//        this.maSo = maSo;
//        this.ngayKi = ngayKi;
//    }
//    
//    public String toString(){
//        return String.format("%05d", id) + " " + name + " " + sex + " " + birth + " " + diaChi + " " + maSo + " " + ngayKi;
//    }
    
    // bai 26
//    private String name;
//    private String sex;
//    private String birth;
//    private String diaChi;
//    private String maSo;
//    private String ngayKi;
//    private int id;
//    
//    public static int stt = 0;
//
//    public nhanVien(String name, String sex, String birth, String diaChi, String maSo, String ngayKi) {
//        ++stt;
//        this.id = stt;
//        this.name = name;
//        this.sex = sex;
//        this.birth = birth;
//        this.diaChi = diaChi;
//        this.maSo = maSo;
//        this.ngayKi = ngayKi;
//    }
//    
//    public int getNam(){
//        String []res = birth.split("/");
//        return Integer.parseInt(res[2]);
//    }
//    
//    public int getThang(){
//        String []res = birth.split("/");
//        return Integer.parseInt(res[1]);
//    }
//    
//    public int getNgay(){
//        String []res = birth.split("/");
//        return Integer.parseInt(res[0]);
//    }
//    
//    public String toString(){
//        return String.format("%05d", id) + " " + name + " " + sex + " " + birth + " " + diaChi + " " + maSo + " " + ngayKi;
//    }
    
    // bai 28
//    private String name;
//    private String diem;
    
//  private double[] diem;
//  o day dung mang cung duoc
//o day dung mang loi hon vi neu muon truy cap vao tung diem thanh phan thi chi can tao mot mang String roi truy cap vao index 
//public String []diemTP = {"TOan", "TIENG VIET", "..."};
    
//    private double diemTB;
//    private String check;
//    private int id;
//    
//    public static int stt = 0;
//    
//    public nhanVien(String name, String diem) {
//        this.name = name;
//        this.diem = diem;
//        String []tp = diem.split(" ");
//        double tongDiem = 0;
//        for (int i = 0; i < tp.length; i++){
//            tongDiem += Double.parseDouble(tp[i]);
//        }
//        diemTB = tongDiem / 10;
//        ++stt;
//        id = stt;
//    }
//
//    public double getDiemTB() {
//        return diemTB;
//    }
//
//    public int getId() {
//        return id;
//    }
//    
//    
//    public void xepLoai(){
//        if (diemTB > 9){
//            this.check = "XUAT XAC";
//        }else if(diemTB > 8){
//            this.check = "GIOI";
//        }else if (diemTB > 7){
//            this.check = "KHA";
//        }else if (diemTB > 5){
//            this.check = "TB";
//        }else{
//            this.check = "YEU";
//        }
//        
//    }
//    
//    public String toString(){
//        xepLoai();
//        if (id >= 10){
//            return "HS" + String.format("%03d", id) + " " + name + " " + String.format("%.1f", diemTB) + " " + check;
//        }else{
//            return "HS" + String.format("%02d", id) + " " + name + " " + String.format("%.1f", diemTB) + " " + check;
//        }
//    }
    
    // bai 29
//    private String Id;
//    private String name;
//    private String lop;
//    private String email;
//
//    public nhanVien(String Id, String name, String lop, String email) {
//        this.Id = Id;
//        this.name = name;
//        this.lop = lop;
//        this.email = email;
//    }
//
//    public int getId() {
//        String res = Id.subSequence(2, 4).toString();
//        return Integer.parseInt(res);
//    }
//
//    public int getLop() {
//        return lop.charAt(4) - '0';
//    }
//    
//    public String toString(){
//        return Id + " " + name + " " + lop + " " + email;
//    }
}



