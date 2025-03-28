/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest3;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Contest3 {
    // ham
    // bai 8
    
//    public static boolean checksnt (int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
    
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (checksnt(i)){
//                System.out.print(i * i + " ");
//            }
//        }
//    }
    
    // FIBO SO 3
//    public static void in(long n){
//        if (n == 1){
//            System.out.println("2");
//        }
//        else{
//            long f1 = 1;
//            long f2 = 1;
//            for (int i = 2; i <= 92; i++){
//                long f = f1 + f2;
//                if (f >= n){
//                    System.out.println(f);
//                    return;
//                }
//                f2 = f1;
//                f1 = f;
//            }
//        }
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        in(n);
//    }
    
    
        // LUYEN TAP VIET HAM
//    1
//    public static int checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return 0;
//            }
//        }
//        if (n > 1){
//            return 1;
//        }else{
//            return 0;
//        }
//    }
//    2
//    public static int tongcs(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += (n % 10);
//            n /= 10;
//        }
//        return sum;
//    }
//    3
//    public static int teven(int n){
//        int sum = 0;
//        while (n >= 1){
//            int donvi = n % 10;
//            if (donvi % 2 == 0){
//                sum += donvi;
//            }
//            n /= 10;
//        }
//        return sum;
//    }
//    4
//    public static int tprime(int n){
//        int sum = 0;
//        while (n >= 1){
//            if (checksnt(n % 10) == 1){
//                sum += n % 10;
//            }
//            n /= 10;
//        }
//        return sum;
//    }
//    5
//    public static int reverse(int n){
//        int tmp = 0;
//        while (n >= 1){
//            tmp = tmp * 10 + n % 10;
//            n /= 10;
//        }
//        return tmp;
//    }
//    6
//    public static int numDiv(int n){
//        int cnt = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                ++cnt;
//            }
//            while (n % i == 0){
//            
//                n /= i;
//            }
//        }
//        if (n > 1){
//            ++cnt;
//        }
//        return cnt;
//    }
//    7
//    public static int primeDiv(int n){
//        int ans = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            while(n % i == 0){
//                ans = i;
//                n /= i;
//            }
//        }
//        if (n > 1){
//            ans = n;
//        }
//        return ans;
//    }
//    8
//    public static int check6(int n){
//        while (n >= 1){
//            if (n % 10 == 6){
//                return 1;
//            }
//            n /= 10;
//        }
//        return 0;
//    }
//    9
//    public static long tinhgt(int n){
//        long sum = 0;
//        while (n >= 1){
//            int gt = 1;
//            for (int i = 1; i <= n % 10; i++){
//                gt *= i;
//            }
//            sum += gt;
//            n /= 10;
//        }
//        return sum;
//    }
//    10
//    public static int check2(int n){
//        int dvi = n % 10;
//        while (n >= 1){
//            if (n % 10 != dvi){
//                return 0;
//            }
//            n /= 10;
//        }
//        return 1;
//    }
//    11
//    public static int check3(int n){
//        int dv = n % 10;
//        while (n >= 1){
//            if (n % 10 > dv){
//                return 0;
//            }
//            n /= 10;
//        }
//        return 1;
//    }
//    12
//    public static void in(int n){
//        int pow = 0;
//        int tmp = reverse(n);
//        while (n >= 1){
//            ++pow;
//            n /= 10;
//        }
//        while (tmp >= 10){
//            if (tmp % 10 == 0){
//                tmp /= 10;
//            }else{
//                System.out.print(tmp % 10 + "^" + pow + "+");
//                tmp /= 10;
//            }
//        }
//        System.out.print(tmp + "^" + pow);
//    }
//    
//    public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(checksnt(n));
//        System.out.println(tongcs(n));
//        System.out.println(teven(n));
//        System.out.println(tprime(n));
//        System.out.println(reverse(n));
//        System.out.println(numDiv(n));
//        System.out.println(primeDiv(n));
//        System.out.println(check6(n));
//        if (tongcs(n) % 8 == 0){
//            System.out.println("1");
//        }else{
//            System.out.println("0");
//        }
//        System.out.println(tinhgt(n));
//        System.out.println(check2(n));
//        System.out.println(check3(n));
//        in(n);
    }
    
    
    // bai 1
//    public static boolean checksnt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (checksnt(n)) System.out.println("YES");
//        else System.out.println("FALSE");
//    }
    
    
    // bai 20
//    public static boolean checkcp(long n){
//        for (int i = 0; i <= Math.sqrt(n); i++){
//            if ((long)i  * i == n){
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long  n = sc.nextLong();
//        if (checkcp(n)) System.out.println("YES");
//        else System.out.println("NO");
//    }
    
    // bai 21
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        for (int i = (int)Math.ceil(Math.sqrt(a)); i <= Math.sqrt(b); i++){
//            System.out.print((long)i * i + " ");
//        }
//    }
    
    // Bai 6
//    public static boolean check1(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static boolean check2(int n){
//        while (n >= 1){
//            if (check1(n % 10) == false){
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//    
//    public static boolean check3(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        return check1(sum);
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int cnt = 0;
//        for (int i = a; i <= b; i++){
//            if (check1(i) && check2(i) && check3(i)){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 22
    
//    public static boolean checkcp(long n){
//        for (int i = 0; i <= Math.sqrt(n); i++){
//            if ((long)i * i == n){
//                return true;
//            }
//        }   
//        return false;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        int cnt = 0;
//        for (long i = a; i <= b; i++){
//            if (checkcp(i)){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    //bai 28
//    public static boolean slp(long n){
//        while (n >= 1){
//            if (n % 10 != 0 && n % 10 != 6 && n % 10 != 8){
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        if (slp(n)) System.out.println("YES");
//        else System.out.println("NO");
//    }
    
    // bai 11
    
//    public static int primeDiv(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return i;
//            }
//        }
//        return n;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(primeDiv(n));
//    }
    
    // bai 12
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                int cnt = 0;
//                System.out.print(i);
//                while (n % i == 0){
//                    ++cnt;
//                    n /= i;
//                }
//                System.out.print("^" + cnt);
//                if (n > 1) System.out.println(" * ");
//            }
//        }
//        if (n > 1){
//            System.out.print(n + "^1");
//        }
//    }
    
    
    // Bai 15
    
//    public static boolean sphenic(long n){
//        int cnt = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                ++cnt;
//                n /= i;
//                if (n % i == 0){
//                    return false;
//                }
//            }
//        }
//        if (n > 1){
//            ++cnt;
//        }
//        return cnt == 3;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        if (sphenic(n)) System.out.println("1");
//        else System.out.println("0");
//    }
    
    // bai 16
//    
//    public static boolean checksnt(long n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//////    public static int sumDigit(long n){
//////        int sum = 0;
//////        while (n >= 1){
//////            sum += n % 10;
//////            n /= 10;
//////        }
//////        return sum;
//////    }
//    
//    public static boolean check2(long n){
//        int sum1 = sumDigit(n);
//        int sum2 = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                while (n % i == 0){
//                    sum2 += sumDigit(i);
//                    n /= i;   
//                }
//            }
//        }
//        if (n > 1){
//            sum2 += sumDigit(n);
//        }
//        return sum1 == sum2;
//    }

      // HAY HON KO PHAI TAO 1 HAM DE CHECK SNT

//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        if (!checksnt(n) && check2(n)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    
    // Bai 17
//    public static int lPrimeDiv(int n){
//        int ans = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                while (n % i == 0){
//                    ans = i;
//                    n /= i;
//                }
//            }
//        }
//        if (n > 1){
//            ans = n;
//        }
//        return n;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        while (t-- != 0){
//            int n = sc.nextInt();
//            System.out.println(lPrimeDiv(n));
//        }
//    }
    
    // bai 18
    
//    public static boolean check(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                if (n % (i * i) == 0){
//                    return true;
//                }
//                n /= i;
//            }
//        }
//        return false;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a= sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++){
//            if (check(i)){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // bai 19
    
//    public static boolean check(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                if (n % (i * i) != 0){
//                    return false;
//                }else{
//                    while (n % i == 0){
//                        n /= i;
//                    }
//                }
//            }
//        }
//        return n <= 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++){
//            if (check(i)){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
//     bai 26
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        long tmp = n;
//        long sum = 0;
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                sum += i;
//                if (n / i != i){
//                    sum += n / i;
//                }
//            }
//        }   
//        sum += 1;
//        if (sum == tmp){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // bai 27
    
//    public static boolean check1(int n){
//        int tmp = n;
//        int sum = 0;
//        while (n >= 1){
//            sum = sum * 10 + n % 10;
//            n /= 10;
//        }
//        return sum == tmp;
//    }
//    
//    public static boolean check2(int n){
//        int cnt = 0;
//        if (!check1(n)){
//            return false;
//        }else{
//            for (int i = 2; i <= Math.sqrt(n); i++){
//                if (n % i == 0){
//                    ++cnt;
//                    while (n % i == 0){
//                        n /= i;
//                    }
//                }
//            }
//            if (n > 1){
//                ++cnt;
//            }
//        }
//        return cnt == 3;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int k = 0;
//        for (int i = a; i <= b; i++){
//            if (check2(i)){
//                ++k;
//                System.out.print(i + " ");
//            }
//        }
//        if (k == 0){
//            System.out.println("-1");
//        }
//    }
    
    // bai 29
    
//    public static boolean check1(int n){
//        int tmp = n;
//        int sum = 0;
//        while (n >= 1){
//            sum = sum * 10 + n % 10;
//            n /= 10;
//        }
//        return sum == tmp;
//    }
//    
//    public static boolean check2(int n){
//        while (n >= 1){
//            if (n % 10 == 6){
//                return true;
//            }
//            n /= 10;
//        }
//        return false;
//    }
//    
//    public static boolean check3(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum % 10 == 8;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++){
//            if (check1(i) && check2(i) && check3(i)){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // bai 30
//    
//    public static boolean check1(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static boolean check2(int n){
//        int dv = n % 10;
//        n /= 10;
//        while (n >= 1){
//            if (n % 10 > dv){
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        int cnt = 0;
//        for (int i = 0; i <= n; i++){
//            if (check1(i) && check2(i)){
//                System.out.print(i + " ");
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);
//    }
    
    // bai 35
//    
//    public static long gcd(long a, long b){
//        while (b != 0){
//            long r = a % b;
//            a = b;
//            b = r;
//        }
//        return a;
//    }
//    
//    public static long lcm(long a, long b){
//        return a / gcd(a, b) * b; 
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        System.out.print(gcd(a, b) + " " + lcm(a, b));
//    }
    
    // bai 3
//    public static boolean check1(int n ){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        while (t-- != 0){
//            int n = sc.nextInt();
//            if (check1(n)){
//                System.out.println("YES");
//            }else
//            System.out.println("NO");
//        }
//    }
    
    // bai 8
//    public static boolean check(int n){
//        int cnt = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                ++cnt;
//                if (i != n / i){
//                    ++cnt;
//                }
//            }
//        }
//        return cnt == 3;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        for (int i = 0; i <= n; i++){
//            if (check(i)){
//                System.out.print(i + " ");
//            }
//        }
//    }
    
    // bai 9
//    public static boolean check (long n){
//        int cnt = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                ++cnt;
//                if (i != n / i){
//                    ++cnt;
//                }
//            }
//        }
//        return cnt == 3;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        int cnt = 0;
//        for (long i = 0; i <= n; i++){
//            if (check(i)){
//                ++cnt;
//            }
//        }
//        System.out.println(cnt);  
//    }
    
    // bai 13
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        int p = sc.nextInt();
//        int sum = 0;
//        for (int i = p; i <= n; i *= p){
//            sum += n / i;
//        }
//        System.out.print(sum);
//    }
    
    // bai 14
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        int cnt1 = 0;
//        for (int i = 2; i <= n; i *= 2){
//            cnt1 += n / i;
//        }
//        int cnt2 = 0;
//        for (int i = 5; i <= n; i *= 5){
//            cnt2 += n / i;
//        }
//        int ans = Math.min(cnt1, cnt2);
//        System.out.println(ans);
//    }

// HAY HON
//        long ans = 0;
//        for (i = 5; i <= n; i *= 5){
//            ans += (n / i);
//            ans % 1000000007;
//        }
//        // ko nen de tinh het ans roi moi chia du (se bi tran);
//        return ans % 1000000007;
    
    // bai 63
//    
//    public static long fibo(int n){
//        int f2 = 0;
//        int f1 = 1;
//        if (n == 1){
//            return 0;
//        }else if (n == 2){
//            return 1;
//        }
//        for (int i = 3; i <= 92; i++){
//            int f = (f2 + f1) % 100000007;
//            
//            if (n == i){
//                return f;
//            }
//            f2 = f1;
//            f1 = f;
//        }
//        return -1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        System.out.println(fibo(n));
//    }
//    
    
    // bai 64
//    public static boolean checkfibo(long n){
//        if (n == 1 || n == 0){
//            return true;
//        }else{
//            int f1 = 1;
//            int f2 = 0;
//            for (int i = 3; i <= 92; i++){
//                int f = f1 + f2;
//                if (f == n){
//                    return true;
//                }
//                f1 = f;
//                f2 = f1;
//            }
//        }
//        return false;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        long n = sc.nextLong();
//        if (checkfibo(n)){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//    }
    
    // LUYEN TAP VIET HAM 2
//    public static int check1(int n){
//        int cnt = 0;
//        while (n >= 1){
//            if ((n % 10) % 2 == 0){
//                ++cnt;
//            }
//            n /= 10;
//        }
//        if (cnt % 2 == 1){
//            return 1;
//        }else{
//            return 0;
//        }
//    }
//    
//    public static int check2(int n){
//        int cnt1 = 0;
//        int cnt2 = 0;
//        int tmp1 = n;
//        while (tmp1 >= 1){
//            if ((tmp1 % 10) % 2 == 0){
//                ++cnt1;
//            }else{
//                ++cnt2;
//            }
//            tmp1 /= 10;
//        }
//        if (cnt1 > cnt2) return 1;
//        else return 0;
//    }
//    
//    public static int check3(int n){
//        int dv = n % 10;
//        int last = 0;
//        while (n >= 1){
//            last = n % 10;
//            n /= 10;
//        }
//        if (last == dv) return 1;
//        else return 0;
//    }
//    
//    public static int check4(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        if (sum % 10 == 8){
//            return 1;
//        }else{
//            return 0;
//        }
//    }
//    
//    public static boolean checknt(int n){
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return n > 1;
//    }
//    
//    public static int check5(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        if (checknt(sum)) return 1;
//        else return 0;
//    }
//    
//    public static int check6(int n){
//        if (n == 1){
//            return 1;
//        }
//        while (n >= 10){
//            if ((n % 10 - n % 100 != 1) && (n % 100 - n % 10 != 1)){
//                return 0;
//            }
//        }
//        return 1;
//    }
//    
//    public static int check7(int n){
//        int first = 0;
//        int tmp = n; 
//        while (tmp >= 1){
//            first = tmp % 10;
//            tmp /= 10;
//        }
//        while (n >= 10){
//            if ((n % 10) > first) return 0;
//            n /= 10;
//        }
//        return 1;
//    }
//    
//    public static boolean checkfibo(int n){
//        int f1 = 1;
//        int f2 = 0;
//        if (n == 1 || n == 0) return true;
//        else{
//            for (int i = 3; i <= 92; i++){
//                int f = f1 + f2;
//                if (f == n) return true;
//                f1 = f;
//                f2 =f1;
//            }
//        }
//        return false;
//    }
//    
//    public static int check8(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        if (checkfibo(sum)) return 1;
//        return 0;
//    }
//    
//    public static boolean checktn(int n){
//        int tmp = n;
//        int sum = 0;
//        while (n >= 1){
//            sum = sum * 10 + n % 10;
//            n /= 10;
//        }
//        return sum == tmp;
//    }
//    
//    public static int check9(int n){
//        int sum = 0;
//        while (n >= 1){
//            sum += n % 10;
//            n /= 10;
//        }
//        if (checktn(sum)) return 1;
//        return 0;
//    }
//    
//    public static int check10(int n){
//        while (n >= 1){
//            if (n != 0 && n != 6 && n != 8){
//                return 0;
//            }
//            n /= 10;
//        }
//        return 1;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int t = sc.nextInt();
//        while (t-- != 0){
//            int n = sc.nextInt();
//            System.out.println(check1(n));
//            System.out.println(check2(n));
//            System.out.println(check3(n));
//            System.out.println(check4(n));
//            System.out.println(check5(n));
//            System.out.println(check6(n));
//            System.out.println(check7(n));
//            System.out.println(check8(n));
//            System.out.println(check9(n));
//            System.out.println(check10(n));
//            
//        }
//    }
    
    // bai 7
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long tich = 1;
//        for (int i = 1; i <= n; i++){
//            int a = sc.nextInt();
//            tich *= (a % ((long)Math.pow(10, 9) + 7));
//        }
//        System.out.println(tich % ((long)Math.pow(10, 9) + 7));
//    }
    
    // bai 67
    // co van de ???
    public static int cnt(int p, int x){
        int cnt = 1;
        int dv = p * p;
        while ((dv % 10) != (p % 10)){
            dv *= p;
            ++cnt;
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int p = sc.nextInt();
        int x = sc.nextInt();
        int ans = p;
        int num = (x - 1) % cnt(p, x);
        for (int i = 1; i <= num; i++){
            ans *= p;
        }
        System.out.println(ans % 10);
    }
}
