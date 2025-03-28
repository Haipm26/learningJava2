/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Bai8 {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
////        int []a = new int[100];
//        int n = sc.nextInt();
//        int []a = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            System.out.println(a[i]);
//        }
//        
//    }
    
//    public static boolean checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0) return false;
//        }
//        return n > 1;
//    }
//    
//    public static void doubling(int a[], int n){
//        for (int i = 0; i < n; i++){
//            a[i] *= 2;
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int []a = new int[n];
//        
        // dang 1  Kiểm tra các tính chất của phần tử trong mảng
//        int sum = 0;
//        int cnt = 0;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//            if (checksnt(a[i])){
//                ++cnt;
//                sum += a[i];
//            }
//        }
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        doubling(a, n);
//        for (int x : a){
//            System.out.print(x + " ");
//        }
//    }
        
      // dang 2 Xét mọi cặp phần tử trong mảng
//      int k = sc.nextInt();
//      int cnt = 0;
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = i + 1; j < n; j++){
//                if (i + j == k){
//                    ++cnt;
//                }
//            }
//        }
//        System.out.println(cnt);


    // dang 3 Đếm giá trị, liệt kê giá trị khác nhau, tần suất...
//    for (int i = 0; i < n; i++){
//           int check = 1;
//           for (int j = 0; j < i - 1; j++){
//               if (a[j] == a[i]){
//                   check = 0;
//                   break;
//               }
//           }
//           if (check == 1){
//               System.out.print(a[i] + " ");
//           }
//       }



        // Dạng 4 : Mảng đánh dấu
//        int[] cnt = new int [1000000];
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++){
//            cnt[a[i]] = 1;
//        }
//        for (int i = 0; i < 1000000; i++){
//            if (cnt[i] == 1){
//                System.out.print(i + " ");
//            }
//        }
//        for (int i = 0; i < n; i++){
//            a[i] = sc.nextInt();
//         }
//       // Arrays.sort(a);
//       Arrays.sort(a, 2, 5); 
//       // sort tu i = 2 den 4 
//        for (int i = 0; i < n; i++){
//            System.out.println(a[i] + " ");
//        }
//    }
    // muon sap xep giam dan hoac theo tieu chi gi do ... phai dung comparator
    
    public static int tongcs(int n){
        int sum = 0;
        while (n >= 1){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Integer []a = new Integer [n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (tongcs(o1) < tongcs(o2)){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        for (int x : a){
            System.out.print(x + " ");
        }
    }
   
}
