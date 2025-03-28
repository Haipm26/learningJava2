/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sapxeptimkiemj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class SapXepTimKiemj {

    public static int cntEven(int n){
        int cnt = 0;
        while (n >= 1){
            if (n % 2 == 0){
                ++cnt;
            }
            n /= 10;
        }
        return cnt;
    }
    
    public static int cntOdd(int n){
        int cnt = 0;
        while (n >= 1){
            if (n % 2 == 1){
                ++cnt;
            }
            n /= 10;
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Integer []a = new Integer[n];
        Integer []b = new Integer[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (cntEven(o1) > cntEven(o2)){
                    return 1;
                }else if(cntEven(o1) < cntEven(o2)){
                    return -1;
                }else{
                    return o1 - o2;
                }
            }
            
        });
        for (int x : a){
            System.out.print(x + " ");
        }
        Arrays.sort(b, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return cntOdd(o1) - cntOdd(o2);
            }
        });
        
        for (int x : b){
           System.out.print(x + " "); 
        }
    }
    
}
