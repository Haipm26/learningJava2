package main;

import java.util.Scanner;

/**
 *
 * @author Pham Minh Hai
 */
//public class Main {
//
//    /**
//     * @param args the command line arguments
//     */
import java.util.*;

public class RescueTangSeng {
    public static int[] di = {-1, 0, 1, 0};  // Directions for row movement
    public static int[] dj = {0, 1, 0, -1};  // Directions for column movement
    public static char[][] a;
    public static int n, m;

    public static int bfs(int startI, int startJ, int endI, int endJ) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startI, startJ, 0}); // {row, column, steps}
        boolean[][] visited = new boolean[n][m];
        visited[startI][startJ] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int i = cur[0], j = cur[1], steps = cur[2];

            if (i == endI && j == endJ) return steps; // Found shortest path

            for (int k = 0; k < 4; k++) {
                int i1 = i + di[k], j1 = j + dj[k];

                if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] != '1' && !visited[i1][j1]) {
                    queue.add(new int[]{i1, j1, steps + 1});
                    visited[i1][j1] = true;
                }
            }
        }
        return -1; // No path found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new char[n][m];

        int startI = -1, startJ = -1, endI = -1, endJ = -1;

        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = row.charAt(j);
                if (a[i][j] == 'S') {
                    startI = i;
                    startJ = j;
                } else if (a[i][j] == 'E') {
                    endI = i;
                    endJ = j;
                }
            }
        }

        int result = bfs(startI, startJ, endI, endJ);
        System.out.println(result);
    }
}

