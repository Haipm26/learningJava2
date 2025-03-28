    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = 3;
//        switch(n){
//            case 1:
//                System.out.println("mot");
//                break;
//            case 2:
//                System.out.println("hai");
//                break;
//            case 3:
//                System.out.println("ba");
//                break;
//            default:
//                System.out.println("ko phai 1 2 3");
//        }
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = 3;
//        switch (t){
//            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
//                System.out.println("31");
//                break;
//            case 4 : case 6 : case 9 : case 11:
//                System.out.println("30");
//                break;
//            case 2:
//                if (t % 400 == 0 || (t % 4 == 0 && t % 100 != 0)){
//                    System.out.println("29");
//                }else{
//                    System.out.println("28");
//                }
//            default:
//                System.out.println("INVALID");
//        }
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
