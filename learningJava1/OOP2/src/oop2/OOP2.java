/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class OOP2 {

    /**
     * @param args the command line arguments
     */
    
    // bai 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Book> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String nameBook = sc.nextLine();
//            double priceBook = sc.nextDouble();
//            int qty = sc.nextInt();
//            sc.nextLine();
//            Author a = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0));
//            Book b = new Book(nameBook, a, priceBook, qty);
//            arr.add(b);
//                    
//        }
//        Collections.sort(arr, new Comparator<Book>(){
//            @Override
//            public int compare(Book o1, Book o2) {
//                if (o1.getPrice() < o2.getPrice()){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//            
//        });
//        for (Book x : arr){
//            System.out.print(x);
//        }
//    }
    
    // bai 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Account> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            Account x = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            arr.add(x);
//        }
//        int q = sc.nextInt();
//        sc.nextLine();
//        while (q-- != 0){
//            String tenDangNhap = sc.nextLine();
//            String matKhau = sc.nextLine();
//            int check = 0;
//            for (Account x : arr){
//                if (tenDangNhap.equals(x.getUsername()) && matKhau.equals(x.getPassword())){
//                    System.out.println("LOGIN SUCCESSFUL");
//                    check = 1;
//                }
//            }
//            if (check == 0){
//                System.out.println("LOGIN FAILED");
//            }
//        }
//    }
    
    // bai 2 cach 1 van dungngngngngng
    
////    public static int binarySearch(ArrayList<Account> arr, String s){
////        int l = 0; int r = arr.size() - 1;
////        while (l <= r){
////            int m = (l + r) / 2;
////            if (arr.get(m).getStk().equals(s)){
////                return m;
////            }else if(arr.get(m).getStk().compareTo(s) > 0){
////                r = m - 1;
////            }else{
////                l = m + 1;
////            }
////        }
////        return -1;
////    }
//    
//    public static int binarySearch(ArrayList<Account> arr, String s){
//        for (int i = 0; i < arr.size(); i++){
//            if (arr.get(i).getStk().equals(s)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        ArrayList<Account> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < n; i++){
//            Account x = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
//            arr.add(x);
//        }
//////        Collections.sort(arr, new Comparator<Account>(){
//////            @Override
//////            public int compare(Account o1, Account o2) {
//////                return o1.getStk().compareTo(o2.getStk());
//////            }
//////            
//////        });
//        int t = sc.nextInt();
//        sc.nextLine();
//        while (t-- != 0){
//            String check = sc.nextLine();
//            if (check.equals("deposit")){
//                String x = sc.next();
//                long y = sc.nextLong();
//                sc.nextLine();
//                int X = binarySearch(arr, x);
//                arr.get(X).setOdd(y + arr.get(X).getOdd());
//            }
//            else if (check.equals("withdraw")){
//                String x = sc.next();
//                long y = sc.nextLong();
//                sc.nextLine();
//                int X = binarySearch(arr, x);
//                arr.get(X).setOdd(arr.get(X).getOdd() - y);
//            }
//            else{
//                String x = sc.next();
//                String y = sc.next();
//                int X = binarySearch(arr, x);
//                int Y = binarySearch(arr, y);
//                long q = sc.nextLong();
//                sc.nextLine();
//                arr.get(X).setOdd(arr.get(X).getOdd() - q);
//                arr.get(X).setOdd(arr.get(X).getOdd() + q);
//            }
//        }
//                for (Account x : arr){
//                    System.out.println(x);
//                }
//    }
    
   
    
    // cach hay hon cach kia van dung nhung ma lang nhang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        Account[] a = new Account[n];
//        for (int i = 0; i < n; i++){
//            sc.nextLine();
//            a[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
//        }
//        int q = sc.nextInt();
//        while (q-- != 0){
//            sc.nextLine();
//            String check = sc.nextLine();
//            System.out.println(check);
//            if (check.equals("withdraw")){
//                String soTk = sc.next();
//                int money = sc.nextInt();
//                int pos = Account.findPos(a, soTk);
//                a[pos].withdraw(money);
//            }
//            else if (check.equals("deposit")){
//                String soTK = sc.next();
//                int money = sc.nextInt();
//                int pos = Account.findPos(a, soTK);
//                a[pos].deposit(money);
//            }else{
//                String soTk1 = sc.next();
//                String soTk2 = sc.next();
//                int money = sc.nextInt();
//                int pos1 = Account.findPos(a, soTk1);
//                int pos2 = Account.findPos(a, soTk2);
//                if (a[pos1].getOdd() - 50000 >= money){ 
//                    a[pos1].withdraw(money);
//                    a[pos2].deposit(money);
//                }
//            }
//        }
//        for (int i = 0; i < n; i++){
//            System.out.println(a[i]);
//        }
//    }
    
    
    // bai 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stat x = new Stat(sc.nextLine(), sc.nextLine(), sc.nextLine());
//        int n = sc.nextInt();
//        while (n-- != 0){
//            String check = sc.next();
//            if (check.equals("witch")){
//                int chiSo = sc.nextInt();
//                x.witch(chiSo);
//                sc.nextLine();
//            }else if (check.equals("soldier")){
//                int chiSo = sc.nextInt();
//                x.soldier(chiSo);
//                sc.nextLine();
//            }else if (check.equals("pea")){
//                x.pea();
//            }else{
//                x.mushroom();
//            }
//            System.out.println(x);
//        }
//    }
    
    // bai 4 chua du du kien
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//    }
    
    // bai 6
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        MyTime x = new MyTime(sc.nextLine());
//        System.out.println(x.nextHour());
//        System.out.println(x.nextMin());
//        System.out.println(x.nextSec());
//        System.out.println(x.prevHour());
//        System.out.println(x.prevMin());
//        System.out.println(x.prevSec());
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//         ArrayList<Invoice> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            String redu = sc.nextLine();
//            String s = sc.nextLine();
//            String []id = s.split(" ");
//            int Id = Integer.parseInt(id[3]);
//            String name = "";
//            String s2 = sc.nextLine();
//            String []tmp = s2.split(" ");
//            name += tmp[3] + " " + tmp[4];
//            String s3 = sc.nextLine();
//            String []tmp2 = s3.split(" ");
//            int discount = Integer.parseInt(tmp2[2]);
//            Customer x = new Customer(Id, name, discount);
//            String s4 = sc.nextLine();
//            String []tmp3 = s4.split(" ");
//            int invoiceId = Integer.parseInt(tmp3[3]);
//            String s5 = sc.nextLine();
//            String []tmp4 = s5.split(" ");
//            double amount = Double.parseDouble(tmp4[2]);
//            Invoice a = new Invoice(invoiceId, x, amount);
//            arr.add(a);
//        }
//        Collections.sort(arr, new Comparator<Invoice>(){
//            @Override
//            public int compare(Invoice o1, Invoice o2) {
//                if (o1.amountAfterDiscount() < o2.amountAfterDiscount()){
//                    return 1;
//                }else if (o1.amountAfterDiscount() > o2.amountAfterDiscount()){
//                    return -1;
//                }else{
//                    return o1.getCustomer().getId() - o2.getCustomer().getId();
//                }
//            }
//            
//        });
//        for (Invoice x : arr){
//            System.out.println(x);
//        }
//    }
    
    // bai 8
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int customerId = Integer.parseInt(sc.nextLine().substring(14));
//        String name = sc.nextLine().substring(12);
//        char gender = sc.nextLine().charAt(9);
//        Customer x = new Customer(customerId, name, gender);
//        int accountId = Integer.parseInt(sc.nextLine().substring(13));
//        String balance1 = sc.nextLine();
//        double balance = Double.parseDouble(balance1.subSequence(10, balance1.length() - 2).toString());
//        Account ass = new Account(accountId, x, balance);
//        sc.nextLine();
//        int n = sc.nextInt();
//        sc.nextLine();
//        while (n-- != 0){
//            String check = sc.nextLine();
//            String []a = check.split(" ");
//            if (a[0].equals("withdraw")){
//                ass.withdraw(Double.parseDouble(a[1]));
//            }else{
//                ass.deposit(Double.parseDouble(a[1]));
//            }
//        }
//        System.out.println("-------------------");
//        System.out.println(ass);
//    }
    
    // bai 9
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        ArrayList<Book> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++){
//            sc.nextLine();
//            String nameBook = sc.nextLine();
//            double price = sc.nextDouble();
//            int qty = sc.nextInt();
//            int m = sc.nextInt();
//            sc.nextLine();
//            Author[] a = new Author[m];
//            for (int j = 0; j < m; j++){
//                String authorName = sc.nextLine();
//                String email = sc.nextLine();
//                char gender = sc.nextLine().charAt(0);
//                Author b = new Author (authorName, email, gender);
//                a[j] = b;
//            }
//            Book c = new Book(nameBook, a, price, qty, m);
//            arr.add(c);
//        }
//        
//        Collections.sort(arr, new Comparator<Book>(){
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        
//    });
//        for (Book d : arr){
//            d.display(d.getN());
//        }
//    }
    
    // bai 10
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            int id = Integer.parseInt(sc.nextLine().substring(2));
            String name = sc.nextLine();
            String lop = sc.nextLine();
            int m = sc.nextInt();
            sc.nextLine();
            MonHoc []a = new MonHoc[m];
            for (int j = 0; j < m; j++){
                String nameMon = sc.nextLine();
                int stc = sc.nextInt();
                double diem = sc.nextDouble();
                MonHoc b = new MonHoc(nameMon, stc, diem);
                a[j] = b;
                sc.nextLine();
            }
            SinhVien d = new SinhVien (id, name, lop, a, m);
            arr.add(d);
            }
             Collections.sort(arr, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.gpa() < o2.gpa()){
                    return 1;
                }else if (o1.gpa() > o2.gpa()){
                    return -1;
                }else{
                    return o1.getId() - o2.getId();
                }
            }
        });
        for (SinhVien x : arr){
            System.out.println(x);
        }
    }
}
