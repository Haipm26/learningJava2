/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kethua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Kethua {

    /**
     * @param args the command line arguments
     */
    // bai 2
    
    // bai 2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Student> arr = new ArrayList<>();
//        for (int i = 1; i <= n; i++){
//            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), i, sc.nextLine(), Double.parseDouble(sc.nextLine()));
//            arr.add(a);
//        }
//        Collections.sort(arr, new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getsortedName().compareTo(o2.getsortedName());
//            }
//            
//        });
//        for (Student x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<SinhVien> arr1 = new ArrayList<>();
//        ArrayList<GiangVien> arr2 = new ArrayList<>();
//        for (int i =0 ;i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 2).toString().equals("GV")){
//                GiangVien a = new GiangVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
//                arr2.add(a);
//            }else{
//                SinhVien b = new SinhVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
//                arr1.add(b);
//            }
//        }
//        System.out.println("DANH SACH GIAO VIEN :");
//        for (GiangVien x : arr2){
//            System.out.println(x);
//        }
//        System.out.println("DANH SACH SINH VIEN :");
//        for (SinhVien x : arr1){
//            System.out.println(x);
//        }
//    }
    
    // bai 4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<SinhVien1> arr1 = new ArrayList<>();
//        ArrayList<GiaoVien> arr2 = new ArrayList<>();
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 2).toString().equals("GV")){
//                GiaoVien a = new GiaoVien(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
//                arr2.add(a);
//            }else{
//                SinhVien1 b = new SinhVien1(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
//                arr1.add(b);
//            }
//        }
//        String diaChiCanTim = sc.nextLine();
//        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + diaChiCanTim + " :");
//        for (GiaoVien x : arr2){
//            if (x.getDiaChi().equals(diaChiCanTim)){
//                System.out.println(x);
//            }
//        }
//        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + diaChiCanTim + " :");
//        for (SinhVien1 x : arr1){
//            if (x.getDiaChi().equals(diaChiCanTim)){
//                System.out.println(x);
//            }
//        }
//    }
    
    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<SinhVien2> arr1 = new ArrayList<>();
//        ArrayList<GiaoVien1> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 2).equals("GV")){
//                GiaoVien1 x = new GiaoVien1(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
//                arr2.add(x);
//            }else{
//                SinhVien2 x = new SinhVien2(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
//                arr1.add(x);
//            }  
//        }
//        Collections.sort(arr2, new Comparator<GiaoVien1>(){
//                @Override
//                public int compare(GiaoVien1 o1, GiaoVien1 o2) {
//                    if (o1.getLuong() != o2.getLuong()){
//                        return o2.getLuong() - o1.getLuong();
//                    }else{
//                        return o1.getId().compareTo(o2.getId());
//                    }
//                }
//                
//            });
//        Collections.sort(arr1, new Comparator<SinhVien2>(){
//            @Override
//            public int compare(SinhVien2 o1, SinhVien2 o2) {
//                if (o1.getGpa() < o2.getGpa()){
//                    return 1;
//                    
//                }else if (o1.getGpa() > o2.getGpa()){
//                    return -1;
//                }else{
//                    return o1.getId().compareTo(o2.getId());
//                }
//            }
//            
//        });
//        System.out.println("DANH SACH GIAO VIEN : ");
//        for (GiaoVien1 x : arr2){
//            System.out.println(x);
//        }
//        System.out.println("DANH SACH SINH VIEN : ");
//        for (SinhVien2 x : arr1){
//            System.out.println(x);
//        }
//        
//    }
    
    // bai 6
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<SinhVien3> arr1 = new ArrayList<>();
//        ArrayList<GiaoVien2> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 2).equals("GV")){
//                GiaoVien2 x = new GiaoVien2(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
//                arr2.add(x);
//            }else{
//                SinhVien3 x = new SinhVien3(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
//                arr1.add(x);
//            }
//        }
//        String lopCanTim = sc.nextLine();
//        System.out.println("DANH SACH GIAO VIEN LOP " + lopCanTim + " :");
//        for (GiaoVien2 x : arr2){
//            if (x.getLop().equals(lopCanTim)){
//                System.out.println(x);
//            }
//        }
//        System.out.println("DANH SACH SINH VIEN LOP " + lopCanTim + " :");
//        for (SinhVien3 x : arr1){
//            if (x.getLop().equals(lopCanTim)){
//                System.out.println(x);
//            }
//        }
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<XeMay> arr1 = new ArrayList<>();
//        ArrayList<Oto> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 3).equals("XM")){
//                XeMay a = new XeMay(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr1.add(a);
//            }else{
//                Oto b = new Oto(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr2.add(b);
//            }
//        }
//        String check = sc.nextLine();
//        System.out.println("DANH SACH HANG XE" + check + " :");
//        for (Oto x : arr2){
//            if (x.getHang().equals(check)){
//                System.out.println(x);
//            }
//        }
//        for (XeMay x : arr1){
//            if (x.getHang().equals(check)){
//                System.out.println(x);
//            }
//        }
//    }
    
    // bai 8
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<XeMay> arr1 = new ArrayList<>();
//        ArrayList<Oto> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 3).equals("OTO")){
//                Oto x = new Oto(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr2.add(x);
//            }else{
//                XeMay x = new XeMay(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr1.add(x);
//            }
//        }
//        Collections.sort(arr1, new Comparator<XeMay>(){
//            @Override
//            public int compare(XeMay o1, XeMay o2) {
//                if (o1.getGia() != o2.getGia()){
//                    return o2.getGia() - o1.getGia();
//                }else{
//                    return o1.getId().compareTo(o2.getId());
//                }
//            }
//            
//        });
//        Collections.sort(arr2, new Comparator<Oto>(){
//            @Override
//            public int compare(Oto o1, Oto o2) {
//                if (o1.getGia() != o2.getGia()){
//                    return o2.getGia() - o1.getGia();
//                }else{
//                    return o1.getId().compareTo(o2.getId());
//                }
//            }
//            
//        });
//        System.out.println("DANH SACH OTO :");
//        for (Oto x : arr2){
//            System.out.println(x);
//        }
//        System.out.println("DANH SACH XE MAY :");
//        for (XeMay x : arr1){
//            System.out.println(x);
//        }
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Car> arr1 = new ArrayList<>();
//        ArrayList<Motorbike> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 3).equals("OTO")){
//                Car x = new Car(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr1.add(x);
//            }else{
//                Motorbike x = new Motorbike(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr2.add(x);
//            }
//        }
//        int giaBegin = sc.nextInt();
//        int giaEnd = sc.nextInt();
//        System.out.println("DANH SACH OTO :");
//        for (Car x : arr1){
//            if (x.getGia() > giaBegin && x.getGia() < giaEnd){
//                System.out.println(x);
//            }
//        }
//        System.out.println("DANH SACH XE MAY :");
//        for (Motorbike x : arr2){
//            if (x.getGia() > giaBegin && x.getGia() < giaEnd){
//                System.out.println(x);
//            }
//        }
//        
//    }
    
    
    // bai 10
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Car> arr1 = new ArrayList<>();
//        ArrayList<Motorbike> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String id = sc.nextLine();
//            if (id.subSequence(0, 3).equals("OTO")){
//                Car x = new Car (id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr1.add(x);
//            }else{
//                Motorbike x = new Motorbike(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
//                arr2.add(x);
//            }
//        }
//        String nameCanTim = sc.nextLine();
//        System.out.println("DANH SACH OTO");
//        for (Car x  :arr1){
//            if (x.getName().equals(nameCanTim)){
//                System.out.println(x);
//            }
//        }
//        System.out.println("DANH SACH XE MAY");
//        for (Motorbike x : arr2){
//            if (x.getName().equals(nameCanTim)){
//                System.out.println(x);
//            }
//        }
//    }
    
    // bai 11
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Cylinder> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            Cylinder c = new Cylinder(sc.next(), Double.parseDouble(sc.next()), Double.parseDouble(sc.next()));
//            arr.add(c);
//        }
//        Collections.sort(arr, new Comparator<Cylinder>(){
//            @Override
//            public int compare(Cylinder o1, Cylinder o2) {
//                if (o1.volume() < o2.volume()){
//                    return 1;
//                }else if(o2.volume() < o1.volume()){
//                    return -1;
//                }else{
//                    return o1.getColor().compareTo(o2.getColor());
//                }
//            }
//            
//        });
//        for (Cylinder x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 12
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        ArrayList<Student1> stu = new ArrayList<>();
//        ArrayList<Staff> staf = new ArrayList<>();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            sc.nextLine();
//            Student1 a = new Student1 (sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
//            stu.add(a);
//        }
//        for (int i = 0; i < m; i++){
//            sc.nextLine();
//            Staff b = new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
//            staf.add(b);
//        }
//        Collections.sort(staf, new Comparator<Staff>(){
//            @Override
//            public int compare(Staff o1, Staff o2) {
//                if (o1.getPay() > o2.getPay()){
//                    return -1;
//                }else if (o1.getPay() < o2.getPay()){
//                    return 1;
//                }else{
//                    return o1.getName().compareTo(o2.getName());
//                }
//            }
//            
//        });
//        Collections.sort(stu, new Comparator<Student1>(){
//            @Override
//            public int compare(Student1 o1, Student1 o2) {
//                if (o1.getFee() < o2.getFee()){
//                    return 1;
//                }else if (o1.getFee() > o2.getFee()){
//                    return -1;
//                }else{
//                    return o1.getName().compareTo(o2.getName());
//                }
//            }
//            
//        });
//        System.out.println("Student List :\n");
//        for (Student1 a : stu){
//            System.out.println(a);
//        }
//        System.out.println("Staff List : \n");
//        for (Staff a : staf){
//            System.out.println(a);
//        }
//    }   
    
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<movablePoint> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            movablePoint x = new movablePoint(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
//            int turns = sc.nextInt();
//            arr.add(x.pointAfter(turns));
//        }
//        for (movablePoint x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 14
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Square> s = new ArrayList<>();
//        ArrayList<Rectangle> r = new ArrayList<>();
//        ArrayList<Tron> c = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String check = sc.next();
//            if (check.equals("S")){
//                double side = sc.nextDouble();
//                Square x = new Square(side, side, sc.next(), sc.nextBoolean());
//                s.add(x);
//            }else if (check.equals("C")){
//                double banKinh = sc.nextDouble();
//                Tron x = new Tron(banKinh, sc.next(), sc.nextBoolean());
//                c.add(x);
//            }else{
//                Rectangle hinhChuNhat = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.next(), sc.nextBoolean());
//                r.add(hinhChuNhat);
//            }
//        }
//        System.out.println("Circle :");
//        for (Tron x : c){
//            System.out.println(x);
//        }
//        System.out.println("Rectangle :");
//        for (Rectangle x : r){
//            System.out.println(x);
//        }
//        System.out.println("Square :");
//        for (Square x : s){
//            System.out.println(x);
//        }
//    }
    
    // bai 15
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<Circle1> cir = new ArrayList<>();
//        ArrayList<Rectangle1> rec = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String check = sc.next();
//            if (check.equals("C")){
//                double r = sc.nextDouble();
//                Circle1 x = new Circle1(r);
//                cir.add(x);
//            }else{
//                double width = sc.nextDouble();
//                double length = sc.nextDouble();
//                Rectangle1 x = new Rectangle1(width, length);
//                rec.add(x);
//            }
//        }
//        System.out.println("Circle : ");
//        for (Circle1 x : cir){
//            System.out.println(x);
//        }
//        System.out.println("Rectangle : ");
//        for (Rectangle1 x : rec){
//        System.out.println(x);
//        }
//    }
    
    // bai 16
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        ArrayList<MovablePoint1> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            MovablePoint1 a = new MovablePoint1(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//            int turns = sc.nextInt();
//            sc.nextLine();
//            while (turns-- != 0){
//                String command = sc.nextLine();
//                if (command.equals("Down")){
//                    a.moveDown();
//                }else if (command.equals("Up")){
//                    a.moveUp();
//                }else if (command.equals("Left")){
//                    a.moveLeft();
//                }else{
//                    a.moveRight();
//                }
//            }
//            arr.add(a);
//        }
//        for (MovablePoint1 x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 17
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<MovableCircle> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++){
//            MovablePoint1 x = new MovablePoint1(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//            int r = sc.nextInt();
//            int turns = sc.nextInt();
//            MovableCircle a = new MovableCircle(r, x);
//            sc.nextLine();
//            while(turns-- != 0){
//                String command = sc.nextLine();
//                if (command.equals("Right")){
//                    a.moveRight();
//                }else if (command.equals("Left")){
//                    a.moveLeft();
//                }else if (command.equals("Up")){
//                    a.moveUp();
//                }else{
//                    a.moveDown();
//                }
//            }
//            arr.add(a);
//        }
//        for (MovableCircle x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 18
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<ResizableCircle> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            double r = sc.nextDouble();
            int turns = sc.nextInt();
            ResizableCircle x = new ResizableCircle(r);
            while (turns-- != 0){
                int m = sc.nextInt();
                x.resizable(m);
            }
            arr.add(x);
        }
        for (ResizableCircle x : arr){
            System.out.println(x);
        }
    }
}
