/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
public class Main {
//
//    /**
//     * @param args the command line arguments
//     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        if (s.compar == 1){
            System.out.println("s1 > s2");
        }else{
            System.out.println("s2 > s1");
        }
    }
}


//import java.util.*;
//
//public class Main {
//    public static int[] di = {-1, 0, 1, 0};
//    public static int[] dj = {0, 1, 0, -1};
//    public static char[][] a;
//    public static int n, m;
//    
//    public static int bfs(int startI, int startJ, int endI, int endJ) {
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{startI, startJ, 0}); // {i, j, steps}
//        boolean[][] visited = new boolean[n][m];
//        visited[startI][startJ] = true;
//
//        while (!queue.isEmpty()) {
//            int[] cur = queue.poll();
//            int i = cur[0], j = cur[1], steps = cur[2];
//
//            if (i == endI && j == endJ) return steps; // Found shortest path
//
//            for (int k = 0; k < 4; k++) {
//                int i1 = i + di[k], j1 = j + dj[k];
//
//                if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] == '0' && !visited[i1][j1]) {
//                    queue.add(new int[]{i1, j1, steps + 1});
//                    visited[i1][j1] = true;
//                }
//            }
//        }
//        return -1; // No path found
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        a = new char[n][m];
//
//        for (int i = 0; i < n; i++) {
//            String row = sc.next(); // Read whole row as a string
//            for (int j = 0; j < m; j++) {
//                a[i][j] = row.charAt(j);
//            }
//        }
//
//        int startI = sc.nextInt();
//        int startJ = sc.nextInt();
//        int endI = sc.nextInt();
//        int endJ = sc.nextInt();
//
//        int result = bfs(startI, startJ, endI, endJ);
//        System.out.println(result);
//    }
//}

