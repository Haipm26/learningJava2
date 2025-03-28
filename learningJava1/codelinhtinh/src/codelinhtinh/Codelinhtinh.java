/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codelinhtinh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Codelinhtinh {


    public static int binarySearch(ArrayList<Account> arr, String s) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getStk().equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Account x = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
            arr.add(x);
        }

        int t = Integer.parseInt(sc.nextLine());
        while (t-- != 0) {
            String check = sc.nextLine();
            if (check.equals("deposit")) {
                String x = sc.nextLine();
                long y = Long.parseLong(sc.nextLine());
                int X = binarySearch(arr, x);
                if (X != -1) {
                    arr.get(X).setOdd(y + arr.get(X).getOdd());
                }
            } else if (check.equals("withdraw")) {
                String x = sc.nextLine();
                long y = Long.parseLong(sc.nextLine());
                int X = binarySearch(arr, x);
                if (X != -1 && arr.get(X).getOdd() >= y) {
                    arr.get(X).setOdd(arr.get(X).getOdd() - y);
                }
            } else if (check.equals("transfer")) {
                String x = sc.nextLine();
                String y = sc.nextLine();
                int X = binarySearch(arr, x);
                int Y = binarySearch(arr, y);
                long q = Long.parseLong(sc.nextLine());
                if (X != -1 && Y != -1 && arr.get(X).getOdd() >= q) {
                    arr.get(X).setOdd(arr.get(X).getOdd() - q);
                    arr.get(Y).setOdd(arr.get(Y).getOdd() + q);
                }
            }
        }

        for (Account x : arr) {
            System.out.println(x);
        }

        sc.close();
    }





}
