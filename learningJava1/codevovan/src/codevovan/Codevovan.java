/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codevovan;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Codevovan {

    /**
     * @param args the command line arguments
     */
    

    
    //Modular Exponentiation Function
//    public static final BigInteger MOD = new BigInteger("1000000007");
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BigInteger n = sc.nextBigInteger();
//        long m = sc.nextLong();
//        BigInteger result = modExp(n, m, MOD);
//        System.out.println(result);
//    }
//
//    public static BigInteger modExp(BigInteger base, long exp, BigInteger mod) {
//        BigInteger result = BigInteger.ONE;
//        while (exp > 0) {
//            if ((exp & 1) == 1) {
//                result = result.multiply(base).mod(mod);
//            }
//            base = base.multiply(base).mod(mod);
//            exp >>= 1;
//        }
//        return result;
//    }
    
    
    // gcd moi
 
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
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        long x = sc.nextLong();
//        long y = sc.nextLong();
//        
//        // Calculate gcd(x, y) directly
//        long gcdXY = gcd(BigInteger.valueOf(x), BigInteger.valueOf(y)).longValue();
//        
//        // The result will be a repeated gcdXY times of string 'a'
//        StringBuilder result = new StringBuilder();
//        for (long i = 0; i < gcdXY; i++) {
//            result.append(a);
//        }
//        
//        System.out.print(result.toString());
//    }
//    
//    public static BigInteger gcd(BigInteger a, BigInteger b) {
//        if (b.equals(BigInteger.ZERO)) {
//            return a;
//        } else {
//            return gcd(b, a.mod(b));
//        }
//    }

    
 
//    import java.math.BigInteger;


    public static int gt(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
            String s = sc.next();
            
            long res = 1;
            for (int i = 0; i < s.length(); i++) {
                res *= gt(s.charAt(i) - '0');
            }
            
            ArrayList<Integer> arr = new ArrayList<>();
            while (res != 1) {
                int tmp = 0;
                for (int i = 2; i <= 9; i++) {
                    if ((gt(i) <= res) && (res % gt(i) == 0)) {
                        arr.add(i);
                        tmp = i;
                        break;
                    }
                }
                res /= gt(tmp);
            }
            
            // Sort in descending order to form the largest number
            arr.sort(Collections.reverseOrder());
            for (int x : arr) {
                System.out.print(x);
            }
            System.out.println();
        }
    


    
    
    
}
